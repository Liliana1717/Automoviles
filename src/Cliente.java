
import java.util.ArrayList;
public class Cliente {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private DatoDeVenta datodeventa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DatoDeVenta getDatodeventa() {
        return datodeventa;
    }
    public void setDatodeventa(DatoDeVenta datodeventa) {
        this.datodeventa = datodeventa;

    }

}


