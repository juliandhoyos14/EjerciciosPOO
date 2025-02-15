package org.tiposclases.enums;

public class PruebaPizza {

  public static void main(String[] args) {
    // Acceder a un tamaño de pizza específico
    TamannioPizza miPizza = TamannioPizza.PEQUENIA;
    System.out.println("\nHas elegido una pizza " + miPizza.getDescripcion() + ".");
    System.out.println("Tiene " + miPizza.getPorciones() + " porciones.");

    // Recorrer todos los tamaños de pizza
    for (TamannioPizza tamannio : TamannioPizza.values()) {
      tamannio.mostrarInformacion();
    }
  }
}
