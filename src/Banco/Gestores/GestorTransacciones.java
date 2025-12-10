package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;
import Banco.BD.ClasesDAO.*;

import java.util.ArrayList;


public class GestorTransacciones {
    private GestorCuentas gCuentas;
    private GestorClientes gClientes;
    private GestorTitularidades gTitularidades;
    private TransaccionesDAO transaccionDAO;
    public GestorTransacciones(GestorCuentas gCuentas, GestorClientes gClientes, GestorTitularidades gTitularidades) {
        this.gCuentas = gCuentas;
        this.gClientes = gClientes;
        this.gTitularidades = gTitularidades;
        this.transaccionDAO = new TransaccionesDAO();
    }

    // ========== DEPÓSITO ==========
    public Deposito procesarDeposito(Usuario usuarioActual, String numeroCuenta, String monto, String dniCliente, String claveCuenta) throws Exception {

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
        
        Deposito deposito = new Deposito(cliente, (Empleado) usuarioActual, cuenta, montoDeposito);
        
        transaccionDAO.procederTransaccion(deposito);

        return deposito;
    }

    // ========== RETIRO ==========
    public Retiro procesarRetiro(Usuario usuarioActual, String numeroCuenta, String monto, String dniCliente, String claveCuenta) throws Exception {

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

        // Procesar retiro
        Retiro retiro = new Retiro((Empleado) usuarioActual, cliente, cuenta, montoRetiro);
        
        transaccionDAO.procederTransaccion(retiro);

        return retiro;
    }

    // ========== TRANSFERENCIA ==========
    public Transferencia procesarTransferencia(Usuario usuarioActual, String numeroCuentaOrigen, String numeroCuentaDestino, String monto, String dniCliente, String claveCuenta) throws Exception {

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
            transferencia = new Transferencia((Cliente) usuarioActual, cuentaOrigen, cuentaDestino, montoTransf);
        }
        else  {
            transferencia = new Transferencia(cliente, (Empleado) usuarioActual, cuentaOrigen, cuentaDestino, montoTransf);
        }

        transaccionDAO.procederTransaccion(transferencia);

        return transferencia;
    }

    
    /*
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
    // ========== GETTERS ==========
    
    public ArrayList<Transaccion> getListaTransacciones() {
        return new ArrayList<>(listaTransacciones);
    }
    
    */

    
    
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

    

}