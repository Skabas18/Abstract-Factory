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
public class Servicios_Seguros_De_Vida implements Companias{
     public  Reliable_Insurance getReliable_Insurance(){
        return new Reliable_Insurance_Seguro_De_Vida();
    }

    public Mutual_Settlement getMutual_Settlement() {
       return new Mutual_Settlement_Seguro_De_Vida();
    }

}
