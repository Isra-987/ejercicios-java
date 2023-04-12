/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.creaArreglo;
import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
public class servicioArreglo {

    creaArreglo a = new creaArreglo();
    //private creaArreglo arreglo;

    public void crearArreglo() {
         double[]  aux= new double [a.getArregloA().length];
         
        for (int i = 0; i < a.getArregloA().length; i++) {
            aux[i]= Math.random()*50;
            a.setArregloA(aux);
            
            System.out.printf("[ %.2f%s%n " , a.getArregloA()[i] , "]");
        }

    }

//    public void ordenMayor() {
//        double menor = 0;
//
//        for (int i = 0; i < arrayA.length; i++) {
//            for (int j = 1; j < (arrayA.length - i); j++) {
//                if (arrayA[j - 1] > arrayA[j]) {
//                    menor = arrayA[j - 1];
//                    arrayA[j - 1] = arrayA[j];
//                    arrayA[j] = menor;
//                }
//            }
//           // System.out.println(arrayA[i]);
//            
//        }
//        System.out.println("  ");
//        System.out.println(Arrays.toString(arrayA));
//    }
}
