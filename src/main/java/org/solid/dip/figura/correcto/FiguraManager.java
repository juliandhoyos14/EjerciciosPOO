package org.solid.dip.figura.correcto;

import java.util.ArrayList;
import java.util.List;

public class FiguraManager {

  private final List<Figura> figuras = new ArrayList<>();

  public double getTotalAreas() {
    double totalAreas = 0;
    for (Figura figura : figuras) {
      totalAreas += figura.getArea();
    }
    return totalAreas;
  }

  public void agregarFiguras(List<Figura> figuras) {
    this.figuras.addAll(figuras);
  }
}
