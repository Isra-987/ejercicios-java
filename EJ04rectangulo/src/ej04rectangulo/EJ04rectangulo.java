/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04rectangulo;

import Servicios.rectanguloServicio;

/**
 *
 * @author gateway
 */
public class EJ04rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectanguloServicio rc = new rectanguloServicio();
        rc.crearRectangulos();
        System.out.println("el perimetro del rectangulo es "+rc.perimetro());
        System.out.println("la superficie del rectangulo es "+rc.superficie());
        rc.dibujaRectangulo();
    }
    
}
