package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Banco.BD.ClasesDAO.*;



public class GestorClientes {
    
    ClienteDAO clienteDAO;
            
    public GestorClientes() {
        clienteDAO = new  ClienteDAO();
    }

    
    // -- METODO PARA REGISTRAR CLIENTE --
    public Cliente registrarCliente(String nombres, String dni, String edad, String correo, String contraseña) throws Exception {

        if (!validarStringNoVacio(nombres)) {
            throw new BancoException.ValidacionException("Nombres no deben estar vacios");
        }

        int dniCliente = validarStringNumericoInt(dni);
        int edadCliente = validarStringNumericoInt(edad);

        if (dniCliente == -1 || edadCliente == -1) {
            throw new BancoException.ValidacionException("Formato de DNI y EDAD tienen que ser numeros");
        }
        if (dniCliente < 10000000 || dniCliente > 99999999) {
            throw new BancoException.ValidacionException("Formato de DNI debe tener 8 numeros");
        }
        if (buscarCliente(dniCliente) != null) {
            throw new BancoException.DuplicadoException("DNI ingresado ya esta asociado a un Cliente existente");
        }
        if (edadCliente < 18 || edadCliente > 120) {
            throw new BancoException.ValidacionException("Edad no valida, debes ser mayor de edad");
        }
        if (!validarStringNoVacio(correo)) {
            throw new BancoException.ValidacionException("Correo ingresado no debe ser vacio");
        }
        if (buscarCliente(correo) != null) {
            throw new BancoException.DuplicadoException("Correo ya registrado anteriormente");
        }
        if (!esEmailValido(correo)) {
            throw new BancoException.ValidacionException("Formato de correo no correspondiente (ejemplo@dominio.com)");
        }
        if (!validarStringNoVacio(contraseña) || !validarSinEspaciosVacios(contraseña)) {
            throw new BancoException.ValidacionException("Formato de contraseña no valido");
        }

        Cliente cliente = new Cliente(nombres, dniCliente, edadCliente, correo, contraseña);
        
        try {
            clienteDAO.insertar(cliente);
        } catch (Exception e) {
            throw e;
        }
        
        System.out.println("Se agrego cliente");
        return cliente;
    }

    
    
    // -- METODO PARA BUSCAR CLIENTE --
    public Cliente mostrarClienteDni(String dni) throws Exception {

        int dniCliente = validarStringNumericoInt(dni);

        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("DNI ingresado solo debe contener numeros");
        }

        Cliente cliente = clienteDAO.selectPorDni(dniCliente);
        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no Registrado");
        }

        return cliente;
    }
    
    // -- METODO PARA BUSCAR CLIENTE --
    public Cliente mostrarClienteCorreo(String correo) {
        return clienteDAO.selectPorCorreo(correo);
    }
    
    
    // -- ELIMINAR CLIENTE --
    public boolean eliminarCliente(String dni) throws BancoException {

        int dniCliente = validarStringNumericoInt(dni);

        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("DNI numeros");
        }

        Cliente cliente = clienteDAO.deleteCliente(dniCliente);

        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no registrado");
        }

        return true;
    }

    
    
    // -- MOSTRAR CLIENTES --

    
    
    
    
    // Metodos del Gestor
    
    public Cliente buscarCliente(int dni) {
        return clienteDAO.selectPorDni(dni);
    }
    
    public Cliente buscarCliente(String correo) {
        return clienteDAO.selectPorCorreo(correo);
    }

    public int validarStringNumericoInt(String numero) {
        int numeroParseado;
        try {
            numeroParseado = Integer.parseInt(numero);
            return numeroParseado;
        } catch (Exception e) {
            return -1;
        }
    }

    public boolean validarStringNoVacio(String palabra) {
        return !(palabra == null || palabra.trim().isEmpty());
    }

    public boolean validarFormatoCorreo(String correo) {
        if (validarSinEspaciosVacios(correo)) {
            return false;
        }
        // Regex sencillo y práctico para validar formato de correo: local@domain.tld
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(regex, correo);
    }

    public boolean validarSinEspaciosVacios(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean esEmailValido(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; //especificar caracteres que puede contener un email y su estructura
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

}
