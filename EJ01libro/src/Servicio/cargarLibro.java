/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.creaLibro;
import java.util.Scanner;

/** Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
public class cargarLibro {
    public creaLibro cargandoLibro(){
        creaLibro c1= new creaLibro();
        
        //Lleno los atributos
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese el ISBN (numero de 13 cifras)del libro ");
         c1.setISBN(leer.nextInt());
         System.out.println("Ingrese el titulo del libro ");
         c1.setTitulo(leer.next());
         System.out.println("Ingrese el Autor del libro ");
         c1.setAutor(leer.next());
         System.out.println("Ingrese el numero de paginas del libro ");
         c1.setNumeroPaginas(leer.nextInt());
         return c1;
    }
    public void mostrarLibro(creaLibro c1){
        System.out.println(" "+ c1.toString());
    }
    
}
