 class Hotel {
    private String id_hotel;
    private String nombre;
    private  String calidad;

     public Hotel(String id_hotel, String nombre, String calidad) {
         this.id_hotel = id_hotel;
         this.nombre = nombre;
         this.calidad = calidad;
     }

     public Hotel() {

     }

     public String getId_hotel() {
         return id_hotel;
     }

     public void setId_hotel(String id_hotel) {
         this.id_hotel = id_hotel;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getCalidad() {
         return calidad;
     }

     public void setCalidad(String calidad) {
         this.calidad = calidad;
     }
 }
