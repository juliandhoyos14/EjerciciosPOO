package org.solid.isp.dispositivo.correcto;

public class CamaraSeguridad implements Camara {

  @Override
  public void encender() {
    System.out.println("Encendiendo cámara de seguridad");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando cámara de seguridad");
  }

  @Override
  public void tomarFoto() {
    System.out.println("Tomando foto de seguridad");
  }

  @Override
  public void ajustarBrillo(int nivel) {
    System.out.println("Ajustando brillo de la cámara de seguridad a " + nivel + "%");
  }
}
