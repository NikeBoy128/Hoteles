class Habitaciones {
    private  String id_habitacion;
    private String num_habitacion;
    private Categorias nombre_categoria;

    public Habitaciones(String id_habitacion, String num_habitacion, Categorias nombre_categoria) {
        this.id_habitacion = id_habitacion;
        this.num_habitacion = num_habitacion;
        this.nombre_categoria = nombre_categoria;
    }

    public String getId_habitacion() {
        return id_habitacion;
    }

    public Habitaciones() {
    }

    public void setId_habitacion(String id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(String num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public Categorias getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(Categorias nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

}
