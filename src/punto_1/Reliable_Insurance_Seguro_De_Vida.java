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
public class Reliable_Insurance_Seguro_De_Vida extends Reliable_Insurance{

    public Reliable_Insurance_Seguro_De_Vida() {
        this.setServ("Seguro de vida de 8M");
        this.vendeServicio();
    }
    
     public void vendeServicio(){
        System.out.println("Preparando el servicio "+this.getServ()+" de la compañia Reliable");
    } 
}
