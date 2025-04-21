package org.practicas.dry.drynegocio;

public class UtilidadRefactorizada {

  // Esta refactorización no está bien, ya que combina la funcionalidad de dos contextos diferentes (edad y cantidad de productos)
  // en un solo metodo. Lo ideal sería tener dos métodos separados para cada contexto.
  public boolean validarEdadProducto(int valor) {
    return valor >= 18;
  }
}
