package org.solid.isp.dispositivo.correcto;

public class Main {

  public static void main(String[] args) {
    Camara camara = new CamaraSeguridad();
    camara.encender();
    camara.tomarFoto();
    camara.ajustarBrillo(90);
    camara.apagar();

    SensorTemperatura sensorTemperatura = new SensorTemperatura();
    sensorTemperatura.encender();
    sensorTemperatura.realizarLectura();
    sensorTemperatura.apagar();
  }
}
