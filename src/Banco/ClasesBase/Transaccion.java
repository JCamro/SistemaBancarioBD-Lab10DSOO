package Banco.ClasesBase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Transaccion {
    protected double monto;
    protected Cuenta cuenta;
    protected String fecha;
    protected Empleado empleado;
    protected Cliente cliente;
    protected int idTransaccion;
    
    // Constructor para crear por primera vez una transaccion
    public Transaccion(Cliente cliente, Empleado empleado, Cuenta cuenta, double monto) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.monto = monto;
        this.cuenta = cuenta;
        
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.fecha = ahora.format(formatter);
    }
    
    // Constructor para recibir una transaccion de la BD
    public Transaccion(Cliente cliente, Empleado empleado, Cuenta cuenta, double monto, int idTransaccion, String fecha) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.monto = monto;
        this.cuenta = cuenta;
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
    }

    // --- Getters y Setters ---
    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}
    
    public int getIdTransaccion() {return idTransaccion;}
    public void setIdTransaccion(int idTransaccion) {this.idTransaccion = idTransaccion;}

    public Cuenta getCuenta() {return cuenta;}
    public void setCuenta(Cuenta cuenta) {this.cuenta = cuenta;}

    public void setFecha(String fecha) {this.fecha = fecha;}
    public String getFecha() {return fecha;}

    public Empleado getEmpleado() {return empleado;}
    public void setEmpleado(Empleado empleado) {this.empleado = empleado;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}


    public void procesar() {
        System.out.println("Procesando Transaccion");
    }

    @Override
    public String toString() {
        return "\nTransaccion nro: "+idTransaccion+
               "\nMonto: " + monto + 
               "\nCuenta: " + cuenta.getNumeroCuenta() +
               "\nFecha: " + getFecha() +
               (cliente != null ? "\nRemitente: " + cliente.getNombres() : "") + "\tDNI: "+cliente.getDni()+
               (empleado != null ? "\nGestionado por: " + empleado.getNombres() : "");
    }
}
