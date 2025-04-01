package org.practicas.dry.drycodigo;

public class Main {

  public static void main(String[] args) {
    Utilidad utilidad = new Utilidad();
    double promedioCalificaciones = utilidad.getPromedioCalificaciones(8, 9);
    double promedioVentas = utilidad.getPromedioVentas(1000, 2000);
    double promedioEdades = utilidad.getPromedioEdades(20, 30);

    System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
    System.out.println("Promedio de ventas: " + promedioVentas);
    System.out.println("Promedio de edades: " + promedioEdades);

    UtilidadRefactorizada utilidadRefactorizada = new UtilidadRefactorizada();
    double promedio = utilidadRefactorizada.getPromedio(8, 9, 10, 15);
    System.out.println("Promedio: " + promedio);
  }
}
