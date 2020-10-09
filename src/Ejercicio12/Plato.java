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
public class Plato extends Accesorio {
    public static final String VERDE = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String FINALIZAR_COLOR = "\u001B[0m";

    
    @Override
    public void usar(){
         
        try {
            miCerrojo.lock();//tomo cerrojo
            System.out.println(VERDE + Thread.currentThread().getName() + FINALIZAR_COLOR + " esta"+CYAN+" comiendo "+FINALIZAR_COLOR );
            super.usar();
            System.out.println(VERDE + Thread.currentThread().getName() + FINALIZAR_COLOR + " termino de"+CYAN+" comer"+FINALIZAR_COLOR );
        } finally {
            miCerrojo.unlock();//libero cerrojo
        }
    }
    
}
