package org.example.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese el nombre de la persona: ");
      String nombre = scanner.nextLine();

      System.out.println("Ingrese la edad de la persona: ");
      int edad = scanner.nextInt();

      Persona persona1 = new Persona(nombre, edad);
      Persona persona2 = new Persona("Juan", 20);

      System.out.println(persona1 == persona2); // Comparación de referencias
      System.out.println(persona1.equals(persona2)); // Comparación de valores

      System.out.println(persona1.retornarDatos());
      System.out.println(persona2.retornarDatos());
    }
}
