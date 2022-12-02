 class Main {
     public static void main(String[] args) {

          lista_Hoteles lista_hotel=new lista_Hoteles();
          lista_hotel=lista_hotel.obtenerdatos();
          //lista_hotel.imprimir(); imprime una lista de hoteles tomado de un txt
          Lista_Categorias listaCategorias=new Lista_Categorias();
          listaCategorias=listaCategorias.obtenerdatos();
          //listaCategorias.imprimir(); imprime una lista de categorias tomado de un txt
          Lista_Habitaciones lista_habitaciones=new Lista_Habitaciones();
          lista_habitaciones=lista_habitaciones.obtenerdatos(listaCategorias);
          //lista_habitaciones.imprimir(); imprime lista de habitaciones por txt
          Lista_Clientes lista_clientes=new Lista_Clientes();
          lista_clientes=lista_clientes.obtenerdatos();
          //lista_clientes.imprimir(); imprime lista de clientes tomado de un txt
          Lista_Reservaciones lista_reservaciones=new Lista_Reservaciones();
          lista_reservaciones=lista_reservaciones.obtenerdatos(lista_hotel,lista_habitaciones,lista_clientes);
          lista_reservaciones.imprimir();







     }
}
