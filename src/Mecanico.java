public class Mecanico {
    private String cedula;
    private String nombre;
    private String especialidad;
    private OrdenServicio[]listOrdonDeServicio;

    //constructor
    public Mecanico (String cedula, String nombre,String especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.especialidad = especialidad;
        listOrdonDeServicio = new OrdenServicio[10];
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
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public OrdenServicio[] getListOrdonDeServicio() {
        return listOrdonDeServicio;
    }
    public void setListOrdonDeServicio(OrdenServicio[] listOrdonDeServicio) {
        this.listOrdonDeServicio = listOrdonDeServicio;
    }
}
