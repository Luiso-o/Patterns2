package n2ejercicio1;

public class CuentaBancaria implements MetodoPago{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con deuda en cuenta bancaria.");
    }
}
