package Banco.ClasesBase;

public class Admin extends Empleado {

    public Admin(String nombres, int dni, int edad, String correo, String contraseña) {
        super(nombres, dni, edad, correo, contraseña);
    }

    @Override
    public void mostrarPermisos() {
            System.out.println("\n════════════════════════════════════");
            System.out.println("    MENÚ ADMINISTRADOR: " + getNombres());
            System.out.println("════════════════════════════════════");
            System.out.println("\n--- ACCIONES PARA CLIENTE ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Consultar Movimientos de Cliente");
            System.out.println("3. Consultar Cliente");
            System.out.println("4. Consultar Lista de Clientes");
            System.out.println("5. Eliminar Cliente");
            
            System.out.println("\n--- ACCIONES PARA EMPLEADOS ---");
            System.out.println("6. Registrar Empleado");
            System.out.println("7. Mostrar Empleado");
            System.out.println("8. Consultar Lista de Empleados");
            System.out.println("9. Eliminar Empleado");
            
            System.out.println("\n--- ACCIONES PARA CUENTA ---");
            System.out.println("10. Abrir Cuenta");
            System.out.println("11. Agregar Titular a Cuenta");
            System.out.println("12. Consultar Movimientos de Cuenta");
            System.out.println("13. Consultar Titulares de Cuenta");
            System.out.println("14. Consultar Cuentas de Cliente");
            System.out.println("15. Consultar Lista de Cuentas");
            System.out.println("16. Consultar Cuenta");
            System.out.println("17. Eliminar Cuenta");

            System.out.println("\n--- TRANSACCIONES ---");
            System.out.println("18. Procesar Depósito");
            System.out.println("19. Procesar Retiro");
            System.out.println("20. Procesar Transferencia");
            System.out.println("21. Ver Todas las Transacciones");
            System.out.println("\nQ. Cerrar Sesión");
    }
}
