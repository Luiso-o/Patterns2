package org.example.n1ejercicio1;

public class AgenciaBolsa implements AgenciaObserver {

    private final String nombre;

    public AgenciaBolsa(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(int cambio) {
        if (cambio > 0) {
            System.out.println(nombre + ": La bolsa ha subido " + cambio + " puntos.");
        } else if (cambio < 0) {
            System.out.println(nombre + ": La bolsa ha bajado " + Math.abs(cambio) + " puntos.");
        } else {
            System.out.println(nombre + ": No hay cambios en la bolsa.");
        }
    }

}
