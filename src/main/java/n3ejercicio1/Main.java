package n3ejercicio1;

public class Main {
    public static void main(String[] args) {
       HacerConversion conversorMoneda = new HacerConversion();
        MostrarPrecios mostradorPrecios = new MostrarPrecios(conversorMoneda);

        double precioProducto = 100.0;
        String monedaProducto = "EUR";

        mostradorPrecios.mostrarPrecio(precioProducto, monedaProducto);
    }
}
