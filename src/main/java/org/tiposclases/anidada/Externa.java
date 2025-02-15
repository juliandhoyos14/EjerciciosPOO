package org.tiposclases.anidada;

public class Externa {

  // Atributo estático de la clase externa
  public static String mensajeEstatico = "Hola desde la clase externa (estático).";

  // Atributo no estático de la clase externa
  private String mensajeNoEstatico = "Hola desde la clase externa (no estático).";

  // Clase anidada estática
  public static class AnidadaEstatica {
    public void mostrarMensaje() {
      System.out.println(mensajeEstatico);
      //System.out.println(mensajeNoEstatico); // Error: No se puede acceder
    }
  }

  // Clase anidada no estática (inner class)
  public class AnidadaNoEstatica {
    public void mostrarMensaje() {
      System.out.println(mensajeEstatico);
      System.out.println(mensajeNoEstatico);
    }
  }
}
