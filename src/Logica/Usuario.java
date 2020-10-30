/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author PC
 */
public class Usuario {
    //Daniel ACM1PT
    String id;
    String nombre;
    String password;
    
    List<Usuario> ListaContactos;

    public Usuario(String id, String nombre,  String password, List<Usuario> ListaContactos) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.ListaContactos = ListaContactos;
    }

    public Usuario(String id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        ListaContactos = new ArrayList<>();
    }

    public Usuario() {
         this.id ="";
        this.nombre = "";
        this.password = "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.password);
        hash = 67 * hash + Objects.hashCode(this.ListaContactos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
       
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.ListaContactos, other.ListaContactos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre +  ", password=" + password + ", ListaContactos=" + ListaContactos + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    
    
    
}
