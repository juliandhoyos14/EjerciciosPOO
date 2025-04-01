package org.solid.dip.figura.incorrecto;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    FiguraManager figuraManager = new FiguraManager();

    figuraManager.agregarCirculos(List.of(new Circulo(5)));
    figuraManager.agregarCuadrados(List.of(new Cuadrado(4)));

    System.out.println("Total de áreas: " + figuraManager.getTotalAreas());
  }
}
