 class Reservaciones {
    private  String id_reserva;
    private  Hotel id_hotel;
    private Habitaciones id_habitacion;
    private Cliente id_cliente;
    private int numero_habitaciones;
    private  int dias;

     public Reservaciones(String id_reserva, Hotel id_hotel, Habitaciones id_habitacion, Cliente id_cliente, int numero_habitaciones,int dias) {
         this.id_reserva = id_reserva;
         this.id_hotel = id_hotel;
         this.id_habitacion = id_habitacion;
         this.id_cliente = id_cliente;
         this.numero_habitaciones = numero_habitaciones;
         this.dias=dias;
     }

     public Reservaciones() {

     }

     public int getDias() {
         return dias;
     }

     public void setDias(int dias) {
         this.dias = dias;
     }

     public String getId_reserva() {
         return id_reserva;
     }

     public void setId_reserva(String id_reserva) {
         this.id_reserva = id_reserva;
     }

     public Hotel getId_hotel() {
         return id_hotel;
     }

     public void setId_hotel(Hotel id_hotel) {
         this.id_hotel = id_hotel;
     }

     public Habitaciones getId_habitacion() {
         return id_habitacion;
     }

     public void setId_habitacion(Habitaciones id_habitacion) {
         this.id_habitacion = id_habitacion;
     }

     public Cliente getId_cliente() {
         return id_cliente;
     }

     public void setId_cliente(Cliente id_cliente) {
         this.id_cliente = id_cliente;
     }

     public int getNumero_habitaciones() {
         return numero_habitaciones;
     }

     public void setNumero_habitaciones(int numero_habitaciones) {
         this.numero_habitaciones = numero_habitaciones;
     }
     public int calular(){
         int valor = 0;

         switch (id_hotel.getCalidad()){
             case "3":

                 switch(id_habitacion.getNombre_categoria().getId_categoria()){
                     case "1":
                         valor=50;
                         break;
                     case "2":
                         valor=80;
                         break;
                     case "3":
                         valor=90;
                         break;
                     case "4":
                         valor=140;
                         break;




                 }
                 break;

             case "4":
                 switch (id_habitacion.getNombre_categoria().getId_categoria()){
                     case "1":
                         valor=70;
                         break;
                     case "2":
                         valor=100;
                         break;
                     case "3":
                         valor=120;
                         break;
                     case "4":
                         valor=200;
                         break;



                 }






                 break;





             case "5":
                 switch (id_habitacion.getNombre_categoria().getId_categoria()){
                     case "1":
                         valor=100;
                         break;
                     case "2":
                         valor=120;
                         break;
                     case "3":
                         valor=180;
                         break;
                     case "4":
                         valor=300;
                         break;



                 }

                 break;



         }


         return valor;
     }






 }
