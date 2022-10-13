
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Ventas;

//CRUD para las Ventas
public class VentasDAO {
    
    Conexion cn =new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    //metodo para ingresar el numero de boleta al txtNumeroBoleta
    public String NumeroBoleta(){
        String boleta ="";
        String sql="select max(NumeroSerie) from ventas ";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                boleta=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return boleta;
    }
    //metodo para calcular el maximo valor y actual para registrarlo en la tabla detalle_ventas 
    public String IdVentas(){
        String idv="";
        String sql="select max(IdVentas) from ventas";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idv=rs.getString(1);
                
            }
            
        } catch (Exception e) {
        }
        return idv;
        
    }
    //metodo para que posteriormente se guarde las ventas en la tabla ventas de mysql
    public int GuardarVentas(Ventas v){
        Ventas ventas = new Ventas();
        String sql="insert into Ventas(IdCliente,IdEmpleado,NumeroSerie,FechaVentas,Monto,Estado)values(?,?,?,?,?,?)";
        try {
             con=cn.Conectar();
             ps=con.prepareStatement(sql);
             ps.setInt(1,v.getIdCliente());
             ps.setInt(2,v.getIdEmpleado());
             ps.setString(3,v.getSerie());
             ps.setString(4,v.getFecha());
             ps.setDouble(5,v.getMonto());
             ps.setString(6,v.getEstado());
             r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    //metodo para que posteriormente se guarde el detalle de lasventas en la tabla Detalleventas de mysql
    public int GuardarDetalleVentas(DetalleVentas dv){
        DetalleVentas detallv=new DetalleVentas();
        
        String sql="insert into detalle_ventas(IdVentas,IdProducto,Cantidad,PrecioVenta)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPreVenta());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        
        return r;
    }
}
