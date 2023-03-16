/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extra3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        letra = letra.toUpperCase();
        
        switch (letra){
            case "A":
                System.out.println("La letra ingresada es vocal");
                break;
            case "E":
                System.out.println("La letra ingresada es vocal");
                break;
            case "I":
                System.out.println("La letra ingresada es vocal");
                break;
            case "O":
                System.out.println("La letra ingresada es vocal");
                break;
            case "U":
                System.out.println("La letra ingresada es vocal");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal");
        }
    }
    
}
