package org.grasp.lowcoupling;

public class ServicioSMS implements ServicioNotificacion {

  @Override
  public void enviarMensaje(String mensaje) {
    System.out.println("Enviando mensaje por SMS: " + mensaje);
  }
}
