/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++){
            for (int j = 1; j<= num; j++){
                if ((j > 1) && (j < num) && (i > 1) && (i < num)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
