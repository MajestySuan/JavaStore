
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ClienteDAO {
   Connection con;
    Conexion cn =new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarCliente(Cliente cl){
        String sql= "INSERT INTO clientes (NombreCliente,Direccion,TCredito)Values (?,?,?)";
        try {
            con= cn.Conectar();
            ps= con.prepareStatement(sql);
            ps.setString(1, cl.getNombreCliente());
            ps.setString(2, cl.getDireccion());
            ps.setInt(3, cl.getTCredito());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public Cliente BuscarCliente(String cod){
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM clientes WHERE NombreCliente = "+cod+"";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setID(rs.getInt("ID"));
                cliente.setDireccion(rs.getString("Direccion"));
                cliente.setTCredito(rs.getInt("TCredito"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cliente;
    }
}
