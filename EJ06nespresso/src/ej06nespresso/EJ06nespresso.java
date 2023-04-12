/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06nespresso;

import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class EJ06nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese edad (aa/mm/dd)");
        int aa = leer.nextInt();
        System.out.print("/");
        int mm = leer.nextInt();
        System.out.print("/");
        int dd = leer.nextInt();
        
        System.out.println("edad ingresada es "+aa+"/"+mm+"/"+cc );
        
    }
    
}
