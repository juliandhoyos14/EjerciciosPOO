package org.practicas.kiss;

public class Main {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    System.out.println("Calculadora");
    System.out.println("La suma de " + a + " y " + b + " es: " + Calculadora.sumar(a, b));
    System.out.println("La resta de " + a + " y " + b + " es: " + Calculadora.restar(a, b));
    System.out.println("La multiplicación de " + a + " y " + b + " es: " + Calculadora.multiplicar(a, b));
    System.out.println("La división de " + a + " y " + b + " es: " + Calculadora.dividir(a, b));

    System.out.println("\nCalculadoraSimple");
    System.out.println("La suma de " + a + " y " + b + " es: " + CalculadoraSimple.sumar(a, b));
    System.out.println("La resta de " + a + " y " + b + " es: " + CalculadoraSimple.restar(a, b));
    System.out.println("La multiplicación de " + a + " y " + b + " es: " + CalculadoraSimple.multiplicar(a, b));
    System.out.println("La división de " + a + " y " + b + " es: " + CalculadoraSimple.dividir(a, b));
  }
}
