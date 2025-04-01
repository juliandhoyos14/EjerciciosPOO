package org.solid.dip.almacenamiento.correcto;

public class Main {

  public static void main(String[] args) {
    String mensaje = "Hola, mundo!";

    ServicioAlmacenamiento servicioArchivo = new AlmacenamientoArchivo();
    servicioArchivo.guardar(mensaje);

    ServicioAlmacenamiento servicioBD = new AlmacenamientoBD();
    servicioBD.guardar(mensaje);

    ServicioAlmacenamiento servicioNube = new AlmacenamientoNube();
    servicioNube.guardar(mensaje);
  }
}
