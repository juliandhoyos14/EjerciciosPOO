package org.pilares.herencia.ejemplo5;

public class Motocicleta extends Vehiculo{

  private int numeroTiempos;

  public Motocicleta(String marca, String modelo, int velocidadMaxima, int numeroTiempos) {
    super(marca, modelo, velocidadMaxima);
    this.numeroTiempos = numeroTiempos;
  }

  public void picarMotocicleta() {
    System.out.println("Haciendo piques");
  }

  public int getNumeroTiempos() {
    return numeroTiempos;
  }

  public void setNumeroTiempos(int numeroTiempos) {
    this.numeroTiempos = numeroTiempos;
  }
}
