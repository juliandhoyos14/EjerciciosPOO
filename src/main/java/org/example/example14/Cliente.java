package org.example.example14;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  private String identificacion;
  private String nombre;
  private List<Pedido> pedidos;

  public Cliente(String identificacion, String nombre) {
    this.identificacion = identificacion;
    this.nombre = nombre;
    pedidos = new ArrayList<>();
  }

  public String getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

  public void adicionarPedido(Pedido pedido) {
    if (pedido.getIdCliente() == null) {
      pedidos.add(pedido);
      pedido.setIdCliente(identificacion);
    } else {
      System.out.println("El pedido ya está asignado");
    }
  }

  @Override
  public String toString() {
    StringBuilder listaPedidos = new StringBuilder();
    for (Pedido pedido : pedidos) {
      listaPedidos.append(pedido);
    }
    return "Cliente{" +
        "identificacion='" + identificacion + '\'' +
        ", nombre='" + nombre + '\'' +
        ", pedidos=" + pedidos +
        '}';
  }
}
