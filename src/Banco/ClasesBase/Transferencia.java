
package Banco.ClasesBase;

public class Transferencia extends Transaccion {
    private Cuenta cuentaDestino;
    
    // Constructor para crear por primera vez una Transferencia Manejada por un Empleado/Admin
    public Transferencia(Cliente cliente, Empleado empleado, Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {
        super(cliente, empleado, cuentaOrigen, monto);
        this.cuentaDestino = cuentaDestino;
    }
    
    // Constructor para crear por primera vez una Transferencia Manejada por cliente
    public Transferencia(Cliente cliente, Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {
        super(cliente, null, cuentaOrigen, monto);
        this.cuentaDestino = cuentaDestino;
    }
    
    // Constructor para recibir una transaccion de la BD
    public Transferencia(Cliente cliente, Empleado empleado, Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto, int idTransaccion, String fecha) {
        super(cliente, empleado, cuentaOrigen, monto, idTransaccion, fecha);
        this.cuentaDestino = cuentaDestino;
    }
    
    // METODOS PARA UTILIZAR CON TransaccionDAO
    @Override
    public void procesar() {

        cuenta.setSaldo(cuenta.getSaldo() - monto);
        
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public String toString() {
        return "--- TRANSFERENCIA ---" +
               "\nID Transacción: " + idTransaccion +
               "\nMonto: S/" + monto +
               "\nCuenta Origen: " + cuenta.getNumeroCuenta() +
               "\nCuenta Destino: " + cuentaDestino.getNumeroCuenta() +
               "\nFecha: " + getFecha() +
               (cliente != null ? "\nCliente: " + cliente.getNombres() : "") +
               (empleado != null ? "\nGestionado por: " + empleado.getNombres() : "");
    }
}