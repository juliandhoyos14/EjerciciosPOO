package org.solid.isp.dispositivo.incorrecto;

public class CamaraSeguridad extends Dispositivo {

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
    System.out.println("Tomando foto con cámara de seguridad");
  }

  @Override
  public void ajustarBrillo(int nivel) {
    System.out.println("Ajustando brillo de cámara de seguridad a nivel " + nivel + "%");
  }

  @Override
  public void leerTemperatura() {
    throw new UnsupportedOperationException("La cámara de seguridad no puede leer temperatura");
  }
}
