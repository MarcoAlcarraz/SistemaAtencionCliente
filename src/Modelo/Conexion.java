
package Modelo;

import Formatos.Mensajes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement ps;
        
    String ruta="jdbc:mysql://localhost:3306/finalventas";
    String usuario="root";
    String clave="";
    String driver ="com.mysql.jdbc.Driver";
    public Connection Conectar(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(ruta,usuario,clave);
            
        } catch (Exception e) {
            Mensajes.M1("ERROR no se puede conectar con la BD..."+e);
        }
        return con;
    }
    
}
