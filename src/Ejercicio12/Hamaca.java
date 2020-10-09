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
public class Hamaca extends Accesorio {

    public static final String VERDE = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String FINALIZAR_COLOR = "\u001B[0m";


    @Override
    public void usar() {
        try {
            miCerrojo.lock();//tomo cerrojo
            System.out.println(VERDE + Thread.currentThread().getName() + FINALIZAR_COLOR + RED+" durmiendo "+FINALIZAR_COLOR);
            super.usar();
            System.out.println(VERDE + Thread.currentThread().getName() + FINALIZAR_COLOR + " termino de"+RED+" dormir"+FINALIZAR_COLOR);
        } finally {
            miCerrojo.unlock();//libero cerrojo
        }
    }
}
