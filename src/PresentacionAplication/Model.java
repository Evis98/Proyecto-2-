/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionAplication;

import Logica.Usuario;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Daniel
 */
public class Model extends Observable{
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    

    Usuario current;

    public Model() {
        current = new Usuario();
    }

    public Usuario getCurrent() {
        return current;
    }

    public void setCurrent(Usuario current) {
        this.current = current;
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }    

}
