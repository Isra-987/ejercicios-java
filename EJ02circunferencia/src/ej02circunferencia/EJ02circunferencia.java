/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02circunferencia;


import servicio.realizaCalculos;

/**
 *
 * @author gateway
 */
public class EJ02circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        realizaCalculos rc = new realizaCalculos();
        rc.crearCircunferencia();
        System.out.println(" el Area  de la circunferencia es "+rc.area());
        System.out.println(" el Perimetro de la circunferencia es "+rc.perimetro());
    
    }
    
}
