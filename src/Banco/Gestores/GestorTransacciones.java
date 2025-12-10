package Banco.Gestores;
import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;

import java.util.ArrayList;


public class GestorTransacciones {
    private ArrayList<Transaccion> listaTransacciones;
    private int contadorIdTransaccion;
    private GestorCuentas gCuentas;
    private GestorClientes gClientes;
    private GestorTitularidades gTitularidades;

    public GestorTransacciones(GestorCuentas gCuentas, GestorClientes gClientes, GestorTitularidades gTitularidades) {
        this.gCuentas = gCuentas;
        this.gClientes = gClientes;
        this.gTitularidades = gTitularidades;
        this.listaTransacciones = new ArrayList<>();
        this.contadorIdTransaccion = 1;
    }

    // ========== DEPÓSITO ==========
    public Deposito procesarDeposito(Usuario usuarioActual, String numeroCuenta, String monto, String dniCliente, String claveCuenta) throws BancoException {
        
        // Validar permisos
        if (!(usuarioActual instanceof Cliente) && 
            !(usuarioActual instanceof Empleado) && 
            !(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Usuario no autorizado para realizar depósitos");
        }

        // Validar y parsear datos
        int numCuenta = validarStringNumericoInt(numeroCuenta);
        double montoDeposito = validarStringNumericoDouble(monto);
        int dniCl = validarStringNumericoInt(dniCliente);
        int clave = validarStringNumericoInt(claveCuenta);

        if (numCuenta == -1) {
            throw new BancoException.ValidacionException("Número de cuenta debe ser numérico");
        }
        if (montoDeposito <= 0) {
            throw new BancoException.ValidacionException("El monto debe ser mayor a 0");
        }
        if (dniCl == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }
        if (clave == -1 || clave < 1000 || clave > 9999) {
            throw new BancoException.ValidacionException("La clave debe tener 4 dígitos");
        }

        // Buscar cuenta y cliente
        Cuenta cuenta = gCuentas.buscarCuenta(numCuenta);
        if (cuenta == null) {
            throw new BancoException.RecursoNoEncontradoException("Cuenta no encontrada");
        }

        Cliente cliente = gClientes.buscarCliente(dniCl);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no encontrado");
        }

        // Validar clave
        if (cuenta.getClave() != clave) {
            throw new BancoException.CredencialesInvalidasException("Clave incorrecta");
        }

        // Validar titularidad
        Titularidad titularidad = gTitularidades.buscarTitularidad(cliente, cuenta);
        if (titularidad == null) {
            throw new BancoException.PermisosDenegadosException("El cliente no es titular de esta cuenta");
        }

        // Validar permisos específicos por tipo de usuario
        if (usuarioActual instanceof Cliente) {
            Cliente clienteActual = (Cliente) usuarioActual;
            if (clienteActual.getDni() != cliente.getDni()) {
                throw new BancoException.PermisosDenegadosException("Solo puedes depositar en tus propias cuentas");
            }
        }

        // Procesar depósito
        Deposito deposito;
        if (usuarioActual instanceof Empleado) {
            deposito = new Deposito(cliente, (Empleado) usuarioActual, cuenta, montoDeposito, contadorIdTransaccion);
        } else {
            deposito = new Deposito(cliente, cuenta, montoDeposito, contadorIdTransaccion);
        }

        deposito.procesar();
        cliente.añadirTransaccion(deposito);
        cuenta.añadirTransaccion(deposito);
        listaTransacciones.add(deposito);
        contadorIdTransaccion++;

        return deposito;
    }

