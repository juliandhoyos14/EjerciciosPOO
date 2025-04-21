package org.tallerprincipios.ejercicio1.sinaplicar;

public class Notificador {

  public void enviarNotificacion(String mensaje, String tipo) {
    if (tipo.equals("email")) {
      // Lógica para enviar email
      System.out.println("Enviando email: " + mensaje);
    } else if (tipo.equals("sms")) {
      // Lógica para enviar SMS
      System.out.println("Enviando SMS: " + mensaje);
    } else if (tipo.equals("push")) {
      // Lógica para notificación push
      System.out.println("Enviando notificación push: " + mensaje);
    }
  }
}
