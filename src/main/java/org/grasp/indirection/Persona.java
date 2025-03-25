package org.grasp.indirection;

public class Persona extends General {

  private String nombre;
  private String telefono;
  private String documento;

  public Persona(String nombre, String telefono, String documento) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.documento = documento;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public String getDocumento() {
    return documento;
  }
}
