package Banco.GestorPrincipal;

import Banco.ClasesBase.*;
import Banco.BD.ClasesDAO.AdminDAO;
import Banco.Gestores.*;
import Banco.BancoExceptions.BancoException;

public class Banco {

    private GestorClientes gClientes;
    private GestorEmpleados gEmpleados;
    private GestorCuentas gCuentas;
    private GestorTitularidades gTitularidades;
    private GestorTransacciones gTransacciones;
    private AdminDAO adminDAO;

    public Banco() {
        this.gClientes = new GestorClientes();
        this.gEmpleados = new GestorEmpleados();
        this.gTitularidades = new GestorTitularidades();
        this.gCuentas = new GestorCuentas(gTitularidades, gClientes);
        this.gTitularidades.setGestorCuentas(gCuentas);
        this.gTitularidades.setGestorClientes(gClientes);
        this.gTransacciones = new GestorTransacciones(gCuentas, gClientes, gTitularidades);
        this.adminDAO = new AdminDAO();
    }

    public GestorClientes getgClientes() {
        return gClientes;
    }

    public GestorCuentas getgCuentas() {
        return gCuentas;
    }

    public GestorEmpleados getgEmpleados() {
        return gEmpleados;
    }

    public GestorTitularidades getgTitularidades() {
        return gTitularidades;
    }

    public GestorTransacciones getgTransacciones() {
        return gTransacciones;
    }
    
    // Autentica  el Inicio de Sesion
    
    // VALIDADA PARA BASE DE DATOS
    public Cliente autenticarCliente(String correo, String contraseña) throws BancoException {

        Cliente cliente = gClientes.mostrarClienteCorreo(correo);

        if (cliente == null) {
            throw new BancoException.RecursoNoEncontradoException("Correo o contraseña de Cliente incorrecta");
        }

        if (!(cliente.getContraseña().equals(contraseña))) {
            throw new BancoException.RecursoNoEncontradoException("Contraseña de cliente incorrecta");
        }

        return cliente;
    }

    // VALIDADA PARA BASE DE DATOS
    public Empleado autenticarEmpleado(String correo, String contraseña) throws BancoException {

        Empleado empleado = gEmpleados.mostrarEmpleadoCorreo(correo);

        if (empleado == null) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Empleado incorrecta");
        }

        if (!empleado.getContraseña().equals(contraseña)) {
            throw new BancoException.RecursoNoEncontradoException("Contraseña de Empleado incorrecta");
        }

        return empleado;
    }
    
    // VALIDADA PARA BASE DE DATOS
    public Admin autenticarAdministrador(String correo, String contraseña) throws BancoException {
        Admin admin = adminDAO.selectAdmin(correo);

        if (admin == null) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Admin incorrecta");
        }

        if (!admin.getCorreo().equals(correo)) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Admin incorrecta");
        }

        if (!admin.getContraseña().equals(contraseña)) {
            throw new BancoException.RecursoNoEncontradoException("Correo o Contraseña de Admin incorrecta");
        }

        return admin;
    }
}
