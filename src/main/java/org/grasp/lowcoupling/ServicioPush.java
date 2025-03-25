package org.grasp.lowcoupling;

public class ServicioPush implements ServicioNotificacion {

  @Override
  public void enviarMensaje(String mensaje) {
    System.out.println("Enviando mensaje por push: " + mensaje);
  }
}
