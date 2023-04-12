/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author gateway
 */
public class creaRectangulo {
    private int base;
    private int  altura;
    
    //constructor por defecto

    public creaRectangulo() {
    }
    //constructor por parametros

    public creaRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //getters y setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}


