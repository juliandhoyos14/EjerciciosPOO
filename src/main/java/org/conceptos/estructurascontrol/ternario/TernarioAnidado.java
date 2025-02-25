package org.conceptos.estructurascontrol.ternario;

public class TernarioAnidado {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    int c = 15;
    int mayor = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); //No se recomienda anidar ternarios, es mejor usar if-else

    System.out.println("El mayor es: "+mayor);
  }
}
