package Banco.Gestores;

import Banco.BD.ClasesDAO.*;
import Banco.BancoExceptions.BancoException;
import Banco.ClasesBase.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestorEmpleados {

    private EmpleadoDAO empleadoDAO;

    public GestorEmpleados() {
        empleadoDAO = new EmpleadoDAO();
    }


    // Registrar nuevo empleado (solo Admin puede hacerlo)
    public Empleado registrarEmpleado(Empleado usuarioActual, String nombres, String dni, String edad, String correo, String contraseña) throws Exception {
        // Validar permisos
        if (!(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Solo los administradores pueden registrar empleados");
        }

        // Validaciones
        if (!validarStringNoVacio(nombres)) {
            throw new BancoException.ValidacionException("Nombres no deben estar vacíos");
        }

        int dniEmpleado = validarStringNumericoInt(dni);
        int edadEmpleado = validarStringNumericoInt(edad);

        if (dniEmpleado == -1 || edadEmpleado == -1) {
            throw new BancoException.ValidacionException("DNI y edad deben ser numéricos");
        }

        if (dniEmpleado < 10000000 || dniEmpleado > 99999999) {
            throw new BancoException.ValidacionException("DNI debe tener 8 dígitos");
        }

        if (empleadoDAO.selectPorDni(dniEmpleado) != null) {
            throw new BancoException.DuplicadoException("DNI ya registrado en el sistema");
        }

        if (edadEmpleado < 18 || edadEmpleado > 120) {
            throw new BancoException.ValidacionException("Edad no válida");
        }

        if (empleadoDAO.selectPorCorreo(correo) != null) {
            throw new BancoException.DuplicadoException("Correo ya registrado");        //VALIDAR CORREO
        }
        if (!esEmailValido(correo)) {
            throw new BancoException.ValidacionException("Formato de correo no correspondiente (ejemplo@dominio.com)");
        }
        if (!validarStringNoVacio(contraseña)) {
            throw new BancoException.ValidacionException("Contraseña no válida");
        }

        Empleado nuevoEmpleado = new Empleado(nombres, dniEmpleado, edadEmpleado, correo, contraseña);
        
        try {
            empleadoDAO.insertEmpleado(nuevoEmpleado);
        } catch(Exception e) {
            throw e;
        }

        return nuevoEmpleado;
    }

    // -- MOSTRAR EMPLEADO --
    public Empleado mostrarEmpleadoDni(String dniEmpleado) throws BancoException {
        int dniEmpl = validarStringNumericoInt(dniEmpleado);

        Empleado empleado = empleadoDAO.selectPorDni(dniEmpl);

        if (empleado == null) {
            throw new BancoException.RecursoNoEncontradoException("No hay registro de empleado con ese Dni");
        }
        return empleado;
    }

    // Buscar empleado por correo
    public Empleado mostrarEmpleadoCorreo(String correo) {
        return empleadoDAO.selectPorCorreo(correo);
    }

    // -- ELIMINAR EMPLEADO -- 
    public boolean eliminarEmpleado(Usuario usuarioActual, String dni) throws BancoException {
        if (!(usuarioActual instanceof Admin)) {
            throw new BancoException.PermisosDenegadosException("Solo los administradores pueden eliminar empleados");
        }

        int dniEmpleado = validarStringNumericoInt(dni);
        if (dniEmpleado == -1) {
            throw new BancoException.ValidacionException("DNI debe ser numérico");
        }

        Empleado empleado = empleadoDAO.deleteEmpleado(dniEmpleado);

        if (empleado == null) {
            throw new BancoException.RecursoNoEncontradoException("Empleado no encontrado");
        }

        return true;
    }

    // Metodos Gestor
    public Empleado buscarEmpleadoPorDni(int dni) {
        return empleadoDAO.selectPorDni(dni);
    }
    
    // VALIDACION DE ENTRADA
    private int validarStringNumericoInt(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (Exception e) {
            return -1;
        }
    }

    private boolean validarStringNoVacio(String palabra) {
        return palabra != null && !palabra.trim().isEmpty();
    }

    public boolean esEmailValido(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; //especificar caracteres que puede contener un email y su estructura
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    public boolean validarSinEspaciosVacios(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }
}
