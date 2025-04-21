package org.tallerprincipios.ejercicio8.sinaplicar;

public class FileLogger {

  public void debug(String message) {
    System.out.println("DEBUG: " + message);
  }

  public void error(String message) {
    System.out.println("ERROR: " + message);
  }
}
