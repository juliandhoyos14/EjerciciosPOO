package org.pilares.herencia.vehiculos;

public class Main {

  public static void main(String[] args) {
    Carro carro = new Carro("Toyota", 2022, 200, 4);
    carro.acelerar();
    System.out.println("Marca: " + carro.marca + " Modelo: " + carro.modelo + " Velocidad máxima: " + carro.velocidadMaxima + " Número de llantas: " + carro.getNumeroLlantas());

    Avion avion = new Avion("Boeing", 2022, 1000, 2);
    avion.acelerar();
    avion.volar();
    System.out.println("Marca: " + avion.marca + " Modelo: " + avion.modelo + " Velocidad máxima: " + avion.velocidadMaxima + " Número de motores: " + avion.getNumeroMotores());
  }
}
