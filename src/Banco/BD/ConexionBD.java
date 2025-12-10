package Banco.BD;

import java.sql.*;

public class ConexionBD {
    // Estatica para que toda la aplicacion utilice la misma Conexion
    private static Connection con = null;
    
    public static Connection conectar() throws SQLException {
        String localhost = "jdbc:mysql://localhost:3306/db_banco_cerdita";
        String user = "root";
        String password = "";
        
        try {
            con = DriverManager.getConnection(localhost, user, password);
            System.out.println("Conexion Exitosa");
                    
        } catch (Exception e) {
            throw new SQLException("Error al conectar a BD: "+e.getMessage());
        }
        
        return con;
    }
}
