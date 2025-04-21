package org.tallerprincipios.ejercicio8.sinaplicar;

public class Servicio {

  private DatabaseLogger dbLogger;
  private FileLogger fileLogger;
  private ConsoleLogger consoleLogger;

  public void ejecutarTarea() {
    try {
      // Lógica de la tarea
      dbLogger.debug("Tarea ejecutada");
      fileLogger.debug("Tarea ejecutada");
      consoleLogger.debug("Tarea ejecutada");
    } catch (Exception e) {
      dbLogger.error(e.getMessage());
      fileLogger.error(e.getMessage());
    }
  }
}
