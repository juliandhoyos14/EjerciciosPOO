package org.example.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Editorial {

  private String nombre;
  private List<Libro> librosPublicados;

  public Editorial(String nombre) {
      this.nombre = nombre;
      librosPublicados = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void publicarLibro(Libro libro) {
    libro.setNombreEditorial(this.nombre);
    librosPublicados.add(libro);
  }

  @Override
  public String toString() {
    String editorialImp = "Editorial: " + nombre + "\n";
    editorialImp = editorialImp + "Libros publicados: \n";
    for (Libro libro : librosPublicados) {
      editorialImp = editorialImp + "Libro: " + libro.getNombre() + " - Annio: " + libro.getAnnioPublicacion() + "\n";
    }
    return editorialImp;
  }
}
