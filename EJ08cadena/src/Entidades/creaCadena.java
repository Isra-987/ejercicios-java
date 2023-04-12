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
public class creaCadena {
    private String frase;
    //constructor por parametros

    public creaCadena() {
    }
    //constructor por parametros
    public creaCadena(String frase) {
        this.frase = frase;
    }
    //getter y setter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
}
