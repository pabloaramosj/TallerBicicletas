public class Tarea {
    private String id;
    private String actividad;
    private double valor;

    //Constructor
    private Tarea (String id, String actividad, double valor){
        this.id=id;
        this.actividad=actividad;
        this.valor=valor;
    }

    //Gets y Sets
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getActividad() {
        return actividad;
    }
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
