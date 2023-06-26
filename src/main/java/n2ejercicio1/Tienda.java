package n2ejercicio1;

public class Tienda {

    private final PasarelaPago pasarelaPago;

    public Tienda() {
        pasarelaPago = new PasarelaPago();
    }

    public void realizarCompra(MetodoPago metodoPago) {
        System.out.println("Realizando compra en la tienda...");
        pasarelaPago.procesarPago(metodoPago);
    }

}
