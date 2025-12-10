package Banco.ClasesBase;

public class Retiro extends Transaccion {
    
    // Constructor para crear por primera vez un Deposito
    public Retiro(Empleado empleado, Cliente cliente, Cuenta cuenta, double monto) {
        super(cliente, empleado, cuenta, monto);
    }
    
    // Constructor para recibir una transaccion de la BD
    public Retiro(Empleado empleado, Cliente cliente, Cuenta cuenta, double monto, int idTransaccion, String fecha) {
        super(cliente, empleado, cuenta, monto, idTransaccion, fecha);
    }
    
    // METODOS PARA UTILIZAR CON TransaccionDAO
    @Override
    public void procesar() {
        cuenta.setSaldo(cuenta.getSaldo()-monto);
        toString();
    }

    @Override
    public String toString() {
        return "--- RETIRO ---" + super.toString();
    }


    
}
