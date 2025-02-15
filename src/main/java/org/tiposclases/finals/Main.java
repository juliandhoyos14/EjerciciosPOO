package org.tiposclases.finals;

public class Main {

  public static void main(String[] args) {
    // Constantes matemáticas
    System.out.println("El valor de PI es: " + ConstantesMatematicas.PI);
    System.out.println("El valor de E es: " + ConstantesMatematicas.E);

    // Cálculo del área de un círculo
    double radio = 5.0;
    double area = ConstantesMatematicas.calcularAreaCirculo(radio);
    System.out.println("El área de un círculo de radio " + radio + " es: " + area);

    // Cálculo de la potencia de un número
    double base = 2.0;
    double exponente = 3.0;
    double potencia = ConstantesMatematicas.calcularPotencia(base, exponente);
    System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia);
  }
}
