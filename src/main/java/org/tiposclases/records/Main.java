package org.tiposclases.records;

public class Main {

  public static void main(String[] args) {
    Persona persona = new Persona("Juan", "Perez", 30);
    System.out.println(persona);
    System.out.println(persona.nombre());
    System.out.println(persona.apellido());
    System.out.println(persona.edad());

    Persona persona2 = new Persona("Juan", "Perez", 30);
    System.out.println(persona.equals(persona2));

    Persona persona3 = new Persona("Maria", "Perez", 30);
    System.out.println(persona.equals(persona3));

    System.out.println(persona);
  }
}
