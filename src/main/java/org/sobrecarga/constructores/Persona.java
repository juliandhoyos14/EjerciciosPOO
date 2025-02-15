package org.sobrecarga.constructores;

public class Persona {

  private String nombre;
  private String apellido;
  private int edad;

  public Persona() {
    this.nombre = "";
    this.apellido = "";
    this.edad = 0;
  }

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = 0;
  }

  public Persona(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "Persona{" +
        "nombre='" + nombre + '\'' +
        ", apellido='" + apellido + '\'' +
        ", edad=" + edad +
        '}';
  }
}
