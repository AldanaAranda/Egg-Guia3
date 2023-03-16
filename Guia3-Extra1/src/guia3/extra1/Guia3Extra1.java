/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extra1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los minutos");
        int tiempo = leer.nextInt();
        int dia = 0;
        int hora = 0;
        int minutos = 0;
        
        while (tiempo > 0){
           if (tiempo >= 1440){
               dia++;
               tiempo = tiempo - 1440;
           } else if (tiempo >= 60){
               hora++;
               tiempo = tiempo - 60;
           } else {
               minutos++;
               tiempo = tiempo - 1;
           }
        }

        System.out.println("Segun los minutos ingresados: es " + dia + " dias y " + hora + " horas");
    }
    
}
