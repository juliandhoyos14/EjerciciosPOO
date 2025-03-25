package org.grasp.controller;

public class Usuario {

  private String documento;
  private String nombre;
  private String email;
  private String telefono;

  public Usuario(String documento, String nombre, String email, String telefono) {
    this.documento = documento;
    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
  }

  public String getDocumento() {
    return documento;
  }

  public String getNombre() {
    return nombre;
  }

  public String getEmail() {
    return email;
  }

  public String getTelefono() {
    return telefono;
  }
}
