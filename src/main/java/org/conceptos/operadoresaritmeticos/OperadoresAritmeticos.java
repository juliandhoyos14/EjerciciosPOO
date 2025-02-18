package org.conceptos.operadoresaritmeticos;

public class OperadoresAritmeticos {

  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    // Suma
    int suma = a + b;
    System.out.println("Suma: " + suma);

    // Resta
    int resta = a - b;
    System.out.println("Resta: " + resta);

    // Multiplicación
    int multiplicacion = a * b;
    System.out.println("Multiplicación: " + multiplicacion);

    // División
    int division = a / b; // División entera
    double divisionReal = (double) a / b; // División con decimales
    System.out.println("División Entera: " + division);
    System.out.println("División Real: " + divisionReal);

    // Módulo (residuo)
    int modulo = a % b;
    System.out.println("Módulo: " + modulo);

    // Incremento (Postfijo y Prefijo)
    int x = 5;
    System.out.println("Valor inicial de x: " + x);
    System.out.println("x++ (postfijo, devuelve el valor y luego incrementa): " + x++);
    System.out.println("Valor de x después de x++: " + x);
    System.out.println("++x (prefijo, incrementa primero y luego devuelve el valor): " + ++x);

    // Decremento (Postfijo y Prefijo)
    int y = 5;
    System.out.println("Valor inicial de y: " + y);
    System.out.println("y-- (postfijo, devuelve el valor y luego decrementa): " + y--);
    System.out.println("Valor de y después de y--: " + y);
    System.out.println("--y (prefijo, decrementa primero y luego devuelve el valor): " + --y);
  }
}
