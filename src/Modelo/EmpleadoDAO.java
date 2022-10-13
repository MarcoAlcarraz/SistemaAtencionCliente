
package Modelo;

import Modelo.EntidadEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpleadoDAO {
   
    
     PreparedStatement ps;
      ResultSet rs;
    
   
    Conexion con= new Conexion();
     Connection acceso;
     
    public EntidadEmpleado ValidarVendedor(String dni,String user){
         EntidadEmpleado ev=new EntidadEmpleado();
        String sql="select * from empleado where Dni=? and User=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            while (rs.next()) {                
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setTel(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
        } catch (Exception e) {
        }
        
        return ev;
    }
}
