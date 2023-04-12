/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.creaPersona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class servicioPersona {
    /*Scanner leer = new Scanner(System.in);
    creaPersona p1 = new creaPersona();
    
    public void crearPersona(){
        System.out.println("Ingrese nombre de la persona");
        p1.setNombre(leer.next());
        
    }*/
    Scanner leer = new Scanner(System.in);
    creaPersona p1 = new creaPersona();

    public void crearPersona () {
        
        int dia;
        int mes;
        int anio;
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese dia de nacimiento");
        dia=leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        mes=leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        anio=leer.nextInt();
        Date fecha= new Date(anio-1900,mes-1,dia);
        p1.setFechaNacimiento(fecha);
        System.out.println(p1.getFechaNacimiento());
        
      
    }
    
    public long  calcularEdad() {
        
       Date fechaActual = new Date();
       long fechaNacimientoMili = p1.getFechaNacimiento().getTime();
       long fechaActualMili = fechaActual.getTime();
       long diferenciaMili = fechaActualMili - fechaNacimientoMili;
       long calculoEdad = 1000l * 60l * 60l * 24l * 365l;
       long edad = (diferenciaMili /calculoEdad);
       
       return edad;
       
    }
    
    public boolean mayorEdad(long edad){
        return calcularEdad()<edad;
    }
}
