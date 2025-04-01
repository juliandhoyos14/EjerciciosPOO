package org.grasp.informationexpert;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Inventario inventario = new Inventario();
    inventario.agregarProducto("001", 100, 2);
    inventario.agregarProducto("002", 200, 3);
    inventario.agregarProducto("003", 300, 4);
    System.out.println("Total: " + inventario.getTotal());

    List<DetalleProducto> productos = inventario.getRegistros();
  }
}
