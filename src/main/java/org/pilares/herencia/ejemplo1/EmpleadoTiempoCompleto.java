package org.pilares.herencia.ejemplo1;

public class EmpleadoTiempoCompleto extends Empleado {

  private double salario;

  public EmpleadoTiempoCompleto(String nombre, double salario) {
    super(nombre);
    this.salario = salario;
  }
}
