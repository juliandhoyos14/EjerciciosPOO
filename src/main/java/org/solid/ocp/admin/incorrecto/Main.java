package org.solid.ocp.admin.incorrecto;

public class Main {

  public static void main(String[] args) {
    Vicedecanatura vicedecanatura = new Vicedecanatura();
    vicedecanatura.realizarSolicitud(TipoSolicitud.HOMOLOGACION);
    vicedecanatura.realizarSolicitud(TipoSolicitud.CANCELACION);
    vicedecanatura.realizarSolicitud(TipoSolicitud.VALIDACION);
  }
}
