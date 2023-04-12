/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12persona;

import Servicio.servicioPersona;
import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class Ej12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioPersona sp= new servicioPersona();
        Scanner leer = new Scanner(System.in);
        sp.crearPersona();
        System.out.println("edad tuya es "+sp.calcularEdad());
        System.out.println("ingrese una edad para comparar con la de la primera persona");
        System.out.println("la edad de la nueva persona es mayor a la tuya ? "+sp.mayorEdad(leer.nextLong()));
        
    }
    
}
