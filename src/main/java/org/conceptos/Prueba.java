package org.conceptos;

class A {
   void mostrar() { // Cambiar private por protected
    System.out.println("Clase A");
  }
}

class B extends A {
  void mostrar() {
    System.out.println("Clase B");
  }
}

public class Prueba {
  public static void main(String[] args) {
    A obj = new B();
    obj.mostrar(); // Ahora imprimirá "Clase B"
  }
}
