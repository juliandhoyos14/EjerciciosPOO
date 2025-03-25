package org.grasp.controller;

import java.util.UUID;

public class Reserva {

  private String codigoReserva;
  private String fechaEntrada;
  private String fechaSalida;
  private Usuario usuario;
  private Habitacion habitacion;

  public Reserva(String fechaEntrada, String fechaSalida, Usuario usuario, Habitacion habitacion) {
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.usuario = usuario;
    this.habitacion = habitacion;
    this.codigoReserva = UUID.randomUUID().toString();
  }

  public String getCodigoReserva() {
    return codigoReserva;
  }

  public String getFechaEntrada() {
    return fechaEntrada;
  }

  public String getFechaSalida() {
    return fechaSalida;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public Habitacion getHabitacion() {
    return habitacion;
  }
}
