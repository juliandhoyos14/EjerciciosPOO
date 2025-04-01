package org.practicas.lod.sinaplicar;

public class Main {

  public static void main(String[] args) {
    Libreria libreria = new Libreria();
    Libro libro = libreria.getLibros().stream()
        .filter(current -> current.getId() == 1)
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Libro no encontrado"));

    System.out.println("Información del libro:");
    System.out.println("Id: " + libro.getId());
    System.out.println("Libro: " + libro.getNombre());
    System.out.println("Número de páginas: " + libro.getNumeroPaginas());
    System.out.println("Autor: " + libro.getAutor().getNombre());
  }
}
