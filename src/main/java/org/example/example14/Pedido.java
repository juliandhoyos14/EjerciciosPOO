package org.example.example14;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

  private String idPedido;
  private String idCliente;
  private List<Producto> productos;

  public Pedido(String idPedido) {
    this.idPedido = idPedido;
    this.idCliente = null;
    productos = new ArrayList<>();
  }

  public String getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(String idPedido) {
    this.idPedido = idPedido;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

  public void adicionarProducto(Producto producto) {
    productos.add(producto);
  }

  public String getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
  }

  public void borrarProducto(String idProducto) {
    for (Producto producto : productos) {
      if(idProducto.equals(producto.getIdProducto())) {
        productos.remove(producto);
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder listaProductos = new StringBuilder();
    for (Producto producto : productos) {
      listaProductos.append("id: ").append(producto.getIdProducto()).append(" - descripcion: ").append(producto.getDescripcion())
          .append("\n");
    }
    return "Pedido{" +
        "idPedido='" + idPedido + '\'' +
        ", productos=\n" + listaProductos +
        '}';
  }
}
