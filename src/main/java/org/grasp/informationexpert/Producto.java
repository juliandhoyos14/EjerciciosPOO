package org.grasp.informationexpert;

public class Producto {

  private String codigo;
  private double precio;

  public Producto(String codigo, double precio) {
    this.codigo = codigo;
    this.precio = precio;
  }

  public String getCodigo() {
    return codigo;
  }

  public double getPrecio() {
    return precio;
  }
}
