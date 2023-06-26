package org.example.n1ejercicio1;

import java.util.ArrayList;

public class Bolsa {

    private final ArrayList<AgenciaObserver> observadores;
    private int cambioBolsa;

    public Bolsa() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(AgenciaObserver observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(AgenciaObserver observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (AgenciaObserver observador : observadores) {
            observador.actualizar(cambioBolsa);
        }
    }

    public void setCambioBolsa(int cambio) {
        cambioBolsa = cambio;
        notificarObservadores();
    }

}
