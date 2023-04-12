/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.creaCuenta;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el
 * saldo actual (entero). Las operaciones asociadas a dicha clase son: a)
 * Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés. b) Agregar los métodos getters y setters correspondientes c) Metodo
 * para crear un objeto Cuenta, pidiéndole los datos al usuario. d) Método
 * ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual. e) Método retirar(double retiro): el método
 * recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si
 * la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual
 * en 0. f) Método extraccionRapida(): le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. g) Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. h)
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class servicioCuenta {

    creaCuenta c1 = new creaCuenta();
    Scanner leer = new Scanner(System.in);

    public void crearCuenta() {

        System.out.println("ingrese numero de cuenta ");
        c1.setNumCuenta(leer.nextInt());
        System.out.println("ingrese numero de cedula ");
        c1.setNumCedula(leer.nextLong());
        c1.setSaldoActual(0);
    }

    public void ingresaDinero() {
        System.out.println("Ingrese dinero (monto que ingresara) ");
        double auxI = leer.nextDouble();
        //double auxI1=c1.getSaldoActual();
        //auxI1+=auxI;
        c1.setSaldoActual(auxI+c1.getSaldoActual());
    }

    public void retiraDinero(){
        System.out.println("Ingrese monto a retirar ");
         double auxR = leer.nextDouble();
        //double auxR1 = c1.getSaldoActual();
        //auxR1-=auxR;
        c1.setSaldoActual(c1.getSaldoActual()-auxR);
    }
    
    public void extraccionRapida(){
        double auxRap;
        do{
            System.out.println("ingrese monto a retirar (maximo 20% de su saldo actual) ");
            auxRap = leer.nextDouble();
            
        }while(auxRap>0.2*c1.getSaldoActual());
        //double auxRap1 = c1.getSaldoActual();
        //auxRap1-=auxRap;
        c1.setSaldoActual(c1.getSaldoActual()-auxRap);
    }
    
    public void consultaSaldo(){
        
        System.out.println("su saldo actual es "+c1.getSaldoActual());
        
    }
   
    public void consultaDatos(){
        System.out.println("su numero de cuenta es "+c1.getNumCuenta());
        System.out.println("su numero de cedula es "+c1.getNumCedula());
    }
}
