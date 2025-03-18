package org.pilares.polimorfismo.interfaces;

public class Main {

  public static void main(String[] args) {
    // Arreglo de dispositivos de comunicación
    Comunicador[] dispositivos = {
        new TelefonoFijo(),
        new TelefonoMovil(),
        new Computadora()
    };

    // Simulamos hacer una llamada desde distintos dispositivos
    for (Comunicador dispositivo : dispositivos) {
      dispositivo.llamar("+123456789");
    }
  }
}
