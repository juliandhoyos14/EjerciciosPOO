package org.tallerprincipios.ejercicio6.sinaplicar;

public class PedidoController {

  public double calcularTotal(Pedido p) {
    double total = 0;
    for (Item i : p.items) {
      total += i.getPrecio() * i.getCantidad();
    }
    return total;
  }
}
