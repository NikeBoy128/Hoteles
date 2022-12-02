import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Categorias {
    ArrayList<Categorias> lista_categorias=new ArrayList<>();

    public ArrayList<Categorias> getLista_categorias() {
        return lista_categorias;
    }

    public void setLista_categorias(ArrayList<Categorias> lista_categorias) {
        this.lista_categorias = lista_categorias;
    }

    public Lista_Categorias(ArrayList<Categorias> lista_categorias) {
        this.lista_categorias = lista_categorias;
    }

    public Lista_Categorias() {
    }

    public  void agregar(Categorias categoria){
        lista_categorias.add(categoria);
    }
    public  Lista_Categorias obtenerdatos() {
        Lista_Categorias lista_de_categorias = new Lista_Categorias();
        String path = "D:\\clase itp\\ejercicios individuales resueltos\\Taller_Final\\Reservaciones\\categorias.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                StringTokenizer atributo = new StringTokenizer(linea, ",");
                Categorias categorias = new Categorias();
                while (atributo.hasMoreElements()) {
                    categorias.setId_categoria(atributo.nextElement().toString());
                    categorias.setDescripcion(atributo.nextElement().toString());



                }


                lista_de_categorias.agregar(categorias);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return lista_de_categorias;








    }
    public  void imprimir(){
        for(Categorias aux:lista_categorias){
            System.out.println(aux.getId_categoria()+" "+aux.getDescripcion());
        }
    }
    public Categorias buscar(String categoria){
        for(Categorias aux:lista_categorias){
            if(aux.getId_categoria()==categoria){
                return aux;

            }

        }
        return null;

    }
    public Categorias buscar2(String categoria){
        Categorias catprueba=new Categorias();
        catprueba.setId_categoria("1");
        catprueba.setDescripcion("Categoria vacia");

        for(Categorias aux:lista_categorias){
            if(aux.getId_categoria().compareTo(categoria)==0){

                return aux;



            }

        }

        return catprueba;

    }




}
