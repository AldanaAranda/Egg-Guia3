/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contadorF = 0;
        int contadorV = 0;
        do{
            System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            if(cadena.length() == 5){
                if ((cadena.substring(0,1).equals("X")) && (cadena.substring(4,5).equals("O"))){
                    contadorV++;
                } else {
                    contadorF++;
                }
            } else {
                contadorF++;
            }
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("El informe es:");
        System.out.println("Cantidad de cadenas correctas: " + contadorV);
        System.out.println("Cantidad de cadenas incorrectas: " + (contadorF - 1));
    }
    
}
