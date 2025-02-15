package org.tiposclases.anidada;

public class Main {

  public static void main(String[] args) {
    System.out.println(Externa.mensajeEstatico);

    // Uso de la clase anidada estática
    Externa.AnidadaEstatica anidadaEstatica = new Externa.AnidadaEstatica();
    anidadaEstatica.mostrarMensaje();

    // Instancia de la clase anidada no estática
    Externa externa = new Externa();
    Externa.AnidadaNoEstatica anidadaNoEstatica = externa.new AnidadaNoEstatica();
    anidadaNoEstatica.mostrarMensaje();
  }
}
