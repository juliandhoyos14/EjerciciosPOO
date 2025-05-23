package org.solid.isp.figura.incorrecto;

public class Main {

  public static void main(String[] args) {
    System.out.println("---------------Esfera 3D---------------");
    Figura esfera = new Esfera(5);
    System.out.println("Longitud: " + esfera.getLongitud());
    System.out.println("Área: " + esfera.getArea());
    System.out.println("Volumen: " + esfera.getVolumen());
    System.out.println("Dimensión: "+esfera.getDimension());

    System.out.println("---------------Circulo 2D---------------");
    Figura circulo = new Circulo(5);
    System.out.println("Longitud: " + circulo.getLongitud());
    System.out.println("Área: " + circulo.getArea());
    System.out.println("Dimensión: "+circulo.getDimension());

    System.out.println("---------------Circunferencia 1D---------------");
    Figura circunferencia = new Circunferencia(5);
    System.out.println("Longitud: "+circunferencia.getLongitud());
    System.out.println("Dimensión: "+circunferencia.getDimension());
  }
}
