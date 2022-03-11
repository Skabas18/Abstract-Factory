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
public abstract class Mutual_Settlement  {
    
    private String servicio;

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    public void vendeServicio(){
        System.out.println("Preparando el servicio de la compañia Muttual");
    } 
}
