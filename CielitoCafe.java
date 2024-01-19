// Nuestra clase CielitoCafe implementa la interfaz Cafeteria
public class CielitoCafe  implements Cafeteria{

    //Utilizamos las instancias de esta clase para llamar a los metodos preparar y servir.
    @Override
    public void preparar() {
        System.out.println("Preparando los productos de la cafeteria.");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo los productos de la cafeteria.");

    }
}
