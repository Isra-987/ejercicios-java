package Servicios;

import Entidades.creaPersona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPersona {

    Scanner leer = new Scanner(System.in);
    creaPersona p1 = new creaPersona();
    int var = 0;

    public creaPersona crearPersona() {

        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su peso");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        p1.setAltura(leer.nextDouble());

        do {
            System.out.println("Ingrese su sexo M-H-O");
            p1.setSexo(leer.next());
            if (p1.getSexo().equalsIgnoreCase("M") || p1.getSexo().equalsIgnoreCase("H") || p1.getSexo().equalsIgnoreCase("O")) {
                p1.setSexo(p1.getSexo());
                break;
            } else {
                System.out.println("Incorrecto");
                var = 1;
            }
        } while (var == 1);

        return p1;
    }
    /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.*/
    
    public double CalcularPesoIdeal(creaPersona p1 ){
        
       double IMC;
        IMC=(int) (p1.getPeso()/Math.pow(p1.getAltura(), 2));
        
        System.out.println("Bienvenido a peso ideal \n"
                + "-1= esta bajo de peso\n"
                + "0= su peso es el ideal\n"
                + "1= está en sobre peso\n");
        
        if (IMC<20) {
            IMC=-1;
            System.out.println(IMC);
            
            
        }else if (IMC>=20 && IMC<=25) {
            IMC=0;
            System.out.println(IMC);
            
        }else{
            IMC=1;
            System.out.println(IMC);
            
        }
        
        return IMC;
    }
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.*/
    
    public Boolean esMayorDeEdad(creaPersona p1){
        
        return p1.getEdad()>=18;
        
        }
    
}