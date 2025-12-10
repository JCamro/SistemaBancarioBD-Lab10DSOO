package Banco.ClasesBase;

public class Empleado extends Usuario {
    
    public Empleado(String nombres, int dni, int edad, String correo, String contraseña) {
        super(nombres, dni, edad, correo, contraseña);
    }
    
    public Empleado(String nombres, int dni, int edad, String correo, String contraseña, String fecha) {
        super(nombres, dni, edad, correo, contraseña, fecha);
    }
    
    public Empleado(int dni) {
        super(null, dni, 0, null, null); // o como tengas Usuario
    }
    

    @Override
    public void mostrarPermisos() {
        System.out.println("\n════════════════════════════════════");
            System.out.println("    MENÚ EMPLEADO: " + getNombres());
            System.out.println("════════════════════════════════════");
            System.out.println("\n--- ACCIONES PARA CLIENTE ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Consultar Movimientos Cliente");
            System.out.println("3. Consultar Cliente");
            System.out.println("4. Eliminar Cliente");
            
            System.out.println("\n--- ACCIONES PARA CUENTA ---");
            System.out.println("5. Abrir Cuenta");
            System.out.println("6. Agregar Titular a Cuenta");
            System.out.println("7. Consultar Movimientos de Cuenta");
            System.out.println("8. Consultar Titulares de Cuenta");
            System.out.println("9. Consultar Cuentas de Cliente");
            System.out.println("10. Consultar Cuenta");
            System.out.println("11. Eliminar Cuenta");
            
            System.out.println("\n--- TRANSACCIONES ---");
            System.out.println("12. Procesar Depósito");
            System.out.println("13. Procesar Retiro");
            System.out.println("14. Procesar Transferencia");
            System.out.println("\nQ. Cerrar Sesión");
        
    }

    @Override
    public String toString() {
        return "\n---Informacion Empleado---"+
                "\nNombres y Apellidos: "+nombres+
                "\nDNI: "+dni+
                "\nEdad: "+edad+
                "\nCorreo: "+correo;
    }
}
