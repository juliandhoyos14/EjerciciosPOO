package org.conceptos.estructurascontrol.ciclowhile;

import java.util.Scanner;

public class AdivinarNumero {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroSecreto = (int) (Math.random() * 100) + 1;
    int intentos = 0;
    int numeroUsuario = 0;

    System.out.println("Adivina el número entre 1 y 100:");

    while (numeroUsuario != numeroSecreto) {
      System.out.print("Introduce tu intento: ");
      numeroUsuario = scanner.nextInt();
      intentos++;

      if (numeroUsuario < numeroSecreto) {
        System.out.println("Es mayor.");
      } else if (numeroUsuario > numeroSecreto) {
        System.out.println("Es menor.");
      }
    }

    System.out.println("¡Correcto! Lo adivinaste en " + intentos + " intentos.");
  }
}
