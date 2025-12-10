/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco.BancoExceptions;


public class BancoException extends Exception {

    
    public BancoException(String mensaje) {
        super(mensaje);
    }
    
    /**
     * Excepción para validaciones de datos
     */
    public static class ValidacionException extends BancoException {
        public ValidacionException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Excepción cuando no se encuentra un recurso
     */
    public static class RecursoNoEncontradoException extends BancoException {
        public RecursoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Excepción para permisos insuficientes
     */
    public static class PermisosDenegadosException extends BancoException {
        public PermisosDenegadosException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Excepción para operaciones duplicadas
     */
    public static class DuplicadoException extends BancoException {
        public DuplicadoException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Excepción para saldo insuficiente
     */
    public static class SaldoInsuficienteException extends BancoException {
        public SaldoInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }

    /**
     * Excepción para credenciales incorrectas
     */
    public static class CredencialesInvalidasException extends BancoException {
        public CredencialesInvalidasException(String mensaje) {
            super(mensaje);
        }
    }
}
