import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Habitaciones {
    ArrayList<Habitaciones> lista_habitaciones=new ArrayList<>();

    public Lista_Habitaciones() {
    }

    public Lista_Habitaciones(ArrayList<Habitaciones> lista_habitaciones) {
        this.lista_habitaciones = lista_habitaciones;
    }

    public ArrayList<Habitaciones> getLista_habitaciones() {
        return lista_habitaciones;
    }

    public void setLista_habitaciones(ArrayList<Habitaciones> lista_habitaciones) {
        this.lista_habitaciones = lista_habitaciones;
    }
    public  void agregar (Habitaciones hab){
        lista_habitaciones.add(hab);
    }
    public  Lista_Habitaciones obtenerdatos(Lista_Categorias listacat) {
        Lista_Habitaciones lista_de_habitaciones = new Lista_Habitaciones();
        String path = "D:\\clase itp\\ejercicios individuales resueltos\\Taller_Final\\Reservaciones\\habitaciones.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                StringTokenizer atributo = new StringTokenizer(linea, ",");
                Habitaciones habitaciones = new Habitaciones();
                while (atributo.hasMoreElements()) {
                    habitaciones.setId_habitacion(atributo.nextElement().toString());
                    habitaciones.setNum_habitacion(atributo.nextElement().toString());
                    habitaciones.setNombre_categoria(listacat.buscar2(atributo.nextElement().toString()));



                }


                lista_de_habitaciones.agregar(habitaciones);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return lista_de_habitaciones;








    }
    public void imprimir(){
        for(Habitaciones aux:lista_habitaciones){
            System.out.println(aux.getId_habitacion()+" "+aux.getNum_habitacion()+" "+aux.getNombre_categoria().getDescripcion()+" ");
        }
    }
    public Habitaciones buscar2(String hab){
        Habitaciones habitacion =new Habitaciones();
        Categorias cat=new Categorias();
        habitacion.setId_habitacion("1");
        habitacion.setNum_habitacion("00");
        habitacion.setNombre_categoria(cat);

        for(Habitaciones aux:lista_habitaciones){
            if(aux.getId_habitacion().compareTo(hab)==0){

                return aux;



            }

        }

        return habitacion;

    }





}
