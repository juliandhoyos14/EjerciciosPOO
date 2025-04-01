package org.solid.dip.almacenamiento.incorrecto;

public class Main {

  public static void main(String[] args) {
    ServicioAlmacenamiento servicioAlmacenamiento = new ServicioAlmacenamiento();
    String mensaje = "Hola mundo!";
    servicioAlmacenamiento.guardarEnArchivo(mensaje);
    servicioAlmacenamiento.guardarEnBD(mensaje);
    servicioAlmacenamiento.guardarEnNube(mensaje);
  }
}
