package org.grasp.informationexpert;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

  private final List<DetalleProducto> registros = new ArrayList<>();
  private double total = 0;

  public void agregarProducto(String codigo, double precio, int cantidad) {
    Producto producto = new Producto(codigo, precio);
    DetalleProducto detalleProducto = new DetalleProducto(producto, cantidad);
    registros.add(detalleProducto);
    total += detalleProducto.getCostoTotalProducto();
  }

    public double getTotal() {
      return total;
    }

    public List<DetalleProducto> getRegistros() {
      return registros;
    }
}
