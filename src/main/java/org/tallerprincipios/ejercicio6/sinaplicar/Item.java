package org.tallerprincipios.ejercicio6.sinaplicar;

public class Item {

  private String nombre;
  private double precio;
  private int cantidad;

  public Item(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }
}
