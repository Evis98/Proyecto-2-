/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentacionAplication;

import Aplication.Session;
import Logica.Usuario;

/**
 *
 * @author Daniel
 */
public class Controller {
    Model model;
    View view;
    
    PresentationLogin.Controller parent;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
        
        initOptions();
    }

    
    
    public void initOptions() {
     
        /*prestamo_Moddel =  new banca.presentation.prestamo.Model();
        prestamo_View = new banca.presentation.prestamo.View();
        prestamo_Controller = new banca.presentation.prestamo.Controller(prestamo_Moddel,prestamo_View);
        prestamo_Controller.setParent(this);
        view.addInternalFrame(prestamo_View);*/
    }
  
    
    public void prestamoShow(){
       // this.prestamo_Controller.show();
    }    

    public void preSet(){   
        model.setCurrent((Usuario)Session.instance().getAttribute(Session.USER_ATTRIBUTE));
        model.commit();
  
    }
    
    public void show(){
        this.view.setVisible(true);
    }

    public void hide(){
        this.view.setVisible(false);
    }
    
    public void logout(){
        //this.cliente_Controller.hide();
     
        this.hide();
        parent.logout();
    } 

      public void setParent(PresentationLogin.Controller parent) {
        this.parent = parent;
    }


    
}

