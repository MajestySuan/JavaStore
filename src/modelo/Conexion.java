
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String url = "jdbc:mysql://localhost:3306/";
    String bd = "bd_javastore";
    String user = "root";
    String password = "123";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;
    public Conexion(){
        
 }   
    public Connection Conectar(){
        try {
            Class.forName(driver);
            con =DriverManager.getConnection(url+bd, user, password);
            System.out.println("Se conecto exitosamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("fallo de conexion principal bd" + e);
        }
        return con;
    }
    public void Desconectar(){
        try {
            con.close();
            System.out.println("se desconecto de la bd");
        } catch (SQLException e) {
            System.out.println("error al desconectar de la bd"+ e);
        }
    }
}
