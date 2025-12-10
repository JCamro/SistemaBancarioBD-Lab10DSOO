package Banco.BD.ClasesDAO;

import java.sql.*;
import Banco.BD.ConexionBD;
import Banco.ClasesBase.*;

public class EmpleadoDAO {
    
    public void insertEmpleado(Empleado empleado) throws Exception {
        String sql = "INSERT INTO empleado (dni, nombres, edad, correo, contraseña, fecha_registro) VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, empleado.getDni());
            ps.setString(2, empleado.getNombres());
            ps.setInt(3, empleado.getEdad());
            ps.setString(4, empleado.getCorreo());
            ps.setString(5, empleado.getContraseña());
            ps.setString(6, empleado.getFechaApertura());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error Insert Empleado: " + e.getMessage());
            throw e;
        }
    }
    
    
    public Empleado selectPorCorreo(String correo) {
        Empleado empleado = null;
        
        String sql = "SELECT * FROM empleado WHERE correo = ?";
        try { 
            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()) {
                int dniEntry = rs.getInt("dni");
                String nombresEntry = rs.getString("nombres");
                int edadEntry = rs.getInt("edad");
                String correoEntry = rs.getString("correo");
                String contraseñaEntry = rs.getString("contraseña");
                String fechaEntry = rs.getString("fecha_registro");
                
                empleado = new Empleado(nombresEntry, dniEntry, edadEntry, correoEntry, contraseñaEntry, fechaEntry);
                return empleado;
            }
            
        } catch (Exception e) {
            System.out.println("Error Select Empleado Correo: " + e.getMessage());
        }
        
        return empleado;
    }
    
    
    public Empleado selectPorDni(int dni) {
        Empleado empleado = null;
        
        String sql = "SELECT * FROM empleado WHERE DNI = ?";
        
        try { 
            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()) {
                int dniEntry = rs.getInt("dni");
                String nombresEntry = rs.getString("nombres");
                int edadEntry = rs.getInt("edad");
                String correoEntry = rs.getString("correo");
                String contraseñaEntry = rs.getString("contraseña");
                String fechaEntry = rs.getString("fecha_registro");
                
                empleado = new Empleado(nombresEntry, dniEntry, edadEntry, correoEntry, contraseñaEntry, fechaEntry);
                return empleado;
            }
            
        } catch (Exception e) {
            System.out.println("Error Select Empleado Dni: " + e.getMessage());
        }
        
        return empleado;
    }
    
    
    public Empleado deleteEmpleado(int dni) {
        Empleado empleadoEliminado = selectPorDni(dni);
        
        if (empleadoEliminado == null) {
            return null;
        }
        
        String sql = "DELETE FROM empleado WHERE DNI = ?";
        
        try {
            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            ps.executeUpdate();
            
            return empleadoEliminado;
            
            
        } catch (Exception e) {
            System.out.println("Error Delete Empleado: " + e.getMessage());
            return null;
        }
    }
}
