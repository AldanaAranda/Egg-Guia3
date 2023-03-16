/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.extra6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double altura;
        double suma = 0;
        double contador = 0;
        double sumaGeneral = 0;
        double contadorGeneral = 0;
        do {
            System.out.println("Ingrese su altura");
            altura = leer.nextDouble();
            if (altura < 1.60){
                suma = suma + altura;
                contador++;
            } 
            sumaGeneral = sumaGeneral + altura;
            contadorGeneral++;
            
        } while(altura > 0);
        
        double promedioDebajo = suma / (contador - 1);
        double promedioGeneral = sumaGeneral / (contadorGeneral - 1);
        
        System.out.println("el promedio de estaturas que se encuentran por debajo de 1.60 mts es: " + promedioDebajo);
        System.out.println("el promedio de estaturas en general es: " + promedioGeneral);
    }
    
}
