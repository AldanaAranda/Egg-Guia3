/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        String opcion2 = "N";
        
        do{
            System.out.println("1: suma");
            System.out.println("2: resta");
            System.out.println("3: Multiplicacion");
            System.out.println("4: Division");
            System.out.println("5: Salir");
            int opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Desea salir? S/N");
                    opcion2 = leer.next();
                    break;
                default:
                        System.out.println("Opcion incorrecta");
            }
        } while (!opcion2.equals("S"));
    }
    
}
