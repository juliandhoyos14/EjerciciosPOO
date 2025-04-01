package org.practicas.dry.drycodigo;

import java.util.Arrays;

public class UtilidadRefactorizada {

  public double getPromedio(double... args) {
    return Arrays.stream(args).average().getAsDouble();
  }
}
