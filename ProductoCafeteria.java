abstract class ProductoCafeteria {
    //Atributos
    private String nombre;
    private double precio;

    //Metodo constructor
    public ProductoCafeteria(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Al menos un metodo abstracto
    public abstract String descripcion();
}
