package org.solid.isp.dispositivo.incorrecto;

public class Main {

  public static void main(String[] args) {
    Dispositivo sensorTemperatura = new SensorTemperatura();
    sensorTemperatura.encender();
    sensorTemperatura.leerTemperatura();

    Dispositivo camaraSeguridad = new CamaraSeguridad();
    camaraSeguridad.encender();
    camaraSeguridad.tomarFoto();
    camaraSeguridad.ajustarBrillo(90);
    camaraSeguridad.leerTemperatura(); // Esto no debería ser posible
  }
}
