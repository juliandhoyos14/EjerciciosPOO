package org.example.ejercicio1;

public class Persona {

  private String nombre;
  private int edad;

  public Persona() {
  }

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String retornarDatos() {
      return "Nombre: " + nombre + " Edad: " + edad;
    }

    public void mostrarInformacion() {
      System.out.println(retornarDatos());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }
}
