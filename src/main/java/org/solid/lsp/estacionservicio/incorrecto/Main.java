package org.solid.lsp.estacionservicio.incorrecto;

public class Main {

  public static void main(String[] args) {
    EstacionServicio estacionServicio = new EstacionServicio();

    Vehiculo vehiculoCombustion = new VehiculoCombustion();
    Vehiculo vehiculoElectrico = new VehiculoElectrico();
    Vehiculo vehiculoHibrido = new VehiculoHibrido();

    estacionServicio.reabastecer(vehiculoCombustion, 50, 0);
    estacionServicio.reabastecer(vehiculoElectrico, 0, 50);
    estacionServicio.reabastecer(vehiculoHibrido, 50, 50);

    // No se puede recargar la batería de un vehículo de combustión
    vehiculoCombustion.recargarBateria(100);
  }
}
