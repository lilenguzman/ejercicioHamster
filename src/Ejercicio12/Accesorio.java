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
import java.util.Random;
import java.util.concurrent.locks.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Accesorio {
 
    Lock miCerrojo=new ReentrantLock();// creo el lock
       
    public void usar(){
        // Metodo que simula el tiempo de utilizacion del accesorio.
      try {
            
             Random tiempo = new Random();
            
            Thread.sleep((tiempo.nextInt(9) + 1) * 1000);
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Accesorio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
        
    }

