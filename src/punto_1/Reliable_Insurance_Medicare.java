package punto_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class Reliable_Insurance_Medicare extends Reliable_Insurance{

    public Reliable_Insurance_Medicare() {
        this.setServ("medicare");
        this.vendeServicio();
    }
    public void vendeServicio(){
        System.out.println("Preparando el servicio "+this.getServ()+" de la compañia Reliable");
    } 
}
