package org.pilares.encapsulamiento.ejemplo2;

public class Persona {

  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    setEdad(edad);  // Se usa el setter para aplicar validación
  }

  // Getter para nombre
  public String getNombre() {
    return nombre;
  }

  // Setter para nombre
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Getter para edad
  public int getEdad() {
    return edad;
  }

  // Setter con validación
  public void setEdad(int edad) {
    if (edad > 0) {
      this.edad = edad;
    } else {
      System.out.println("Edad no válida.");
    }
  }
}
