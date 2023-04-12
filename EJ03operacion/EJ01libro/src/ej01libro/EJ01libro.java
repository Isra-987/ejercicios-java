/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01libro;

import Entidades.creaLibro;
import Servicio.cargarLibro;

/**
 *
 * @author gateway
 */
public class EJ01libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cargarLibro cl = new cargarLibro();
        creaLibro l1 = cl.cargandoLibro();
        cl.mostrarLibro(l1);
    }
    
}
