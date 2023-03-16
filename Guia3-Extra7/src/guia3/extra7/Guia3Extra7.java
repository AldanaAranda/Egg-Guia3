/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extra7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int max = 0;
        int min = 0;
        double contador = 0;
        double suma = 0;
        double promedio;
        int aux = 1;
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if (num != 0) {
                if (aux == 1){
                    max = num;
                    min = num;
                    contador++;
                } else if (num < min) {
                    min = num;
                    contador++;
                    suma = suma + min;
                } else if (num > max) {
                    max = num;
                    contador++;
                    suma = suma + max;
                }
                
                suma = suma + num;
                contador++;
            }
            aux++;
            promedio = suma / (contador - 1);
        } while (num > 0);
        
        System.out.println("el valor máximo es: " + max);
        System.out.println("el valor mínimo es: " + min);
        System.out.println("el promedio de los numeros es: " + promedio);
    }
    
}
