package org.grasp.indirection;

public class Producto extends General {

  private String nombre;
  private String codigo;

  public Producto(String nombre, String codigo) {
    this.nombre = nombre;
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCodigo() {
    return codigo;
  }
}
