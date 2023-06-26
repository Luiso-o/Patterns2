package n2ejercicio1;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        // Realizar compra con tarjeta de crédito
        MetodoPago tarjetaCredito = new TarjetaCredito();
        tienda.realizarCompra(tarjetaCredito);

        // Realizar compra con PayPal
        MetodoPago paypal = new Paypal();
        tienda.realizarCompra(paypal);

        // Realizar compra con deuda en cuenta bancaria
        MetodoPago cuentaBancaria = new CuentaBancaria();
        tienda.realizarCompra(cuentaBancaria);

    }

}
