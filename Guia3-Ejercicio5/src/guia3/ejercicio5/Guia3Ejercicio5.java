/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.

 */
package guia3.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un limite");
        int num = leer.nextInt();
        
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            int num2 = leer.nextInt();
            suma = suma + num2;
            
        } while (suma <= num);
    }
    
}
