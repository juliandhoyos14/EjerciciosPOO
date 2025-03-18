package org.pilares.polimorfismo.notificaciones;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // Crear instancias de los notificadores
    Notificador email = new EmailNotificador();
    Notificador sms = new SMSNotificador();
    Notificador push = new PushNotificador();

    // Crear un gestor de notificaciones con los diferentes canales
    GestorNotificaciones gestor = new GestorNotificaciones(Arrays.asList(email, sms, push));

    // Enviar una notificación a un usuario
    gestor.enviaNotificaciones("Tu pedido ha sido enviado", "juan@gmail.com");
  }
}