    // ========== RETIRO ==========
    public Retiro procesarRetiro(Usuario usuarioActual, String numeroCuenta, String monto, 
                                 String dniCliente, String claveCuenta) throws BancoException {
        
        // Validar permisos
        if (!(usuarioActual instanceof Cliente) && 
            !(usuarioActual instanceof Empleado) && 
            !(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Usuario no autorizado para realizar retiros");
        }

        // Validar y parsear datos
        int numCuenta = validarStringNumericoInt(numeroCuenta);
        double montoRetiro = validarStringNumericoDouble(monto);
        int dniCl = validarStringNumericoInt(dniCliente);
        int clave = validarStringNumericoInt(claveCuenta);

        if (numCuenta == -1) {
            throw new BancoException.ValidacionException("Número de cuenta debe ser numérico");
        }
        if (montoRetiro <= 0) {
            throw new BancoException.ValidacionException("El monto debe ser mayor a 0");
        }
        if (dniCl == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }
        if (clave == -1 || clave < 1000 || clave > 9999) {
            throw new BancoException.ValidacionException("La clave debe tener 4 dígitos");
        }

        // Buscar cuenta y cliente
        Cuenta cuenta = gCuentas.buscarCuenta(numCuenta);
        if (cuenta == null) {
            throw new BancoException.RecursoNoEncontradoException("Cuenta no encontrada");
        }

        Cliente cliente = gClientes.buscarCliente(dniCl);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no encontrado");
        }

        // Validar clave
        if (cuenta.getClave() != clave) {
            throw new BancoException.CredencialesInvalidasException("Clave incorrecta");
        }

        // Validar titularidad
        Titularidad titularidad = gTitularidades.buscarTitularidad(cliente, cuenta);
        if (titularidad == null) {
            throw new BancoException.PermisosDenegadosException("El cliente no es titular de esta cuenta");
        }

        // Validar saldo suficiente
        if (cuenta.getSaldo() < montoRetiro) {
            throw new BancoException.SaldoInsuficienteException(
                "Saldo insuficiente. Disponible: S/" + String.format("%.2f", cuenta.getSaldo())
            );
        }

        // Validar permisos específicos
        if (usuarioActual instanceof Cliente) {
            Cliente clienteActual = (Cliente) usuarioActual;
            if (clienteActual.getDni() != cliente.getDni()) {
                throw new BancoException.PermisosDenegadosException("Solo puedes retirar de tus propias cuentas");
            }
        }

        // Procesar retiro
        Retiro retiro;
        if (usuarioActual instanceof Empleado) {
            retiro = new Retiro(cliente, (Empleado) usuarioActual, cuenta, montoRetiro, contadorIdTransaccion, clave);
        } else {
            retiro = new Retiro(cliente, null, cuenta, montoRetiro, contadorIdTransaccion, clave);
        }

        retiro.procesar();
        cliente.añadirTransaccion(retiro);
        cuenta.añadirTransaccion(retiro);
        listaTransacciones.add(retiro);
        contadorIdTransaccion++;

        return retiro;
    }

    // ========== TRANSFERENCIA ==========
    public Transferencia procesarTransferencia(Usuario usuarioActual, String numeroCuentaOrigen, String numeroCuentaDestino, String monto, String dniCliente, String claveCuenta) throws BancoException {
        
        

        // Validar y parsear datos
        int numCuentaOrigen = validarStringNumericoInt(numeroCuentaOrigen);
        int numCuentaDestino = validarStringNumericoInt(numeroCuentaDestino);
        double montoTransf = validarStringNumericoDouble(monto);
        int dniCl = validarStringNumericoInt(dniCliente);
        int clave = validarStringNumericoInt(claveCuenta);

        if (numCuentaOrigen == -1 || numCuentaDestino == -1) {
            throw new BancoException.ValidacionException("Los números de cuenta deben ser numéricos");
        }
        if (numCuentaOrigen == numCuentaDestino) {
            throw new BancoException.ValidacionException("No puedes transferir a la misma cuenta");
        }
        if (montoTransf <= 0) {
            throw new BancoException.ValidacionException("El monto debe ser mayor a 0");
        }
        if (dniCl == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }
        if (clave == -1 || clave < 1000 || clave > 9999) {
            throw new BancoException.ValidacionException("La clave debe tener 4 dígitos");
        }

        // Buscar cuentas y cliente
        Cuenta cuentaOrigen = gCuentas.buscarCuenta(numCuentaOrigen);
        Cuenta cuentaDestino = gCuentas.buscarCuenta(numCuentaDestino);
        
        if (cuentaOrigen == null || cuentaDestino == null) {
            throw new BancoException.RecursoNoEncontradoException("Una o ambas cuentas no existen");
        }

        Cliente cliente = gClientes.buscarCliente(dniCl);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no encontrado");
        }

        // Validar clave
        if (cuentaOrigen.getClave() != clave) {
            throw new BancoException.CredencialesInvalidasException("Clave incorrecta");
        }

        // Validar titularidad
        Titularidad titularidadOrigen = gTitularidades.buscarTitularidad(cliente, cuentaOrigen);
        if (titularidadOrigen == null) {
            throw new BancoException.PermisosDenegadosException("El cliente no es titular de la cuenta origen");
        }

