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
public class Mutual_Settlement_Seguro_De_Vida extends Mutual_Settlement {

    public Mutual_Settlement_Seguro_De_Vida() {
        this.setServicio("Estableciendo el servicio de seguro de vida por 10M");
        this.vendeServicio();
    }
    public void vendeServicio(){
         System.out.println("Preparando el servicio "+this.getServicio()+" de la compañia Mutual");
    }
}
