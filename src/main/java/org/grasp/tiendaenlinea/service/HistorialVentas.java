package org.grasp.tiendaenlinea.service;

import java.util.ArrayList;
import java.util.List;
import org.grasp.tiendaenlinea.model.Pedido;

public class HistorialVentas {

  private List<Pedido> ventas = new ArrayList<>();

  public void registrarVenta(Pedido pedido) {
    ventas.add(pedido);
  }

  public void mostrarHistorial() {
    System.out.println("\nHistorial de Ventas:");
    for (Pedido pedido : ventas) {
      System.out.println("Cliente: " + pedido.getCliente().getNombre() + " - Total: $" + pedido.calcularTotal());
    }
  }
}
