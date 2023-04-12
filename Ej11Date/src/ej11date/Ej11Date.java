/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11date;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class Ej11Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        int dia, mes, anio, edad;

        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el dia: ");
        dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = leer.nextInt()-1;
        System.out.print("Ingrese el año: ");
        anio = leer.nextInt() - 1900;

        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        
        edad = fechaActual.getYear() - fecha.getYear();
        
        System.out.println("La fecha inicial es. " + fecha);
        System.out.println("La fecha actual es: " +fechaActual);
        System.out.println("Han pasado " + edad + " años desde la fecha indicada");
        
    }
    
}
    
    
}
