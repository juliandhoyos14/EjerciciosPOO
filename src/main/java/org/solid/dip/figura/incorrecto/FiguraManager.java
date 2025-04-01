package org.solid.dip.figura.incorrecto;

import java.util.ArrayList;
import java.util.List;

public class FiguraManager {

  private final List<Circulo> circulos = new ArrayList<>();
  private final List<Cuadrado> cuadrados = new ArrayList<>();

  public double getTotalAreas() {
    double total = 0;
    for (Circulo circulo : circulos) {
      total += circulo.getArea();
    }
    for (Cuadrado cuadrado : cuadrados) {
      total += cuadrado.getArea();
    }
    return total;
  }

  public void agregarCirculos(List<Circulo> circulos) {
    this.circulos.addAll(circulos);
  }

  public void agregarCuadrados(List<Cuadrado> cuadrados) {
    this.cuadrados.addAll(cuadrados);
  }
}
