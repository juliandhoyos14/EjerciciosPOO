package org.solid.srp.figura.correcto;

public class Main {

  public static void main(String[] args) {
    System.out.println("-----------------Rectangulo:---------------------");
    Poligono rectangulo = new Rectangulo(10, 5);
    System.out.println("Perimetro: "+rectangulo.getPerimetro());
    System.out.println("Suma de angulos: "+rectangulo.getSumaAngulos());
    System.out.println("Diagonal: "+rectangulo.getDiagonal());

    System.out.println("-----------------Circulo:---------------------");
    Figura circulo = new Circulo(5);
    System.out.println("Perimetro: "+circulo.getPerimetro());
    //System.out.println("Suma de angulos: "+circulo.getSumaAngulos());
    //System.out.println("Diagonal: "+circulo.getDiagonal());
  }
}
