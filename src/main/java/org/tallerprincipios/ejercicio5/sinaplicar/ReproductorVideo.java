package org.tallerprincipios.ejercicio5.sinaplicar;

public class ReproductorVideo implements Dispositivo {

  @Override
  public void encender() {
    System.out.println("Encendiendo el reproductor de video...");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando el reproductor de video...");
  }

  @Override
  public void reproducirMusica() {
    throw new UnsupportedOperationException("El reproductor de video no puede reproducir música");
  }

  @Override
  public void mostrarVideo() {
    System.out.println("Mostrando video en el reproductor de video...");
  }
}
