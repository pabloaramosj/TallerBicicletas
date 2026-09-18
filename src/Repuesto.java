import java.security.PrivateKey;

public class Repuesto {
    private String nit;
    private String nombre;
    private int cantidad;
    private double costoUnitario;
    private OrdenServicio theOrgenServicio;

    //Constructor
    private Repuesto(String nit, String nombre, int cantidad, double costoUnitario){
        this.nit=nit;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.costoUnitario=costoUnitario;
    }

    //Gets y Sets

    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getCostoUnitario() {
        return costoUnitario;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public OrdenServicio getTheOrgenServicio() {
        return theOrgenServicio;
    }
    public void setTheOrgenServicio(OrdenServicio theOrgenServicio) {
        this.theOrgenServicio = theOrgenServicio;
    }
}
