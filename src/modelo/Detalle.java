
package modelo;


public class Detalle {
    private int ID_Venta;
    private int ID;
    private String Producto;
    private int Cantidad;
    private double Precio;
    private double Total;

    public Detalle() {
        
    }

    public Detalle(int ID_Venta, int ID, String Producto, int Cantidad, double Precio, double Total) {
        this.ID_Venta = ID_Venta;
        this.ID = ID;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Total = Total;
    }

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

   
    
}
