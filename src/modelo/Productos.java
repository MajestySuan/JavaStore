/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Liu
 */
public class Productos {
    private int ID;
    private String Nombre;
    private double Precio;
    private String Icon;
    
    public Productos(){
        
    }

    public Productos(int ID, String Nombre, double Precio, String Icon) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Icon = Icon;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String Icon) {
        this.Icon = Icon;
    }
}
