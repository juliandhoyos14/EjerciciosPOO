package org.example.example14;

public class Producto {

  private String idProducto;
  private String descripcion;

  public Producto(String idProducto, String descripcion) {
    this.idProducto = idProducto;
    this.descripcion = descripcion;
  }

  public String getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(String idProducto) {
    this.idProducto = idProducto;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return "Producto{" +
        "idProducto='" + idProducto + '\'' +
        ", descripcion='" + descripcion + '\'' +
        '}';
  }
}
