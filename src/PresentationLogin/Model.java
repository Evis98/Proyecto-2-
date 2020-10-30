/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLogin;

import Logica.Usuario;

/**
 *
 * @author Daniel
 */
public class Model extends java.util.Observable {
    Usuario current;

    public Model() {
        setCurrent(new Usuario());
        
    }

    public void setCurrent(Usuario current) {
        this.current = current;   
    }

    public Usuario getCurrent() {
        return current;
    }

    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }    
}
