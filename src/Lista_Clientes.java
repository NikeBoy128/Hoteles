import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Clientes {
    ArrayList<Cliente> lista_clientes=new ArrayList<>();

    public Lista_Clientes() {
    }

    public Lista_Clientes(ArrayList<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    public  void agregar(Cliente cliente){
        lista_clientes.add(cliente);
    }
    public  Lista_Clientes obtenerdatos() {
        Lista_Clientes lista_de_clientes = new Lista_Clientes();
        String path = "D:\\clase itp\\ejercicios individuales resueltos\\Taller_Final\\Reservaciones\\clientes.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                StringTokenizer atributo = new StringTokenizer(linea, ",");
                Cliente cliente = new Cliente();
                while (atributo.hasMoreElements()) {
                    cliente.setId_cliente(atributo.nextElement().toString());
                    cliente.setNombre(atributo.nextElement().toString());
                    cliente.setCC(atributo.nextElement().toString());



                }


                lista_de_clientes.agregar(cliente);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return lista_de_clientes;








    }
    public Cliente buscar2(String cliente){
        Cliente clienteprue=new Cliente();
        clienteprue.setId_cliente("1");
        clienteprue.setNombre("sin nombre");
        clienteprue.setCC("0");

        for(Cliente aux:lista_clientes){
            if(aux.getId_cliente().compareTo(cliente)==0){

                return aux;



            }

        }

        return clienteprue;

    }

    public  void imprimir(){
        for(Cliente aux:lista_clientes){
            System.out.println(aux.getId_cliente()+" "+aux.getCC());
        }
    }






}
