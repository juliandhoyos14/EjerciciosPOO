package org.conceptos.wrappers;

public class Ejemplo {

  public static void main(String[] args) {
    // Tipo primitivo
    int num1 = 10;

    // Wrapper Class
    Integer num2 = 20;

    // Autoboxing (primitivo a wrapper)
    Integer num3 = num1;

    // Unboxing (wrapper a primitivo)
    int num4 = num2;

    System.out.println("num1 (primitivo): " + num1);
    System.out.println("num2 (objeto): " + num2);
    System.out.println("num3 (autoboxing): " + num3);
    System.out.println("num4 (unboxing): " + num4);
  }
}
