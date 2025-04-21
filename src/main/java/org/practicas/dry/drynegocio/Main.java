package org.practicas.dry.drynegocio;

public class Main {

  public static void main(String[] args) {
    Utilidad utilidad = new Utilidad();
    UtilidadRefactorizada utilidadRefactorizada = new UtilidadRefactorizada();

    int edad = 20;
    int cantidadProductos = 10;

    boolean esMayorDeEdad = utilidad.esMayorDeEdad(edad);
    boolean esMayorDeEdadRefactorizado = utilidadRefactorizada.validarEdadProducto(edad);

    boolean validarCantidadProductos = utilidad.validarCantidadProductos(cantidadProductos);
    boolean validarCantidadProductosRefactorizado = utilidadRefactorizada.validarEdadProducto(cantidadProductos);

    System.out.println("Es mayor de edad: " + esMayorDeEdad);
    System.out.println("Es mayor de edad refactorizado: " + esMayorDeEdadRefactorizado);

    System.out.println("Validar cantidad de productos: " + validarCantidadProductos);
    System.out.println("Validar cantidad de productos refactorizado: " + validarCantidadProductosRefactorizado);
  }
}
