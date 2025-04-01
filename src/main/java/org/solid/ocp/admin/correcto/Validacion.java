package org.solid.ocp.admin.correcto;

public class Validacion implements Solicitud {

  @Override
  public void ejecutar() {
    System.out.println("Ejecutando solicitud de validación...");
  }
}
