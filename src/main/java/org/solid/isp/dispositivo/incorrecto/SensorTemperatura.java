package org.solid.isp.dispositivo.incorrecto;

public class SensorTemperatura extends Dispositivo {

  @Override
  public void encender() {
    System.out.println("Encendiendo sensor de temperatura");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando sensor de temperatura");
  }

  @Override
  public void tomarFoto() {
    throw new UnsupportedOperationException("El sensor de temperatura no puede tomar fotos");
  }

  @Override
  public void ajustarBrillo(int nivel) {
    throw new UnsupportedOperationException("El sensor de temperatura no tiene brillo");
  }

  @Override
  public void leerTemperatura() {
    System.out.println("Leyendo temperatura");
  }
}
