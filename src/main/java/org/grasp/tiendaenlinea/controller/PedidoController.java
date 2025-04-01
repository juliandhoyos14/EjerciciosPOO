package org.grasp.tiendaenlinea.controller;

import org.grasp.tiendaenlinea.model.Cliente;
import org.grasp.tiendaenlinea.model.Pedido;
import org.grasp.tiendaenlinea.service.HistorialVentas;

public class PedidoController {

  private HistorialVentas historial;

  public PedidoController(HistorialVentas historial) {
    this.historial = historial;
  }

  public Pedido crearPedido(Cliente cliente) {
    return new Pedido(cliente);
  }

  public void procesarPedido(Pedido pedido) {
    pedido.mostrarPedido();
    historial.registrarVenta(pedido);
    System.out.println("Pedido procesado con éxito.\n");
  }
}
