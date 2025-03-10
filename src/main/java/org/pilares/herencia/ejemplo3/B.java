package org.pilares.herencia.ejemplo3;

public interface B {

    default void mostrar() {
        System.out.println("B");
    }
}
