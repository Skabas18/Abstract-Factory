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
public class Reliable_Insurance {
      private String serv;

    public String getServ() {
        return serv;
    }

    public void setServ(String serv) {
        this.serv = serv;
    }
    

    public void vendeServicio(){
        System.out.println("Preparando el servicio "+this.serv+" de la compañia Reliable");
    } 
}
