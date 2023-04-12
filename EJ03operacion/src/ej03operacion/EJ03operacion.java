/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03operacion;

import Servicios.OperacionServicio;

/**
 *
 * @author gateway
 */
public class EJ03operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionServicio op = new OperacionServicio();
        op.creaOperacion();
        System.out.println("la suma de los numeros ingresados es "+op.sumar());
        System.out.println("la resta de los numeros ingresados es "+op.resta());
        System.out.println("la multiplicacion de los numeros ingresados es "+op.multiplica());
        System.out.println("la division de los numeros ingresados es "+op.divida());
    }
    
}
