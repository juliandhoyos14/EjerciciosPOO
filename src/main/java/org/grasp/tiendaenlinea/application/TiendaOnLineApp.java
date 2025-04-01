package org.grasp.tiendaenlinea.application;

import org.grasp.tiendaenlinea.controller.PedidoController;
import org.grasp.tiendaenlinea.model.Cliente;
import org.grasp.tiendaenlinea.model.Pedido;
import org.grasp.tiendaenlinea.model.Producto;
import org.grasp.tiendaenlinea.service.HistorialVentas;

public class TiendaOnLineApp {

  public static void main(String[] args) {
    // Crear productos
    Producto laptop = new Producto("Laptop", 1200, 5);
    Producto mouse = new Producto("Mouse", 25, 10);
    Producto teclado = new Producto("Teclado", 45, 8);

    // Crear cliente
    Cliente cliente = new Cliente("Juan Pérez");

    // Crear historial de ventas
    HistorialVentas historialVentas = new HistorialVentas();

    // Crear un controlador de pedidos
    PedidoController pedidoController = new PedidoController(historialVentas);

    // Crear un pedido a través del controlador
    Pedido pedido = pedidoController.crearPedido(cliente);
    pedido.agregarProducto(laptop, 1);
    pedido.agregarProducto(mouse, 2);
    pedido.agregarProducto(teclado, 1);

    // Procesar el pedido
    pedidoController.procesarPedido(pedido);

    // Mostrar el historial de ventas
    historialVentas.mostrarHistorial();
  }
}
