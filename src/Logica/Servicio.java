/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.UsuarioDao;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Servicio {
    private static Servicio theInstance;
    public static Servicio instance(){
        if (theInstance==null){ 
            theInstance=new Servicio();
        }
        return theInstance;
    }
    
    private UsuarioDao usuarioDao;   
    
     public Servicio() {
        usuarioDao = new UsuarioDao();  
    }

    // ------------ USUARIO -------------    
    public Usuario get(Usuario o) throws Exception{
        return usuarioDao.read(o.getId());
    }  
    
    public List<Usuario> getClientes() {
        return usuarioDao.findAll();
    }
    
    public void add(Usuario o)throws Exception{
        usuarioDao.create(o);
    }

  
    public void update(Usuario o)throws Exception{
        usuarioDao.update(o);
        Usuario stored=this.get(o);
    }
    
    public List<Usuario> search(Usuario o){
        return usuarioDao.findByNombre(o); 
    }
    
}
