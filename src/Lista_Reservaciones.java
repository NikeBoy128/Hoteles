import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Reservaciones {
    ArrayList<Reservaciones> lista_reservaciones=new ArrayList<>();

    public Lista_Reservaciones() {
    }

    public ArrayList<Reservaciones> getLista_reservaciones() {
        return lista_reservaciones;
    }

    public void setLista_reservaciones(ArrayList<Reservaciones> lista_reservaciones) {
        this.lista_reservaciones = lista_reservaciones;
    }

    public Lista_Reservaciones(ArrayList<Reservaciones> lista_reservaciones) {
        this.lista_reservaciones = lista_reservaciones;
    }
    public  void agregar(Reservaciones reservacion){
        lista_reservaciones.add(reservacion);
    }
    public  Lista_Reservaciones obtenerdatos(lista_Hoteles lista_hoteles,Lista_Habitaciones lista_habitaciones,Lista_Clientes lista_clientes) {
        Lista_Reservaciones lista_de_Reservaciones = new Lista_Reservaciones();
        String path = "D:\\clase itp\\ejercicios individuales resueltos\\Taller_Final\\Reservaciones\\reservas.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                StringTokenizer atributo = new StringTokenizer(linea, ",");
                Reservaciones reservacion = new Reservaciones();
                while (atributo.hasMoreElements()) {
                    reservacion.setId_reserva(atributo.nextElement().toString());
                    reservacion.setId_hotel(lista_hoteles.buscar2(atributo.nextElement().toString()));
                    reservacion.setId_habitacion(lista_habitaciones.buscar2(atributo.nextElement().toString()));
                    reservacion.setId_cliente(lista_clientes.buscar2(atributo.nextElement().toString()));
                    reservacion.setNumero_habitaciones(Integer.parseInt(atributo.nextElement().toString()));




                }


                lista_de_Reservaciones.agregar(reservacion);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return lista_de_Reservaciones;








    }




    public  void imprimir(){

        for(Reservaciones aux:lista_reservaciones){
            int valolr= (aux.calular())*aux.getNumero_habitaciones();


            System.out.println(aux.getId_reserva()+" Hotel "+aux.getId_hotel().getNombre()+" Calidad estrellas  "+aux.getId_hotel().getCalidad()+" "+aux.getId_habitacion().getNombre_categoria().getDescripcion()+" Cliente "+aux.getId_cliente().getNombre()+" Numero Habtiaciones "+aux.getNumero_habitaciones()+" Total Reserva "+valolr);
        }
    }





}
