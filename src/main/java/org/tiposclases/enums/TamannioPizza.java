package org.tiposclases.enums;

public enum TamannioPizza {

  PEQUENIA(4, "Pequeña"),
  MEDIANA(6, "Mediana"),
  GRANDE(8, "Grande");

  private int porciones;
  private String descripcion;

  TamannioPizza(int porciones, String descripcion) {
      this.porciones = porciones;
      this.descripcion = descripcion;
  }

  public int getPorciones() {
      return porciones;
  }

  public String getDescripcion() {
      return descripcion;
  }

  public void mostrarInformacion() {
      System.out.println("Porciones: " + porciones);
      System.out.println("Descripción: " + descripcion);
  }
}
