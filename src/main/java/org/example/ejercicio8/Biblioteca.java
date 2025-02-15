package org.example.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

  private List<Libro> libros;

  public Biblioteca() {
    this.libros = new ArrayList<>();
  }

  public Biblioteca insertarLibro(Libro libro) {
    this.libros.add(libro);
    return this;
  }

  public void eliminarLibro(String titulo) {
    System.out.println(libros.removeIf(l -> l.getTitulo().equals(titulo))
            ? "Libro elimindo"
            : "libro no encontrado");
  }

  public void listarLibros() {
    if(libros.isEmpty()){
      System.out.println("No hay libros");
    } else {
      for (Libro libro : libros) {
        System.out.println(libro);
      }
      //libros.forEach(libro -> System.out.println(libro.getTitulo() + " " + libro.getAutor()));
    }
  }

  public void mostrarLibro(String titulo) {
    libros.stream().filter(lib -> lib.getTitulo().equals(titulo))
        .findFirst()
        .ifPresentOrElse(
            lib -> System.out.println("libro: " + lib.getAutor() + " " + lib.getTitulo()),
            () -> System.out.println("No se encuentra el libro")
        );
  }
}
