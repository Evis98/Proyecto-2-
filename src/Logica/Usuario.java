/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author PC
 */
public class Usuario {
    //Daniel ACM1PT
    int id;
    String nombre;
    String host;
    String password;
    
    List<Usuario> ListaContactos;

    public Usuario(int id, String nombre, String host, String password, List<Usuario> ListaContactos) {
        this.id = id;
        this.nombre = nombre;
        this.host = host;
        this.password = password;
        this.ListaContactos = ListaContactos;
    }

    public Usuario(int id, String nombre, String host, String password) {
        this.id = id;
        this.nombre = nombre;
        this.host = host;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Usuario> getListaContactos() {
        return ListaContactos;
    }

    public void setListaContactos(List<Usuario> ListaContactos) {
        this.ListaContactos = ListaContactos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", host=" + host + ", password=" + password + ", ListaContactos=" + ListaContactos + '}';
    }
    
    
    
    
}
