package org.solid.ocp.admin.correcto;

public class Cancelacion implements Solicitud {

  @Override
  public void ejecutar() {
    System.out.println("Cancelando solicitud...");
  }
}
