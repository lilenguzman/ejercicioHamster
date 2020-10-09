/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

/**
 *
 * @author LILEN
 */
public class Hamster implements Runnable {
    private Accesorio [] accesorio;
    int numActividad=3;//
    public Hamster(Accesorio[] a){
        this.accesorio=a;//recibe el arreglo accesorio.
    }
    
    public void run(){
        
        int i;
        for(i=0;i<this.numActividad;i++){
            accesorio[i].usar();//numero de actividad que realiza el hamster
//primero come, despues hace ejercicio y despues duerme
        }
    }
    public void actividad(){
        
    }
}
