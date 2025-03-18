package org.pilares.polimorfismo.estatico;

public class Main {

    public static void main(String[] args) {
      Calculadora calc = new Calculadora();
      System.out.println(calc.sumar(5, 10));     // Usa el primer método
      System.out.println(calc.sumar(5, 10, 20)); // Usa el segundo método
      System.out.println(calc.sumar(5.5, 2.3));  // Usa el tercer método
    }
}
