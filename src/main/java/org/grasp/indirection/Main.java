package org.grasp.indirection;

public class Main {

  public static void main(String[] args) {
    Persona luisa = new Persona("Luisa", "5555555", "123456789");
    Producto producto = new Producto("Producto 1", "123456");

    EntidadDAO<Persona> daoPersona = new EntidadDAO<>();
    EntidadDAO<Producto> daoProducto = new EntidadDAO<>();

    daoPersona.guardar(luisa);
    daoPersona.editar(luisa);
    daoPersona.eliminar(luisa);

    daoProducto.guardar(producto);
    daoProducto.editar(producto);
    daoProducto.eliminar(producto);
  }
}
