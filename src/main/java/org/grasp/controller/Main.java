package org.grasp.controller;

public class Main {

  public static void main(String[] args) throws Exception {
    HotelController manager = new HotelController("Hotel X");
    Habitacion basica = new HabitacionSencilla(1, 100);
    Habitacion premium = new HabitacionPremium(2, 200);
    Habitacion lujo = new HabitacionLujo(3, 300);

    Usuario carlos = new Usuario("1", "Carlos", "carlos@foo.com", "123456789");
    Usuario andrea = new Usuario("2", "Andrea", "andrea@foo.com", "987654321");
    Usuario juan = new Usuario("3", "Juan", "juan@foo.com", "456789123");

    manager.crearReserva("2022-01-01", "2022-01-05", carlos, basica);
    manager.crearReserva("2022-01-01", "2022-01-05", andrea, premium);
    manager.crearReserva("2022-01-01", "2022-01-05", juan, lujo);

    String codigoReserva = manager.obtenerCodigoReserva("1");
    manager.cancelarReserva(codigoReserva);
  }
}
