
package Modelo;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class ProductoDAO {
    int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion acceso=new Conexion();
    Producto pro = new Producto();
    //metodo que actualiza el stock del  producto en la base de datos
    public int actualizarStock(int cant,int idp){
        String sql="update producto set Stock=? where idProducto=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    //metodo para listar el IDproducto de la tabla producto
    public Producto listarID(int id){
        Producto p = new Producto();
        String sql="select * from producto where IdProducto=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setIdPro(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return p;
    }
    
    
}
