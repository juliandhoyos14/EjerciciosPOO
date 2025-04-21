package org.tallerprincipios.ejercicio7.sinaplicar;

public class Usuario {

    private String nombre;
    private String email;
    private String telefono;

    public Usuario(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}
