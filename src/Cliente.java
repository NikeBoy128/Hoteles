 class Cliente   {
    private  String id_cliente;
    private  String nombre;
    private  String CC;

     public Cliente(String id_cliente, String nombre, String CC) {
         this.id_cliente = id_cliente;
         this.nombre = nombre;
         this.CC = CC;
     }

     public Cliente() {

     }

     public String getId_cliente() {
         return id_cliente;
     }

     public void setId_cliente(String id_cliente) {
         this.id_cliente = id_cliente;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getCC() {
         return CC;
     }

     public void setCC(String CC) {
         this.CC = CC;
     }
 }
