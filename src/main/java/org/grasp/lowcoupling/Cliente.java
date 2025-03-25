package org.grasp.lowcoupling;

public class Cliente {

  public static void main(String[] args) {
    ServicioNotificacion email = new ServicioEmail();
    ServicioNotificacion push = new ServicioPush();
    ServicioNotificacion sms = new ServicioSMS();

    String mensaje = "¡Hola, mundo!";

    email.enviarMensaje(mensaje);
    push.enviarMensaje(mensaje);
    sms.enviarMensaje(mensaje);
  }
}
