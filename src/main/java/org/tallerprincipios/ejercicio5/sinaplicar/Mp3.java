package org.tallerprincipios.ejercicio5.sinaplicar;

public class Mp3 implements Dispositivo {

  @Override
  public void encender() {
    System.out.println("Encendiendo el MP3...");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando el MP3...");
  }

  @Override
  public void reproducirMusica() {
    System.out.println("Reproduciendo música en el MP3...");
  }

  @Override
  public void mostrarVideo() {
    throw new UnsupportedOperationException("El MP3 no puede mostrar videos");
  }
}
