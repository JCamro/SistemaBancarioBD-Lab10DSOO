package Banco.BD.ClasesDAO;

import java.sql.*;
import Banco.BD.ConexionBD;
import Banco.ClasesBase.*;

public class TitularidadDAO {
    
    public void insertTitularidad(Titularidad titularidad) throws Exception {
        String sql = "INSERT INTO titularidad (tipo, fecha_creacion, dni_cliente, numero_cuenta) VALUES (?, ?, ?, ?)";
        
        try (Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);) {
            
            ps.setString(1, titularidad.getTipo());
            ps.setString(2, titularidad.getFechaCreacion());
            ps.setInt(3, titularidad.getCliente().getDni());
            ps.setInt(4, titularidad.getCuenta().getNumeroCuenta());
            
            ps.executeUpdate();
            
        } catch(Exception e) {
            System.out.println("Error Insert Titularidad: " + e.getMessage());
            throw e;
        }
    }
    
    public Titularidad selectTitularidad(Cliente cliente, Cuenta cuenta) {
        Titularidad titularidad = null;
        
        String sql = "SELECT * FROM titularidad WHERE numero_cuenta = ? AND dni_cliente = ?";
        
        try (Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);) {
            
            ps.setInt(1, cuenta.getNumeroCuenta());
            ps.setInt(2, cliente.getDni());
            
            try (ResultSet rs = ps.executeQuery();) {
                
                if(rs.next()) {
                    
                    titularidad = new Titularidad(
                            rs.getString("tipo"),
                            cliente,
                            cuenta,
                            rs.getString("fecha_creacion")
                    );
                    
                    return titularidad;
                }
            }
            
        } catch(Exception e) {
            System.out.println("Error select Titularidad: " + e.getMessage());
        }
        
        return titularidad;
    }
    
    
    public Titularidad deleteTitularidad(Cliente cliente, Cuenta cuenta) {
        Titularidad titularidad = selectTitularidad(cliente, cuenta);
        
        if (titularidad == null) {
            return null;
        }
        
        String sql = "DELETE FROM titularidad WHERE dni_cliente = ?, numero_cuenta = ?";
        
        try(Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);) {
            
            ps.setInt(1, cliente.getDni());
            ps.setInt(2, cuenta.getNumeroCuenta());
            
            ps.executeUpdate();
            
            return titularidad;
        } catch(Exception e) {
            System.out.println("Error Delete Titularidad: " + e.getMessage());
            return null;
        }
    }
    
}
