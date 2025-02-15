package org.example.ejercicio8;

public class MainBiblioteca {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    biblioteca.insertarLibro(new Libro("titulo1", "autor1"))
        .insertarLibro(new Libro("titulo2", "autor2"))
        .insertarLibro(new Libro("titulo3", "autor3"));

    biblioteca.listarLibros();

    biblioteca.eliminarLibro("titulo2");

    biblioteca.listarLibros();

    biblioteca.mostrarLibro("titulo1");
  }
}
