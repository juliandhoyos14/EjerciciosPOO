package org.tallerprincipios.ejercicio2.sinaplicar;

public class Empleado {

  private String nombre;
  private String tipo;
  private double salario;

  public double calcularBono() {
    if (tipo.equals("gerente")) {
      return salario * 0.5;
    } else if (tipo.equals("desarrollador")) {
      return salario * 0.2;
    } else if (tipo.equals("asistente")) {
      return salario * 0.1;
    }
    return 0;
  }
}
