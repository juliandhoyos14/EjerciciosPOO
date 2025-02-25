package org.conceptos.estructurascontrol.ternario;

public class EjemploTernario {

  public static void main(String[] args) {
    int edad = 20;
    String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

    System.out.println(resultado);

    int a = 10;
    int b = 5;
    int mayor = ((a > b) && (a ==10)) ? a : b;

    System.out.println("El mayor es: " + mayor);
  }
}
