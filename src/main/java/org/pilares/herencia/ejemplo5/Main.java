package org.pilares.herencia.ejemplo5;

public class Main {

  public static void main(String[] args) {
    Carro carro = new Carro("Chevrolet", "Spark", 120, 4, "Sedan");
    carro.acelerar(100);
    carro.activarLimpiaBrisas();
    System.out.println("Marca: " + carro.getMarca());
    System.out.println("Modelo: " + carro.getModelo());
    System.out.println("Velocidad actual: " + carro.getVelocidadActual());
    System.out.println("Numero de puertas: " + carro.getNumeroPuertas());
    System.out.println("Tipo: " + carro.getTipo());

    Motocicleta motocicleta = new Motocicleta("Yamaha", "FZ", 150, 4);
    motocicleta.acelerar(100);
    motocicleta.picarMotocicleta();
    System.out.println("Marca: " + motocicleta.getMarca());
    System.out.println("Modelo: " + motocicleta.getModelo());
    System.out.println("Velocidad actual: " + motocicleta.getVelocidadActual());
    System.out.println("Numero de tiempos: " + motocicleta.getNumeroTiempos());
  }
}
