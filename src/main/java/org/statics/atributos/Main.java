package org.statics.atributos;

public class Main {

  public static void main(String[] args) {
    Producto producto1 = new Producto("Producto 1", 100.0);
    Producto producto2 = new Producto("Producto 2", 200.0);
    Producto producto3 = new Producto("Producto 3", 300.0);

    System.out.println("Total de productos: " + Producto.contadorProductos);
  }
}
