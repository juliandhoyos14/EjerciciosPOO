package org.practicas.lod.aplicado;

public class Libro {

  private int id;
  private String nombre;
  private int numeroPaginas;
  private Autor autor;

  public Libro(int id, String nombre, int numeroPaginas, Autor autor) {
    this.id = id;
    this.nombre = nombre;
    this.numeroPaginas = numeroPaginas;
    this.autor = autor;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public Autor getAutor() {
    return autor;
  }

  public void consultarInfoAutor() {
    System.out.println("Autor: " + autor.getNombre());
  }
}
