/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLogin;

import Aplication.Session;
import Logica.Servicio;
import Logica.Usuario;

/**
 *
 * @author Daniel
 */
public class Controller {
    View view;
    Model model;

    PresentacionAplication.Model application_Moddel;
    PresentacionAplication.View application_View;
    PresentacionAplication.Controller application_Controller;
    
    public Controller( Model model, View view) {
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
        
        initOptions();        
    }
    
    public void initOptions() {
        application_Moddel =  new PresentacionAplication.Model();
        application_View = new PresentacionAplication.View();
        application_Controller = new PresentacionAplication.Controller(application_Moddel,application_View); 
        application_Controller.setParent(this);
    }    

    public void preSet(){
        model.setCurrent(new Usuario());
        model.commit();          
    }
    
    public void show(){
        view.setVisible(true);
    }
    
    public void hide(){
        this.view.setVisible(false);
    }
    
    public void login(Usuario typed){
        try {
            Usuario real = Servicio.instance().get(typed);
            model.setCurrent(real);            
            Session.instance().setAttibute(Session.USER_ATTRIBUTE, real);
            this.hide();
            application_Controller.preSet();
            application_Controller.show();
        } catch (Exception ex) {
            model.setCurrent(typed);
            model.commit();
        }
    }   

    public void logout(){
        Session.instance().removeAttribute(Session.USER_ATTRIBUTE);
        model.setCurrent(new Usuario());
        model.commit();        
        this.show();
    }
    
    public void exit(){
        System.exit(0);
    }

}
