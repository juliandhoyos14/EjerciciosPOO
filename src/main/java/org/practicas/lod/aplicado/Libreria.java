package org.practicas.lod.aplicado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libreria {

  private final List<Libro> libros = new ArrayList<>();

  public Libreria() {
    libros.addAll(
        Arrays.asList(
            new Libro(1, "Libro 1", 100, new Autor("Autor 1")),
            new Libro(2, "Libro 2", 200, new Autor("Autor 2")),
            new Libro(3, "Libro 3", 300, new Autor("Autor 3"))
        )
    );
  }

  public void consultarAutorLibro(int idLibro) {
    this.getLibro(idLibro).consultarInfoAutor();
  }

  public Libro getLibro(int idLibro) {
    return libros.stream()
        .filter(current -> current.getId() == idLibro)
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
  }
}
