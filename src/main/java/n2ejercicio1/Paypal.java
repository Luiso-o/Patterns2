package n2ejercicio1;

public class Paypal implements MetodoPago{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con PayPal.");
    }
}
