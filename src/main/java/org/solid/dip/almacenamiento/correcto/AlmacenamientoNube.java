package org.solid.dip.almacenamiento.correcto;

public class AlmacenamientoNube implements ServicioAlmacenamiento {

  @Override
  public void guardar(String info) {
    System.out.println("Guardando en la nube: " + info);
  }
}
