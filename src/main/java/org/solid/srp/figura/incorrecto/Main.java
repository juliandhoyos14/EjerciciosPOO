package org.solid.srp.figura.incorrecto;

public class Main {

  public static void main(String[] args) {
    System.out.println("-----------------Rectangulo:---------------------");
    Figura rectangulo = new Figura(10, 5);
    System.out.println("Perimetro: " + rectangulo.getPerimetro());
    System.out.println("Suma de angulos: " + rectangulo.getSumaAngulos());
    System.out.println("Diagonal: " + rectangulo.getDiagonal());

    System.out.println("-----------------Circulo:---------------------");
    Figura circulo = new Figura(5);
    System.out.println("Perimetro: " + circulo.getPerimetro());
    System.out.println("Suma de angulos: " + circulo.getSumaAngulos());
    System.out.println("Diagonal: " + circulo.getDiagonal());
  }
}
