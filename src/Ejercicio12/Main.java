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
public class Main {

    public static void main(String[] args) {
        int cantHamster = 6, i;
        Plato plato = new Plato();
        Rueda rueda = new Rueda();
        Hamaca hamaca = new Hamaca();
        Accesorio[] accesorio = new Accesorio[]{plato, rueda, hamaca};//

        Thread[] hamster = new Thread[cantHamster];

        for (i = 0; i < cantHamster; i++) {
            
            hamster[i] = new Thread(new Hamster(accesorio), "Hamster" + (i + 1));

        }
        for(i=0;i<cantHamster;i++){
            
            hamster[i].start();
        }

    }
}
