package org.grasp.purefabrication;

public class Logger {

  public void info(String message) {
    System.out.println("INFO: " + message);
  }

  public void debug(String message) {
    System.out.println("DEBUG: " + message);
  }

  public void error(String message) {
    System.out.println("ERROR: " + message);
  }
}
