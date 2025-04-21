package org.tallerprincipios.ejercicio7.sinaplicar;

public class Reserva {

  public void crearReserva(Usuario usuario, String tipoHabitacion) {
    if (tipoHabitacion.equals("sencilla")) {
      // Lógica para reserva sencilla
    } else if (tipoHabitacion.equals("suite")) {
      // Lógica para reserva suite
    }

    // Enviar confirmación por email
    EmailService email = new EmailService();
    email.enviar(usuario.getEmail(), "Confirmación de reserva");

    // Guardar en base de datos
    DatabaseManager db = new DatabaseManager();
    db.guardarReserva(this);
  }
}
