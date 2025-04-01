package org.grasp.tiendaenlinea.model;

public class Producto {

  private String nombre;
  private double precio;
  private int cantidadDisponible;

  public Producto(String nombre, double precio, int cantidadDisponible) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidadDisponible = cantidadDisponible;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public boolean reducirStock(int cantidad) {
    if (cantidadDisponible >= cantidad) {
      cantidadDisponible -= cantidad;
      return true;
    }
    return false;
  }
}
