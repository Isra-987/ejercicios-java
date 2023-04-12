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
public class creaCuenta {
    private int numCuenta;
    private long numCedula;
    private double saldoActual;
    private double interes;
    //constructor por defecto

    public creaCuenta() {
    }
    
    //constructor por parametros

    public creaCuenta(int numCuenta, long numCedula, double saldoActual, double interes) {
        this.numCuenta = numCuenta;
        this.numCedula = numCedula;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }
        
    
    //getters y setters

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(long numCedula) {
        this.numCedula = numCedula;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    
        
    
}
