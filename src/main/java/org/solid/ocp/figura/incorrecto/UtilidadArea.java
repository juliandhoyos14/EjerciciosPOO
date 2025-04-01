package org.solid.ocp.figura.incorrecto;

public class UtilidadArea {

    public double calcularArea(Figura figura) {
      if (figura instanceof Rectangulo) {
        Rectangulo rectangulo = (Rectangulo) figura;
        return rectangulo.getBase() * rectangulo.getAltura();
      } else if (figura instanceof Circulo) {
        Circulo circulo = (Circulo) figura;
        return Math.PI * Math.pow(circulo.getRadio(), 2);
      } else {
        throw new UnsupportedOperationException("Figura no soportada");
      }
    }
}
