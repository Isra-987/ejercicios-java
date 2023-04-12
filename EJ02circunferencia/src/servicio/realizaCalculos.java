/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class realizaCalculos {
    Circunferencia c1 = new Circunferencia();
   public void crearCircunferencia(){
        //instanciar un objeto de tipo Circunferencia
        
       //Lleno los atributos 
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese el radio ");
       c1.setRadio(leer.nextDouble());
       System.out.println("el radio ingresado es "+c1.getRadio() );
   
     }
   public double  area(){
          
       return 3.14*c1.getRadio()*c1.getRadio();
   }
   //Perimetro = 2 ∗ π ∗ radio
   public double perimetro(){
       return 2*3.14*c1.getRadio();
   }
    
}
