package org.solid.lsp.estacionservicio.correcto;

public class Main {

  public static void main(String[] args) {
    EstacionServicio estacionServicio = new EstacionServicio();

    Vehiculo vehiculoCombustion = new VehiculoCombustion();
    Solicitud recargaCombustible = new Solicitud();
    recargaCombustible.setPorcentajeTanque(50);

    Vehiculo vehiculoElectrico = new VehiculoElectrico();
    Solicitud recargaElectrico = new Solicitud();
    recargaElectrico.setPorcentajeBateria(50);

    Vehiculo vehiculoHibrido = new VehiculoHibrido();
    Solicitud recargaHibrido = new Solicitud();
    recargaHibrido.setPorcentajeBateria(50);
    recargaHibrido.setPorcentajeTanque(50);

    estacionServicio.reabastecer(vehiculoCombustion, recargaCombustible);
    estacionServicio.reabastecer(vehiculoElectrico, recargaElectrico);
    estacionServicio.reabastecer(vehiculoHibrido, recargaHibrido);
  }
}
