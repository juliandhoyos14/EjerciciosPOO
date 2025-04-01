package org.solid.isp.dispositivo.correcto;

public class SensorTemperatura implements Sensor {

  @Override
  public void encender() {
    System.out.println("Encendiendo sensor de temperatura");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando sensor de temperatura");
  }

  @Override
  public void realizarLectura() {
    System.out.println("Realizando lectura de temperatura");
  }
}
