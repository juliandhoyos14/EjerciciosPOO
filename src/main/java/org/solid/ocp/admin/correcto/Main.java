package org.solid.ocp.admin.correcto;

public class Main {

  public static void main(String[] args) {
    Vicedecanatura vicedecanatura = new Vicedecanatura();

    Solicitud cancelacion = new Cancelacion();
    Solicitud homologacion = new Homologacion();
    Solicitud validacion = new Validacion();

    vicedecanatura.realizarSolicitud(cancelacion);
    vicedecanatura.realizarSolicitud(homologacion);
    vicedecanatura.realizarSolicitud(validacion);
  }
}
