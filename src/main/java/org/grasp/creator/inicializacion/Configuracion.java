package org.grasp.creator.inicializacion;

public class Configuracion {

  private String host;
  private String usuario;
  private String contrasena;

  public Configuracion(String host, String usuario, String contrasena) {
    this.host = host;
    this.usuario = usuario;
    this.contrasena = contrasena;
  }

  public Conexion crearConexion() {
    return new Conexion(this.host, this.usuario, this.contrasena);
  }
}
