
import java.util.ArrayList;
public class DatoDeVenta {

    private String codigodeventa;
    private String fechadeventa;
    private String formadepago;
    private String preciodeventa;

    ArrayList<Cliente>clientes;
    ArrayList<Vehiculo>vehiculos;
    public String getCodigodeventa() {
        return codigodeventa;
    }

    public void setCodigodeventa(String codigodeventa) {
        this.codigodeventa = codigodeventa;
    }

    public String getFechadeventa() {
        return fechadeventa;
    }

    public void setFechadeventa(String fechadeventa) {
        this.fechadeventa = fechadeventa;
    }

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    public String getPreciodeventa() {
        return preciodeventa;
    }

    public void setPreciodeventa(String preciodeventa) {
        this.preciodeventa = preciodeventa;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
