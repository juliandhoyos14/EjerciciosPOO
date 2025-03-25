package org.grasp.indirection;

public class EntidadDAO <T extends General> {

  public void guardar(T entidad) {
    System.out.println("Guardando entidad: " + entidad.getId());
  }

  public void editar(T entidad) {
    System.out.println("Editando entidad: " + entidad.getId());
  }

  public void eliminar(T entidad) {
    System.out.println("Eliminando entidad: " + entidad.getId());
  }
}
