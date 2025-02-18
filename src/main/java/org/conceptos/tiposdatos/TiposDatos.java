package org.conceptos.tiposdatos;

public class TiposDatos {

  byte b = 10;
  short s = 3000;
  int i = 100000;
  long l = 10000000000L;
  float f = 3.14f;
  double d = 3.14159265359;
  char c = 'A';
  boolean activo = true;

  public static void main(String[] args) {
    TiposDatos t = new TiposDatos();
    System.out.println("byte: " + t.b);
    System.out.println("short: " + t.s);
    System.out.println("int: " + t.i);
    System.out.println("long: " + t.l);
    System.out.println("float: " + t.f);
    System.out.println("double: " + t.d);
    System.out.println("char: " + t.c);
    System.out.println("boolean: " + t.activo);
  }
}
