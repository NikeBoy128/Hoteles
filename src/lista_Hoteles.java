import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class lista_Hoteles {
    ArrayList<Hotel> lista_hoteles=new ArrayList<>();

    public lista_Hoteles() {
    }

    public lista_Hoteles(ArrayList<Hotel> lista_hoteles) {
        this.lista_hoteles = lista_hoteles;
    }

    public ArrayList<Hotel> getLista_hoteles() {
        return lista_hoteles;
    }
    public void agregar(Hotel hotel){
        lista_hoteles.add(hotel);


    }

    public void setLista_hoteles(ArrayList<Hotel> lista_hoteles) {
        this.lista_hoteles = lista_hoteles;
    }

    public  lista_Hoteles obtenerdatos() {
        lista_Hoteles lista_de_hoteles = new lista_Hoteles();
        String path = "D:\\clase itp\\ejercicios individuales resueltos\\Taller_Final\\Reservaciones\\hoteles.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                StringTokenizer atributo = new StringTokenizer(linea, ",");
                Hotel hotel = new Hotel();
                while (atributo.hasMoreElements()) {
                    hotel.setId_hotel(atributo.nextElement().toString());
                    hotel.setNombre(atributo.nextElement().toString());
                    hotel.setCalidad(atributo.nextElement().toString());


                }


                lista_de_hoteles.agregar(hotel);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return lista_de_hoteles;








    }
    public void imprimir(){

        for(Hotel aux:lista_hoteles){
            System.out.println(aux.getId_hotel()+aux.getNombre()+aux.getCalidad());
        }

    }
    public Hotel buscar2(String Hotel){
        Hotel hotel_prueba=new Hotel();
        hotel_prueba.setId_hotel("1");
        hotel_prueba.setNombre("vacio");
        hotel_prueba.setCalidad("sin calidad");


        for(Hotel aux:lista_hoteles){
            if(aux.getId_hotel().compareTo(Hotel)==0){

                return aux;



            }

        }

        return hotel_prueba;

    }

}






