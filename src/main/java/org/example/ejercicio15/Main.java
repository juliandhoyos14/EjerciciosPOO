package org.example.ejercicio15;

public class Main {

  public static void main(String[] args) {
    Editorial editorial = new Editorial("Planeta");
    Libro libro = new Libro("Programacion Orientada a Objetos", 2025);
    editorial.publicarLibro(libro);
    System.out.println(editorial);
    Libro libro2 = new Libro("Matematicas1", 2012);
    editorial.publicarLibro(libro2);
    System.out.println(editorial);
  }
}
