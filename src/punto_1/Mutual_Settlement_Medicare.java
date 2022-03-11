/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_1;

/**
 *
 * @author estudiante
 */
public class Mutual_Settlement_Medicare extends Mutual_Settlement {

    public Mutual_Settlement_Medicare() {
        this.setServicio("Medicare");
        this.vendeServicio();
    }
    
    public void vendeServicio(){
       System.out.println("Preparando el servicio "+this.getServicio()+" de la compañia Mutual");
    }
    
}
