package org.pilares.encapsulamiento.ejemplovehiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    Vehiculo miCarro = new Vehiculo("Toyota", "Corolla", 2023, 1000);
    System.out.println(miCarro);
    miCarro.actualizarKilometraje(-500);
    System.out.println(miCarro);
    vehiculos.add(miCarro);

    Camion miCamion = new Camion("Ford", "F-150", 2022, 2000, 5000);
    System.out.println(miCamion);
    miCamion.setCapacidadCarga(4500);
    System.out.println(miCamion);
    vehiculos.add(miCamion);

    for (Vehiculo vehiculo : vehiculos) {
      System.out.println(vehiculo);
    }

    List<Vehiculo> vehiculosToyota = Vehiculo.findVehiculoByMarca("Toyota", vehiculos);
    for (Vehiculo vehiculo : vehiculosToyota) {
      System.out.println(vehiculo);
    }
  }
}