        // Validar saldo
        if (cuentaOrigen.getSaldo() < montoTransf) {
            throw new BancoException.SaldoInsuficienteException(
                "Saldo insuficiente. Disponible: S/" + String.format("%.2f", cuentaOrigen.getSaldo())
            );
        }
        
        
        // Procesar transferencia
        Transferencia transferencia;
        if (usuarioActual instanceof Cliente) {
            
            transferencia = new Transferencia((Cliente) usuarioActual, cuentaOrigen, cuentaDestino, montoTransf, contadorIdTransaccion);
        }
        
        else  {
            transferencia = new Transferencia(cliente, (Empleado) usuarioActual, cuentaOrigen, cuentaDestino, montoTransf, contadorIdTransaccion);
        }

        transferencia.procesar();
        cliente.añadirTransaccion(transferencia);
        cuentaOrigen.añadirTransaccion(transferencia);
        cuentaDestino.añadirTransaccion(transferencia);
        listaTransacciones.add(transferencia);
        contadorIdTransaccion++;

        return transferencia;
    }

    // ========== CONSULTAR MOVIMIENTOS DE CUENTA ==========
    public ArrayList<Transaccion> obtenerMovimientosCuenta(Usuario usuarioActual, String numeroCuenta, 
                                                           String dniCliente) throws BancoException {
        int numCuenta = validarStringNumericoInt(numeroCuenta);
        int dniCl = validarStringNumericoInt(dniCliente);

        if (numCuenta == -1) {
            throw new BancoException.ValidacionException("Número de cuenta debe ser numérico");
        }
        if (dniCl == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }

        Cuenta cuenta = gCuentas.buscarCuenta(numCuenta);
        if (cuenta == null) {
            throw new BancoException.RecursoNoEncontradoException("Cuenta no encontrada");
        }

        Cliente cliente = gClientes.buscarCliente(dniCl);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no encontrado");
        }

        // Validar permisos
        if (usuarioActual instanceof Cliente) {
            Cliente clienteActual = (Cliente) usuarioActual;
            if (clienteActual.getDni() != cliente.getDni()) {
                throw new BancoException.PermisosDenegadosException("Solo puedes ver tus propios movimientos");
            }
        }

        // Validar titularidad
        Titularidad titularidad = gTitularidades.buscarTitularidad(cliente, cuenta);
        if (titularidad == null) {
            throw new BancoException.PermisosDenegadosException("El cliente no es titular de esta cuenta");
        }

        return new ArrayList<>(cuenta.getTransacciones());
    }

    // ========== CONSULTAR MOVIMIENTOS DE CLIENTE ==========
    public ArrayList<Transaccion> obtenerMovimientosCliente(Usuario usuarioActual, 
                                                            String dniCliente) throws BancoException {
        int dni = validarStringNumericoInt(dniCliente);

        if (dni == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }

        Cliente cliente = gClientes.buscarCliente(dni);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no encontrado");
        }

        // Validar permisos
        if (usuarioActual instanceof Cliente) {
            if (usuarioActual.getDni() != cliente.getDni()) {
                throw new BancoException.PermisosDenegadosException("Solo puedes ver tus propios movimientos");
            }
        }

        return new ArrayList<>(cliente.getTransaccionesCliente());
    }

    // ========== VER TODAS LAS TRANSACCIONES (Solo Admin) ==========
    public ArrayList<Transaccion> obtenerTodasTransacciones(Usuario usuarioActual) throws BancoException {
        if (!(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Solo administradores pueden ver todas las transacciones");
        }

        return new ArrayList<>(listaTransacciones);
    }

    // ========== MÉTODOS AUXILIARES PRIVADOS ==========
    
    private int validarStringNumericoInt(String numero) {
        try {
            return Integer.parseInt(numero.trim());
        } catch (Exception e) {
            return -1;
        }
    }

    private double validarStringNumericoDouble(String numero) {
        try {
            double valor = Double.parseDouble(numero.trim());
            return valor > 0 ? valor : -1;
        } catch (Exception e) {
            return -1;
        }
    }

    // ========== GETTERS ==========
    
    public ArrayList<Transaccion> getListaTransacciones() {
        return new ArrayList<>(listaTransacciones);
    }

    public int getContadorIdTransaccion() {
        return contadorIdTransaccion;
    }
}