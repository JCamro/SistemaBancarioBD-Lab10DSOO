package Banco.ClasesBase;

public class Deposito extends Transaccion {

    // Constructor para crear por primera vez un Deposito
    public Deposito(Cliente cliente, Empleado empleado, Cuenta cuenta, double monto) {
        super(cliente, empleado, cuenta, monto);
    }
    
    // Constructor para recibir una transaccion de la BD
    public Deposito(Cliente cliente, Empleado empleado, Cuenta cuenta, double monto, int idTransaccion, String fecha) {
        super(cliente, empleado, cuenta, monto, idTransaccion, fecha);
    }

    // METODOS PARA UTILIZAR CON TransaccionDAO
    @Override
    public void procesar() {
        cuenta.setSaldo(cuenta.getSaldo()+monto);
        toString();
    }

    @Override
    public String toString() {
        return "--- DEPOSITO ---"+super.toString();
    }
}
