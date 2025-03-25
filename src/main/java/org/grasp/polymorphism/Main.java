package org.grasp.polymorphism;

public class Main {

    public static void main(String[] args) {
      Figura circulo = new Circulo(5);
      System.out.println("El área del círculo es: " + circulo.calcularArea());

      Figura cuadrado = new Cuadrado(4);
      System.out.println("El área del cuadrado es: "+ cuadrado.calcularArea());
    }
}
