package org.example.ejercicio14;

public class Main {

  public static void main(String[] args) {
    Producto producto1 = new Producto("1", "balon");
    Producto producto2 = new Producto("2", "bicicleta");
    Producto producto3 = new Producto("3", "guantes");
    //System.out.println(producto1);
    //System.out.println(producto2);
    //System.out.println(producto3);

    Cliente cliente1 = new Cliente("12345", "Juan Perez");
    //System.out.println(cliente1);
    Cliente cliente2 = new Cliente("6789", "Maria");
    //System.out.println(cliente2);

    Pedido pedido1 = new Pedido("pedido1");
    pedido1.adicionarProducto(producto1);
    pedido1.adicionarProducto(producto3);
    //System.out.println(pedido1);

    Pedido pedido2 = new Pedido("pedido2");
    pedido2.adicionarProducto(producto2);
    pedido2.adicionarProducto(producto3);
    //System.out.println(pedido2);

    cliente1.adicionarPedido(pedido1);
    cliente1.adicionarPedido(pedido2);
    System.out.println(cliente1);

    cliente2.adicionarPedido(pedido1);

  }
}
