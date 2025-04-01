package org.solid.dip.almacenamiento.correcto;

public class AlmacenamientoBD implements ServicioAlmacenamiento {

  @Override
  public void guardar(String info) {
    System.out.println("Guardando en base de datos: " + info);
  }
}
