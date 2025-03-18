package org.pilares.polimorfismo.notificaciones;

public class EmailNotificador implements Notificador {

    @Override
    public void enviarNotificacion(String mensaje, String destinatario) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}
