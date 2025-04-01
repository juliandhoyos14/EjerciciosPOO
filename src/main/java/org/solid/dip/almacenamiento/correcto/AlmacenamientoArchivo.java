package org.solid.dip.almacenamiento.correcto;

public class AlmacenamientoArchivo implements ServicioAlmacenamiento {

  @Override
  public void guardar(String info) {
    System.out.println("Guardando en archivo: " + info);
  }
}
