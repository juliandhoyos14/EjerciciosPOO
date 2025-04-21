package org.tallerprincipios.ejercicio4.sinaplicar;

public class GestorArchivos {

  public void guardarArchivo(String contenido, String tipo) {
    if (tipo.equals("txt")) {
      // Lógica para guardar como texto
    } else if (tipo.equals("pdf")) {
      // Lógica para guardar como PDF
    } else if (tipo.equals("docx")) {
      // Lógica para guardar como Word
    }
  }

  public void cargarArchivo(String ruta, String tipo) {
    if (tipo.equals("txt")) {
      // Lógica para cargar texto
    } else if (tipo.equals("pdf")) {
      // Lógica para cargar PDF
    } else if (tipo.equals("docx")) {
      // Lógica para cargar Word
    }
  }
}
