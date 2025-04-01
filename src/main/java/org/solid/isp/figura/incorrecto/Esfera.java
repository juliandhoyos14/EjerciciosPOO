package org.solid.isp.figura.incorrecto;

public class Esfera extends Figura {

    private double radio;

    public Esfera(double radio) {
      super(3);
      this.radio = radio;
    }

    @Override
    public double getLongitud() {
      return 2 * Math.PI * radio;
    }

    @Override
    public double getArea() {
      return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getVolumen() {
      return ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);
    }
}
