
package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class VentaDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    int r;
    
    public int RegistarVenta(Venta v){//general
        String sql = "INSERT INTO ventas (ID, Cliente, Total) Values (?,?)";
        try {
            con = cn.Conectar();
            ps= con.prepareStatement(sql);
            ps.setString(1, v.getCliente());
            ps.setDouble(2, v.getTotal());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    public int RegistarVentaDetalle(Detalle Dv){//Detalle
        String sql = "INSERT INTO detalleventa (ID, Producto, Cantidad, Precio, Total) Values (?,?,?,?,?)";
        try {
            con = cn.Conectar();
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, Dv.getID());
            ps.setString(2, Dv.getProducto());
            ps.setInt(3, Dv.getCantidad());
            ps.setDouble(4, Dv.getPrecio());
            ps.setDouble(5, Dv.getTotal());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("error en registtrar detalle"+e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("error en registtrar detalle finally"+e.toString());
            }
        }
        return r;
    }
    public void BorrarVenta(){
        String sql = "DELETE FROM `detalleventa`";
        try {
            con = cn.Conectar();
            ps= con.prepareStatement(sql);
            ps.execute();
            System.out.println("se elimino :D");
        } catch (SQLException e) {
            System.out.println("error en eliminar"+e.toString());
        }
        
    }
}
