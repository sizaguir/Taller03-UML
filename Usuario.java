package com.mycompany.ds;

import java.util.ArrayList;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    protected ArrayList<String> incidentes;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<String> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<String> incidentes) {
        this.incidentes = incidentes;
    }

       
    public boolean logIn(){
    //lógica
    return true;
    }
    
    public boolean logOut(){
    //lógica
    return true;  
    }
}
