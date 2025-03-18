package org.pilares.polimorfismo.notificaciones;

public class PushNotificador implements Notificador {

    @Override
    public void enviarNotificacion(String mensaje, String destinatario) {
        System.out.println("Enviando push a " + destinatario + ": " + mensaje);
    }
}
