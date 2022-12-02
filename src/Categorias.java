 class Categorias {
    private  String id_categoria;
    private  String Descripcion;

     public Categorias(String id_categoria, String descripcion) {
         this.id_categoria = id_categoria;
         Descripcion = descripcion;
     }

     public Categorias() {

     }

     public String getId_categoria() {
         return id_categoria;
     }

     public void setId_categoria(String id_categoria) {
         this.id_categoria = id_categoria;
     }

     public String getDescripcion() {
         return Descripcion;
     }

     public void setDescripcion(String descripcion) {
         Descripcion = descripcion;
     }
 }
