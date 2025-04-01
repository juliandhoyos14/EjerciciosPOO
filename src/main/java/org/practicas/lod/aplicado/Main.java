package org.practicas.lod.aplicado;

public class Main {

  public static void main(String[] args) {
    Libreria libreria = new Libreria();
    Libro libro = libreria.getLibro(1);

    System.out.println("Información del libro:");
    System.out.println("Id: " + libro.getId());
    System.out.println("Libro: " + libro.getNombre());
    System.out.println("Número de páginas: " + libro.getNumeroPaginas());
    libro.consultarInfoAutor();
  }
}
