package org.solid.ocp.admin.correcto;

public class Homologacion implements Solicitud {

  @Override
  public void ejecutar() {
    System.out.println("Ejecutando solicitud de homologación...");
  }
}
