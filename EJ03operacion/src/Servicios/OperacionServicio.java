/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.creaOperaciones;
import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: a) Método
 * constructor con todos los atributos pasados por parámetro. b) Metodo
 * constructor sin los atributos pasados por parámetro. c) Métodos get y set. d)
 * Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto. e) Método sumar(): calcular la suma de
 * los números y devolver el resultado al main. f) Método restar(): calcular la
 * resta de los números y devolver el resultado al main
 *
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por
 * cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa
 * al usuario el error. Si no, se hace la multiplicación y se devuelve el
 * resultado al main h) Método dividir(): primero valida que no se haga una
 * división por cero, si fuera a pasar una división por cero, el método devuelve
 * 0 y se le informa al usuario el error se le informa al usuario. Si no, se
 * hace la división y se devuelve el resultado al main.
 */
public class OperacionServicio {

    creaOperaciones op = new creaOperaciones();
    Scanner leer = new Scanner(System.in);

    public void creaOperacion() {

        System.out.println("ingrese dos  numeros .(escriba uno y presiona enter para escribir el segundo");
        op.setNumero1(leer.nextInt());
        op.setNumero2(leer.nextInt());

    }

    public int sumar() {
        return op.getNumero1() + op.getNumero2();
    }

    public int resta() {
        return op.getNumero1() - op.getNumero2();

    }

    public int multiplica() {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("error uno o ambos numeros es cero");
            return 0;
        } else {
            return op.getNumero1() * op.getNumero2();
        }
    }

    public int divida() {
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("error uno o ambos numeros es cero");
            return 0;
        } else {
            return op.getNumero1() / op.getNumero2();
        }

    }
}

