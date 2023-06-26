package org.example.n1ejercicio1;

public class Main {
    public static void main(String[] args) {
        Bolsa agente = new Bolsa();

        AgenciaBolsa agencia1 = new AgenciaBolsa("Agencia 1");
        AgenciaBolsa agencia2 = new AgenciaBolsa("Agencia 2");
        AgenciaBolsa agencia3 = new AgenciaBolsa("Agencia 3");

        agente.agregarObservador(agencia1);
        agente.agregarObservador(agencia2);
        agente.agregarObservador(agencia3);

        agente.setCambioBolsa(50);  // Simula un cambio en la bolsa (sube 50 puntos)

        agente.eliminarObservador(agencia2);

        agente.setCambioBolsa(-30); // Simula un cambio en la bolsa (baja 30 puntos)
    }
}