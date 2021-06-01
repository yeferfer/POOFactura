package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class Conexionn {
   public Connection con;
    public  Conexionn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/facturacion","root","");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.err.println("Error:" +e);
            System.out.println("Conexion no exitosa");
        }
    }
}
