package org.grasp.controller;

import java.util.ArrayList;
import java.util.List;

public class HotelController {

  private String nombre;
  private List<Reserva> reservas;

  public HotelController(String nombre) {
    this.nombre = nombre;
    this.reservas = new ArrayList<>();
  }

  public void crearReserva(String fechaEntrada, String fechaSalida, Usuario usuario, Habitacion habitacion) {
    Reserva reserva = new Reserva( fechaEntrada, fechaSalida, usuario, habitacion);
    reservas.add(reserva);
    System.out.println(usuario.getNombre() + " ha reservado la habitación " + habitacion.getNumero() + " del hotel " + this.nombre);
  }

  public void cancelarReserva(String codigoReserva) throws Exception {
    Reserva reserva = reservas.stream()
        .filter(aux -> aux.getCodigoReserva().equals(codigoReserva))
        .findFirst()
        .orElseThrow(() -> new Exception("No se encontró una reserva con el código " + codigoReserva));

    String nombreUsuario = reserva.getUsuario().getNombre();
    System.out.println(nombreUsuario + " ha cancelado la reserva con código " + codigoReserva);
    reservas.remove(reserva);
  }

  public String obtenerCodigoReserva(String documento) throws Exception {
    return reservas.stream()
        .filter(aux -> aux.getUsuario().getDocumento().equals(documento))
        .map(Reserva::getCodigoReserva)
        .findFirst()
        .orElseThrow(() -> new Exception("No se encontró una reserva para el usuario con documento " + documento));
  }

  public String getNombre() {
    return nombre;
  }

  public List<Reserva> getReservas() {
    return reservas;
  }
}
