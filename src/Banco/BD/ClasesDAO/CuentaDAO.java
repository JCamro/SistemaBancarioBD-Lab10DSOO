package Banco.BD.ClasesDAO;

import java.sql.*;
import Banco.BD.ConexionBD;
import Banco.ClasesBase.*;

public class CuentaDAO {
    
    
    public void insertCuenta(Cuenta cuenta) throws Exception {
        String sql = "INSERT INTO cuenta (numero_cuenta, tipo, saldo, clave, fecha_registro) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql);) {
            
            ps.setInt(1, cuenta.getNumeroCuenta());
            ps.setString(2, cuenta.getTipoCuenta());
            ps.setDouble(3, cuenta.getSaldo());
            ps.setInt(4, cuenta.getClave());
            ps.setString(5, cuenta.getFechaApertura());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Error en Insert Cuenta: " + e.getMessage());
            throw e;
        }
    }
    
    public Cuenta selectCuenta(int numeroCuenta) { 
        Cuenta cuenta = null;
        String sql = "SELECT * FROM cuenta WHERE numero_cuenta = ?";

        // El try-with-resources gestiona el cierre de Connection y PreparedStatement
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, numeroCuenta);

            // El ResultSet se cerrará automáticamente cuando se cierre el PreparedStatement
            try (ResultSet rs = ps.executeQuery()) { 
                if (rs.next()) {
                    
                    cuenta = new Cuenta(
                        rs.getInt("numero_cuenta"),
                        rs.getString("tipo"),
                        rs.getDouble("saldo"),
                        rs.getInt("clave"),
                        rs.getString("fecha_registro")
                    );
                }
            }

        } catch (SQLException e) {
            System.err.println("Error SQL al consultar cuenta: " + e.getMessage());
            
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }

        return cuenta;
    }
    
    public Cuenta deleteCuenta(int numeroCuenta) {
        Cuenta cuenta = selectCuenta(numeroCuenta);
        
        // Si no se encuentra la cuenta retorna null
        if (cuenta == null) {
            return null;
        }
        
        // Sentencia SQL para eliminar
        String sql = "DELETE FROM cuenta WHERE numero_cuenta = ?";
        
        try(Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);){
            
            ps.setInt(1, numeroCuenta);
            ps.executeUpdate();
            
            return cuenta;
            
        } catch(SQLException e) {
            System.out.println("Error en Delete Cuenta:  " + e.getMessage());
            return null;
        }
    }
}
