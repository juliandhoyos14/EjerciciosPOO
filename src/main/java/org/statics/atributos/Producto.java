package org.statics.atributos;

public class Producto {

  private String nombre;
  private double precio;

  // Atributo estático
  public static int contadorProductos = 0;

  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
    contadorProductos++; // Incrementa cada vez que se crea un Producto
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }
}
