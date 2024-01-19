public class Cafe extends Bebida{
    private String tipo;

    public Cafe(String nombre, double precio, String tamaño, String tipo) {
        super(nombre, precio, tamaño);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String descripcion(){
        return getTamaño() + " " + tipo + " " + getNombre();
    }

}
