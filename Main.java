public class Main {
    public static void main(String[] args) {

       //Crear instancia de Cafe
        Cafe miCafe = new Cafe("Latte", 35.50,"Grande","Descafeinado");

        //Crear una instancia de Cafeteria
        CielitoCafe miCafeteria = new CielitoCafe();

        miCafeteria.preparar();
        miCafeteria.servir();

        //Acceder a los atributos y metodos
        System.out.println("Descripcion del cafe: " + miCafe.descripcion());
        System.out.println("Precio del cafe: $" + miCafe.getPrecio());
    }
}