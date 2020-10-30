/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import java.io.IOException;
/**
 *
 * @authors Daniel Campos, Eva Durán y Miguel Montero
 */
public class aplication {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
         PresentationLogin.Model login_Moddel;
        PresentationLogin.View login_View;
        PresentationLogin.Controller login_Controller;
    
        login_Moddel =  new PresentationLogin.Model();
        login_View = new PresentationLogin.View();
        login_Controller = new PresentationLogin.Controller(login_Moddel,login_View);
        
        login_Controller.preSet();
        login_Controller.show();
        
    }   
}
