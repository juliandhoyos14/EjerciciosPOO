package org.pilares.polimorfismo.interfaces;

public class Computadora implements Comunicador {

    @Override
    public void llamar(String numero) {
        System.out.println("Llamando al número " + numero + " desde una aplicación VoIP en la computadora...");
    }
}
