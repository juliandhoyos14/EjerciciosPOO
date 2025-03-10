package org.conceptos.estructurascontrol.ciclofor;

import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
      int numero = scanner.nextInt();

      for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero*i));
      }
    }
}
