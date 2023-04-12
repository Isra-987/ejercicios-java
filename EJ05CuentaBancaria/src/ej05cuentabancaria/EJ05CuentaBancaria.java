/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05cuentabancaria;

import Servicio.servicioCuenta;
import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class EJ05CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        servicioCuenta sc = new servicioCuenta();

        int aux;
        do {
            System.out.println("menu de opciones ");
            System.out.println("1- crear una Cuenta");
            System.out.println("2- realizar un deposito ");
            System.out.println("3- realizar un retiro ");
            System.out.println("4- realizar un retiro minimo (maximo 20% de su saldo actual ");
            System.out.println("5- consultar datos de la cuenta");
            System.out.println("6- consultar saldo de la cuenta");
            System.out.println("7- salir ");
            System.out.print("escoger opcion ");
            aux = leer.nextInt();
            switch (aux) {
                case 1:
                    sc.crearCuenta();
                    break;
                case 2:
                    sc.ingresaDinero();
                    break;
                case 3:
                    sc.retiraDinero();
                    break;
                case 4:
                    sc.extraccionRapida();
                    break;
                case 5:
                    sc.consultaDatos();
                    break;
                case 6:
                    sc.consultaSaldo();
                    break;
                default :if (aux == 7) {
                    System.out.println("Adios vuelve pronto"); 
                break;
            }
                   

            }
           
            if (aux > 7) {
                 System.out.println("numero ingresado incorrecto ");
                break;
            }
        } while (aux > 0 || aux < 7);

    }

}
