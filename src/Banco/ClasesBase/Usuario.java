package Banco.ClasesBase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Usuario {
    protected String nombres;
    protected int dni;
    protected int edad;
    protected String fechaRegistro; 
    protected String correo; 
    protected String contraseña; 

    public Usuario(String nombres, int dni, int edad, String correo, String contraseña) {
        setNombres(nombres);
        setDni(dni);
        setEdad(edad);
        setCorreo(correo);
        setContraseña(contraseña);
        
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.fechaRegistro = ahora.format(formatter);
    }
    
    public Usuario(String nombres, int dni, int edad, String correo, String contraseña, String fecha_registro) {
        setNombres(nombres);
        setDni(dni);
        setEdad(edad);
        setCorreo(correo);
        setContraseña(contraseña);
        
        this.fechaRegistro = fecha_registro;
    }

    //Setters
    public void setCorreo(String correo) {this.correo = correo;}
    public void setDni(int dni) {this.dni = dni;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}

    //Getters
    public String getCorreo() {return correo;}
    public int getDni() {return dni;}
    public int getEdad() {return edad;}
    public String getNombres() {return nombres;}
    public String getContraseña() {return contraseña;}
    
    public String getFechaApertura() {
        return fechaRegistro;
    }
    

    //Metodo mostrar permisos

    public void mostrarPermisos() {
        
    }
}
