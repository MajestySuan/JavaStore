
package modelo;


public class Venta {
    private int ID;
    private String Cliente;
    private double Total;


    public Venta() {
      
    }
    public Venta(int ID, String Cliente, double Total) {
        this.ID = ID;
        this.Cliente = Cliente;
        this.Total = Total;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Producto) {
        this.Cliente = Producto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
