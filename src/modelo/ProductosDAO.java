/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Liu
 */
public class ProductosDAO {
    Connection con;
    Conexion cn =new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarProductosT(){     //tecnologia
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * From Productos where Cod_Sub = 1";
        try {
            con= cn.Conectar();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Productos pro = new Productos();
                pro.setID(rs.getInt("ID"));
                pro.setNombre(rs.getString("Producto"));
                pro.setPrecio(rs.getDouble("Precio"));
                pro.setIcon(rs.getString("Icon"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    public List listarProductosM(){     //mercado
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * From Productos where Cod_Sub = 2";
        try {
            con= cn.Conectar();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Productos pro = new Productos();
                pro.setID(rs.getInt("ID"));
                pro.setNombre(rs.getString("Producto"));
                pro.setPrecio(rs.getDouble("Precio"));
                pro.setIcon(rs.getString("Icon"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    public List listarProductosA(){     //aseo
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * From Productos where Cod_Sub = 3";
        try {
            con= cn.Conectar();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Productos pro = new Productos();
                pro.setID(rs.getInt("ID"));
                pro.setNombre(rs.getString("Producto"));
                pro.setPrecio(rs.getDouble("Precio"));
                pro.setIcon(rs.getString("Icon"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    public List listarProductosD(){     //deporte
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * From Productos where Cod_Sub = 4";
        try {
            con= cn.Conectar();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Productos pro = new Productos();
                pro.setID(rs.getInt("ID"));
                pro.setNombre(rs.getString("Producto"));
                pro.setPrecio(rs.getDouble("Precio"));
                pro.setIcon(rs.getString("Icon"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    public List listarProductosAll(){     //deporte
        List<Productos> Listapro = new ArrayList();
        String sql = "SELECT * From Productos";
        try {
            con= cn.Conectar();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Productos pro = new Productos();
                pro.setID(rs.getInt("ID"));
                pro.setNombre(rs.getString("Producto"));
                pro.setPrecio(rs.getDouble("Precio"));
                pro.setIcon(rs.getString("Icon"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    public Productos BuscarPro(String cod){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE Producto = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if(rs.next()){
                producto.setID(rs.getInt("ID"));
                producto.setNombre(rs.getString("Producto"));
                producto.setPrecio(rs.getDouble("Precio"));
                producto.setIcon(rs.getString("Icon"));
            }
        } catch (SQLException e) {
            System.out.println("Problema filtro "+e);
        }
        return producto;
    }
}
