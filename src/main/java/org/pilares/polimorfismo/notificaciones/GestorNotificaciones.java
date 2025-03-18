package org.pilares.polimorfismo.notificaciones;

import java.util.List;

public class GestorNotificaciones {

  private List<Notificador> notificadores;

  public GestorNotificaciones(List<Notificador> notificadores) {
    this.notificadores = notificadores;
  }

  public void enviaNotificaciones(String mensaje, String destinatario) {
    for (Notificador notificador : notificadores) {
      notificador.enviarNotificacion(mensaje, destinatario);
    }
  }
}
