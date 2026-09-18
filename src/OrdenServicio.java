import java.time.LocalDate;

public class OrdenServicio {
    private String id;
    private LocalDate fechaIngreso;
    private String descripcionProblema;
    private String estado;
    private Repuesto[]listRepuestos;
    private Tarea[]listTarea;
    private Mecanico theMecanico;
    private Bicicleta theBicicleta;

    //Constructor
    private OrdenServicio(String id, LocalDate fechaIngreso, String descripcionProblema, String estado){
        this.id=id;
        this.fechaIngreso=fechaIngreso;
        this.descripcionProblema=descripcionProblema;
        this.estado=estado;
        listRepuestos=new Repuesto[10];
        listTarea=new Tarea[10];
    }

    //Gets y Sets
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Repuesto[] getListRepuestos() {
        return listRepuestos;
    }
    public void setListRepuestos(Repuesto[] listRepuestos) {
        this.listRepuestos = listRepuestos;
    }
    public Tarea[] getListTarea() {
        return listTarea;
    }
    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }
    public String getDescripcionProblema() {
        return descripcionProblema;
    }
    public void setListTarea(Tarea[] listTarea) {
        this.listTarea = listTarea;
    }

    public Mecanico getTheMecanico() {
        return theMecanico;
    }
    public void setTheMecanico(Mecanico theMecanico) {
        this.theMecanico = theMecanico;
    }
    public Bicicleta getTheBicicleta() {
        return theBicicleta;
    }
    public void setTheBicicleta(Bicicleta theBicicleta) {
        this.theBicicleta = theBicicleta;
    }
}

