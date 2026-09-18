public class Taller {
    private String nit;
    private String nombre;
    private String direccion;

    private Bicicleta[] listBicicleta;
    private Mecanico[] listMecanico;
    private Repuesto[] inventario;
    private OrdenServicio[] listOrdenServicio;
    private Cliente[] listCliente;
    //constructor
    public Taller (String nit, String nombre,String direccion){
        this.nit=nit;
        this.nombre=nombre;
        this.direccion=direccion;
        listBicicleta=new Bicicleta[10];
        listMecanico=new Mecanico[10];
        listOrdenServicio =new OrdenServicio[10];
        inventario=new Repuesto[10];
        listCliente= new Cliente[10];
    }
    //Metodos logicos
    //CRUD Bicicleta
    //C - Crear/Registrar/Guardar
    public boolean registrarBicicleta(String serial, String marca, String modelo, String tipo, String color, String caractristicas) {

        Bicicleta nuevaBicicleta = new Bicicleta(serial,marca,modelo,tipo,color, caractristicas );
        if (encontrarIndexBicicleta(nuevaBicicleta.getSerial()) == -1) {
            for (int i = 0; i < listBicicleta.length; i++) {
                if (listBicicleta[i] == null) {
                    listBicicleta[i] = nuevaBicicleta;
                    return true;
                }
            }
        }

        return false;
    }

    //R - Leer/Mostrar/Imprimir
    public String mostrarBicicleta(String serialBicicletaMostrar) {
        String mensaje = "";
        int index = encontrarIndexBicicleta(serialBicicletaMostrar);

        if (index != -1) {
            Bicicleta bicicletaEncontrada = listBicicleta[index];

            mensaje = "Bicicleta encontrada:\n" ;
        } else {
            mensaje = "La Bicicleta no se encuentra en la lista.";
        }

        return mensaje;
    }


    //R - Mostrar todas las bicicletas
    public String mostrarListaBicicletas() {
        String mensaje = "Lista de bicicletas:\n";

        for (int i = 0; i < listBicicleta.length; i++) {
            if (listBicicleta[i] != null) {
                mensaje += "\nNombre: " ;

            }

        }

        return mensaje;
    }

    //U - Actualizar/Modificar/Cambiar
    public boolean actualizarBicicleta(String serialBicicletaActualizar, String marca, String modelo, String tipo, String  color, String caracteristicas) {
        boolean respuesta = false;
        int index = encontrarIndexBicicleta(serialBicicletaActualizar);

        if (index != -1) {
            listBicicleta[index].setMarca(marca);
            listBicicleta[index].setModelo(modelo);
            listBicicleta[index].setTipo(tipo);
            listBicicleta[index].setColor(color);
            listBicicleta[index].setCaracteristica(caracteristicas);

            respuesta = true;
        }

        return respuesta;
    }

    //D - Eliminar/Quitar/Borrar .
    public boolean eliminarBicicleta(String serialBicicletaELiminar) {
        boolean respuesta = false;
        int index = encontrarIndexBicicleta(serialBicicletaELiminar);

        if(index != -1){
            listBicicleta[index] = null;
            respuesta = true;
        }

        return respuesta;
    }

    public int encontrarIndexBicicleta(String serialBicicletaBuscar) {

        for (int i = 0; i < listBicicleta.length; i++) {
            if (listBicicleta[i] != null && listBicicleta[i].getSerial().equals(serialBicicletaBuscar)) {
                return i;
            }
        }

        return -1;
    }
    //CRUD Mecanico
    //C - Crear/Registrar/Guardar
    public boolean registrarMecanico(String cedula, String nombre, String especialida) {

        Mecanico nuevoMecanico = new Mecanico(cedula, nombre, especialida);
        if (encontrarIndexBicicleta(nuevoMecanico.getCedula()) == -1) {
            for (int i = 0; i < listMecanico.length; i++) {
                if (listMecanico[i] == null) {
                    listMecanico[i] = nuevoMecanico;
                    return true;
                }
            }
        }

        return false;
    }

    //R - Leer/Mostrar/Imprimir
    public String mostrarMecanico(String cedulaMecanicoMostrar) {
        String mensaje = "";
        int index = encontrarIndexMecanico(cedulaMecanicoMostrar);

        if (index != -1) {
            Mecanico mecanicoEncontrado = listMecanico[index];

            mensaje = "Mecanico encontrado:\n" ;
        } else {
            mensaje = "El mecnico no se encuentra en la lista.";
        }

        return mensaje;
    }


    //R - Mostrar todaos los mecanicos
    public String mostrarListaMecanicos() {
        String mensaje = "Lista de mecanicos:\n";

        for (int i = 0; i < listMecanico.length; i++) {
            if (listMecanico[i] != null) {
                mensaje += "\nNombre: " ;

            }

        }

        return mensaje;
    }

    //U - Actualizar/Modificar/Cambiar
    public boolean actualizarMecanico(String cedulaMecanicoActualizar, String nombre, String especialidad) {
        boolean respuesta = false;
        int index = encontrarIndexMecanico(cedulaMecanicoActualizar);

        if (index != -1) {
            listMecanico[index].setNombre(nombre);
            listMecanico[index].setEspecialidad(especialidad);
            respuesta = true;
        }

        return respuesta;
    }

    //D - Eliminar/Quitar/Borrar .
    public boolean eliminarMecanico(String cedulaMecanicoELiminar) {
        boolean respuesta = false;
        int index = encontrarIndexMecanico(cedulaMecanicoELiminar);

        if(index != -1){
            listMecanico[index] = null;
            respuesta = true;
        }

        return respuesta;
    }

    public int encontrarIndexMecanico(String cedulaMecanicoBuscar) {

        for (int i = 0; i < listMecanico.length; i++) {
            if (listMecanico[i] != null && listMecanico[i].getCedula().equals(cedulaMecanicoBuscar)) {
                return i;
            }
        }

        return -1;
    }



    // Gets and Sets


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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Bicicleta[] getListBicicleta() {
        return listBicicleta;
    }

    public void setListBicicleta(Bicicleta[] listBicicleta) {
        this.listBicicleta = listBicicleta;
    }

    public Mecanico[] getListMecanico() {
        return listMecanico;
    }

    public void setListMecanico(Mecanico[] listMecanico) {
        this.listMecanico = listMecanico;
    }

    public Cliente[] getListCliente() {
        return listCliente;
    }

    public void setListCliente(Cliente[] listCliente) {
        this.listCliente = listCliente;
    }

    public OrdenServicio[] getListOrdonServicio() {
        return listOrdenServicio;
    }

    public void setListOrdonServicio(OrdenServicio[] listOrdonServicio) {
        this.listOrdenServicio = listOrdonServicio;
    }

    public Repuesto[] getInventario() {
        return inventario;
    }

    public void setInventario(Repuesto[] inventario) {
        this.inventario = this.inventario;
    }
}
