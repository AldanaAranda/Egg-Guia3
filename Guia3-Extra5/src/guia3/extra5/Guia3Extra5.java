/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extra5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su clase de socio");
        String socio = leer.next();
        socio = socio.toUpperCase();
        
        System.out.println("Ingrese el costo del tratamiento");
        int costoInicial = leer.nextInt();
        
        int costoFinal;
        
        switch(socio){
            case "A":
                costoFinal = (costoInicial * 50) / 100;
                System.out.println("El importe en efectivo a pagar es: " + costoFinal);
                break;
            case "B":
                costoFinal = (costoInicial * 35) / 100;
                System.out.println("El importe en efectivo a pagar es: " + costoFinal);
                break;
            case "C":
                System.out.println("El importe en efectivo a pagar es: " + costoInicial);
                break;
            default:
                System.out.println("La clase de socio");
        }
    }
    
}
