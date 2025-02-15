package org.example.ejercicio15;

public class Libro {

  private String nombre;
  private int annioPublicacion;
  private String nombreEditorial;

  public Libro(String nombre, int annioPublicacion) {
    this.nombre = nombre;
    this.annioPublicacion = annioPublicacion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getAnnioPublicacion() {
    return annioPublicacion;
  }

  public void setAnnioPublicacion(int annioPublicacion) {
    this.annioPublicacion = annioPublicacion;
  }

  public String getNombreEditorial() {
    return nombreEditorial;
  }

  public void setNombreEditorial(String nombreEditorial) {
    this.nombreEditorial = nombreEditorial;
  }
}
