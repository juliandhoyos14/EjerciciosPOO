package org.grasp.purefabrication;

public class Servicio {

  private Logger logger = new Logger();

  public void realizarOperacion() {
    logger.info("Realizando operacion");
  }

  public void realizarOtraOperacion() {
    logger.debug("Realizando operacion en modo debug");
  }
}
