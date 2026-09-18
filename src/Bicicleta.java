public class Bicicleta {
    private String serial;
    private String marca;
    private String modelo;
    private String tipo;
    private String color;
    private String caracteristica;
    private Cliente theCliente;
    private OrdenServicio[] listOrdenServicio;

    // Constructor
    public Bicicleta(String serial, String marca, String modelo, String tipo, String color, String caracteristica){
        this.serial=serial;
        this.marca=marca;
        this.modelo=modelo;
        this.tipo=tipo;
        this.color=color;
        this.caracteristica=caracteristica;
        listOrdenServicio =new OrdenServicio[10];
    }
    //Gets y Sets

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca= marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Cliente getTheCliente() {
        return theCliente;
    }
    public void setTheCliente(Cliente theCliente) {
        this.theCliente = theCliente;
    }

    public OrdenServicio[] getListOrdenDeServicio() {
        return listOrdenServicio;
    }
    public void setListOrdenDeServicio(OrdenServicio[] listOrdenServicio) {
        this.listOrdenServicio = listOrdenServicio;
    }
}
