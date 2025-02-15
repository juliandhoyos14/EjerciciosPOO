package org.sobrecarga.constructores;

public class Main {

  public static void main(String[] args) {
    Persona persona1 = new Persona();
    Persona persona2 = new Persona("Juan", "Perez");
    Persona persona3 = new Persona("Maria", "Lopez", 30);

    System.out.println(persona1);
    System.out.println(persona2);
    System.out.println(persona3);
  }
}
