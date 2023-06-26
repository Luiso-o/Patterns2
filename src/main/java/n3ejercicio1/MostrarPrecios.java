package n3ejercicio1;

public class MostrarPrecios {
    private final ConversorMoneda conversorMoneda;

    public MostrarPrecios(ConversorMoneda conversorMoneda) {
        this.conversorMoneda = conversorMoneda;
    }

    public void mostrarPrecio(double precio, String moneda) {
        System.out.println("Precio: " + precio + " " + moneda);

        // Convertir el precio a diferentes monedas
        double precioEnUSD = conversorMoneda.convertir(precio, moneda, "USD");
        double precioEnEUR = conversorMoneda.convertir(precio, moneda, "EUR");

        System.out.println("Precio en USD: " + precioEnUSD);
        System.out.println("Precio en EUR: " + precioEnEUR);

    }
}
