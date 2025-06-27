package conexion;

import java.sql.*;

public class ConexionBD {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/sgrh", "root", "");
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e);
            return null;
        }
    }
}
