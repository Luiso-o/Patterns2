package n3ejercicio1;

import java.util.*;

public class HacerConversion implements ConversorMoneda{
    private final Map<String, Double> tiposCambio;

    public HacerConversion() {
        tiposCambio = new HashMap<>();
        tiposCambio.put("USD-EUR", 0.85);
        tiposCambio.put("EUR-USD", 1.18);
        // Agregar más tipos de cambio según sea necesario
    }

    public double convertir(double precio, String monedaOrigen, String monedaDestino) {
        String clave = monedaOrigen + "-" + monedaDestino;
        double tipoCambio = tiposCambio.getOrDefault(clave, 1.0);
        return precio * tipoCambio;
    }
}
