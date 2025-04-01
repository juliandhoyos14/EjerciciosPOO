package org.solid.ocp.admin.incorrecto;

public class Vicedecanatura {

  public void realizarSolicitud(TipoSolicitud solicitud) {
    switch (solicitud) {
      case HOMOLOGACION:
        homologar();
        break;
      case CANCELACION:
        cancelar();
        break;
      case VALIDACION:
        validar();
        break;
      default:
        throw new UnsupportedOperationException("Tipo de solicitud inválido: " + solicitud);
    }
  }

  private void homologar() {
    System.out.println("Homologando solicitud...");
  }

  private void cancelar() {
    System.out.println("Cancelando solicitud...");
  }

  private void validar() {
    System.out.println("Validando solicitud...");
  }
}
