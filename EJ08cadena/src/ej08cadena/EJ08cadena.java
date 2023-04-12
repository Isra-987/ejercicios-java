/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08cadena;

import Servicios.servicioCadena;
import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class EJ08cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioCadena sc = new servicioCadena();
        sc.crearCadena();
        sc.mostrarVocales();
        sc.invertirFrase();
        System.out.println("ingrese caracter a buscar en la frase ");
        String aux;
        sc.vecesRepetida(aux=leer.next());
    }
    
}
