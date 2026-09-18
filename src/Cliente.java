public class Cliente {
    private String cedula;
    private String nombre;
    private Bicicleta[]listBicicleta;


    // Constructor
    public Cliente (String cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
        listBicicleta=new Bicicleta[10];
    }
    //Gets y Sets

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bicicleta[] getListBicicleta() {
        return listBicicleta;
    }

    public void setListBicicleta(Bicicleta[] listBicicleta) {
        this.listBicicleta = listBicicleta;
    }
}
