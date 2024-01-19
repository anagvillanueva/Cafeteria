 public class Bebida extends ProductoCafeteria{
    private String tamaño;
     public Bebida(String nombre, double precio, String tamaño) {
         super(nombre, precio);
         this.tamaño = tamaño;
     }
     public String getTamaño() {
         return tamaño;
     }
     @Override
     public String descripcion() {
         return tamaño + " " + getNombre();
     }
 }
