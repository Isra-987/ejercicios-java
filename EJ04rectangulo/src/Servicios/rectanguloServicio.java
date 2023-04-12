/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.creaRectangulo;
import java.util.Scanner;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class rectanguloServicio {

    creaRectangulo r1 = new creaRectangulo();
    Scanner leer = new Scanner(System.in);

    public void crearRectangulos() {
        System.out.println("ingrese la base del rectangulo ");
        r1.setBase(leer.nextInt());
        System.out.println("ingrese la altura del rectangulo ");
        r1.setAltura(leer.nextInt());

    }

    public int superficie() {
        return r1.getBase() * r1.getAltura();

    }

    public int perimetro() {
        return (r1.getBase() + r1.getAltura()) * 2;
    }

    public void dibujaRectangulo() {
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                if (i == 0 || i == r1.getBase() - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == r1.getAltura() - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println(" ");

        }

    }
}
