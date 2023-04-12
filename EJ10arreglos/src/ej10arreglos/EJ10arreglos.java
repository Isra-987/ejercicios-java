/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10arreglos;

//import Entidades.creaArreglo;
import java.text.DecimalFormat;
import java.util.Arrays;

//import Servicios.servicioArreglo;
/**
 *
 * @author gateway
 */
public class EJ10arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //      servicioArreglo sa = new servicioArreglo();
        //      sa.crearArreglo();
        // sa.ordenMayor();

        double a[] = new double[50];
        double b[] = new double[20];
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("arreglo A");
        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random() * 100);
            if (i % 10 == 0) {
                System.out.println(" ");

            }
            if (i == 49) {
                System.out.print(String.format("%.2f", a[i]));

            } else {
                System.out.print(String.format("%.2f", a[i]) + " ,");
            }
        }

        Arrays.sort(a);
        System.out.println("\n ");
        System.out.println("De forma ordenada\n");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println(" ");

            }
            if (i == 49) {
                System.out.println(String.format("%.2f", a[i]));

            } else {
                System.out.print(String.format("%.2f", a[i]) + " ,");
            }
        }

        /*for (int i = 0; i < 20; i++) {
            if(i>=10){
                b[i]= 0.5;
            }else{
                b[i] = a[i];
            }
        }*/
        Arrays.fill(b, 0.5);
        System.arraycopy(a, 0, b, 0, 10);
        System.out.println(" ");
        System.out.println("Arreglo B integra 10 numeros del arreglo A y 10 con valor 0.5");
        System.out.println("el de 20\n");
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                System.out.println("");
            }
            if (i == 19) {
                System.out.println(String.format("%.2f", b[i]));
            } else {
                System.out.print(String.format("%.2f", b[i]) + " ,");
            }
        }

    }
}
