package Banco.BD.ClasesDAO;

import java.sql.*;
import Banco.BD.ConexionBD;
import Banco.ClasesBase.*;

public class AdminDAO {
    
    public Admin selectAdmin(String correo) {
        
        String sql = "SELECT * FROM admin WHERE correo = ?";
        Admin admin = null;
        
        try {
            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int dniEntry = rs.getInt("dni");
                String nombresEntry = rs.getString("nombre");
                String correoEntry = rs.getString("correo");
                String contraseñaEntry = rs.getString("contraseña");
                int edadEntry = rs.getInt("edad");
                
                admin = new Admin(nombresEntry, dniEntry, edadEntry, correoEntry, contraseñaEntry);
                return admin;
            }
            
        } catch (Exception e)  {
            System.out.println("Error Select Admin: " + e.getMessage());
        }
        
        return admin;
    }
}
