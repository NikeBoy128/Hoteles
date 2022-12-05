import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
                    reservacion.setDias(Integer.parseInt(atributo.nextElement().toString()));




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
            int valor=0;
            valor+=(aux.calular())*aux.getNumero_habitaciones();
            valor=valor*aux.getDias();




            System.out.println(aux.getId_reserva()+" Hotel "+aux.getId_hotel().getNombre()+" Calidad estrellas  "+aux.getId_hotel().getCalidad()+" "+aux.getId_habitacion().getNombre_categoria().getDescripcion()+" Cliente "+aux.getId_cliente().getNombre()+" Numero Habtiaciones "+aux.getNumero_habitaciones()+" Numero dias  "+aux.getDias()+" total a pagar "+valor);
        }
    }

    public void reportereservas(){
        String path="D:\\clase itp\\ejercicios individuales resueltos\\Taller_Final\\Reservaciones\\REPORTE_RESERVAS.txt";
        File file =new File(path);
        String reportetex="";
        for(Reservaciones aux:lista_reservaciones){
            int valor=0;
            valor+=(aux.calular())*aux.getNumero_habitaciones();
            valor=valor*aux.getDias();

            reportetex+=aux.getId_reserva()+" \t Hotel "+aux.getId_hotel().getNombre()+" \t Calidad estrellas  "+aux.getId_hotel().getCalidad()+" \t "+aux.getId_habitacion().getNombre_categoria().getDescripcion()+" \t Cliente "+aux.getId_cliente().getNombre()+" \t Numero Habtiaciones "+aux.getNumero_habitaciones()+" \t Total dias "+aux.getDias()+" \t Total reserva "+valor+"\n";
        }
        try{
            file.createNewFile();
            FileWriter fw= new FileWriter(file);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(reportetex);
            bw.close();


        }catch (Exception e){
            e.printStackTrace();

        }

    }





}
