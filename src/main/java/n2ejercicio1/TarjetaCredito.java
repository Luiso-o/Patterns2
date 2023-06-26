package n2ejercicio1;

public class TarjetaCredito implements MetodoPago{

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con tarjeta de crédito.");
    }
}
