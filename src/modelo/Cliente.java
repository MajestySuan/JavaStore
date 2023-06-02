
package modelo;


public class Cliente {
    private int ID;
    private String NombreCliente;
    private String Direccion;
    private int TCredito;

    public Cliente() {
    }

    public Cliente(int ID, String NombreCliente, String Direccion, int TCredito) {
        this.ID = ID;
        this.NombreCliente = NombreCliente;
        this.Direccion = Direccion;
        this.TCredito = TCredito;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTCredito() {
        return TCredito;
    }

    public void setTCredito(int TCredito) {
        this.TCredito = TCredito;
    }
    
}
