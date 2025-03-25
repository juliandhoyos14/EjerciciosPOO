package org.grasp.lowcoupling;

public class ServicioEmail implements ServicioNotificacion {

  @Override
  public void enviarMensaje(String mensaje) {
    System.out.println("Enviando mensaje por email: " + mensaje);
  }
}
