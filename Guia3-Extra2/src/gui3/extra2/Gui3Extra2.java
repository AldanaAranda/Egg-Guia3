/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3.extra2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Gui3Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        
        System.out.println("Valores iniciales:");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        
        int aux = B;
        
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valores finales:");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
    
}
