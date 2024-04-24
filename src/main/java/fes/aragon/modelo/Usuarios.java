package fes.aragon.modelo;

import java.io.Serializable;

public class Usuarios implements Serializable {
    private String nombre;
    private String apellidoPaterno;
    private String correo;

    public Usuarios() {
    }

    public Usuarios (String nombre, String apellidoPaterno, String correo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Apellido Paterno: " + apellidoPaterno + ", Correo: " + correo;
    }
}

