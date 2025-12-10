package Banco.Gestores;

import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;
import Banco.BD.ClasesDAO.*;
import java.util.ArrayList;



public class GestorTitularidades {
    
    private TitularidadDAO titularidadDAO;
    private GestorCuentas gCuentas;
    private GestorClientes gClientes;

    // Constructor sin parámetros
    public GestorTitularidades() {
        this.titularidadDAO = new TitularidadDAO();
    }

    // Setters para inyectar las dependencias
    public void setGestorCuentas(GestorCuentas gCuentas) {
        this.gCuentas = gCuentas;
    }

    public void setGestorClientes(GestorClientes gClientes) {
        this.gClientes = gClientes;
    }
    
    
    /*
    //FALTA IMPLEMENTAR EN INTERFAZ
    // -- AGREGAR TITULAR A CUENTA --
    public Titularidad agregarTitularidad(String dni, String numeroCuenta) throws Exception { 

        int dniCliente = validarStringNumericoInt(dni);
        int numeroCuentaCl = validarStringNumericoInt(numeroCuenta);

        //Validaciones
        if (dniCliente == -1) {
            throw new BancoException.ValidacionException("Dni solo debe contener numeros");
        }

        if (numeroCuentaCl == -1) {
            throw new BancoException.ValidacionException("Numero de Cuenta solo debe contener numeros");
        }

        Cliente clienteP = gClientes.buscarCliente(dniCliente);
        // FALTA IMPLEMENTAR
        Cuenta cuentaP = gCuentas.buscarCuenta(numeroCuentaCl);

        if (clienteP == null) {
            throw new BancoException.RecursoNoEncontradoException("Cliente no registrado en el sistema");
        }
        if (cuentaP == null) {
            throw new BancoException.RecursoNoEncontradoException("Cuenta no registrada en el sistema");
        }
        if (buscarTitularidad(clienteP, cuentaP) != null) {
            throw new BancoException.DuplicadoException("Ya existe una titularidad con esta cuenta");
        }

        Titularidad titularidad = new Titularidad("Secundario", clienteP, cuentaP);
        try {
            titularidadDAO.insertTitularidad(titularidad);
        } catch (Exception e) {
            throw e;
        }
        
        return titularidad;
    }
    */
    
    // Busca si hay una titularidad entre un cliente y una cuenta
    public Titularidad buscarTitularidad(Cliente cliente, Cuenta cuenta) {
        return titularidadDAO.selectTitularidad(cliente, cuenta);
    }
    
    // -- METODO PARA CREAR TITULARIDAD CUANDO SE ABRE UNA CUENTA --
    public void agregarPrimeraTitularidad(Titularidad nTitularidad) throws Exception {
        try {
            titularidadDAO.insertTitularidad(nTitularidad);
        } catch (Exception e) {
            throw e;
        }
    }

    // Elimina una titularidad del registro     // AUN NO UTILIZADO
    public void eliminarTitularidad(Titularidad titularidad) {
        titularidadDAO.deleteTitularidad(titularidad.getCliente(), titularidad.getCuenta());
    }



    /*
    // Array de las titularidades de un Cliente
    public ArrayList<Titularidad> listarTitularidadesDeCliente(Cliente cliente) {
    
    }

    
    // Array de los titulares de una cuenta
    public ArrayList<Titularidad> listarTitularesDeCuenta(Cuenta cuenta) {

    }
    */

    public int validarStringNumericoInt(String numero) {
        int numeroParseado;
        try {
            numeroParseado = Integer.parseInt(numero);
            return numeroParseado;
        } catch (Exception e) {
            return -1;
        }
    }

}
