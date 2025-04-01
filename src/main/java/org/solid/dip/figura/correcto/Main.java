package org.solid.dip.figura.correcto;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    FiguraManager figuraManager = new FiguraManager();

    List<Figura> figuras = Arrays.asList(new Circulo(5), new Cuadrado(4));
    figuraManager.agregarFiguras(figuras);
   
    System.out.println("Total de áreas: " + figuraManager.getTotalAreas());
  }
}
