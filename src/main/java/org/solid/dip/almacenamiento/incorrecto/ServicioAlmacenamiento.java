package org.solid.dip.almacenamiento.incorrecto;

public class ServicioAlmacenamiento {

  private final AlmacenamientoArchivo almacenamientoArchivo = new AlmacenamientoArchivo();
  private final AlmacenamientoBD almacenamientoBD = new AlmacenamientoBD();
  private final AlmacenamientoNube almacenamientoNube = new AlmacenamientoNube();

  public void guardarEnArchivo(String info) {
    almacenamientoArchivo.guardar(info);
  }

  public void guardarEnBD(String info) {
    almacenamientoBD.guardar(info);
  }

  public void guardarEnNube(String info) {
    almacenamientoNube.guardar(info);
  }
}
