package org.pilares.herencia.ejemplo3;

public class C implements A, B {

  @Override
  public void mostrar() {
    B.super.mostrar();
  }

  public static void main(String[] args) {
    C c = new C();
    c.mostrar();
  }
}
