/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.creaCadena;
import java.util.Scanner;

/**
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class servicioCadena {
    creaCadena c1 = new creaCadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String letra;
    public void crearCadena(){
        System.out.println("ingrese una frase (puede ser varias palabras)");
        c1.setFrase(leer.next());
    }
    
    
    public void mostrarVocales(){
        
        int vocal=0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
            letra=c1.getFrase().substring(i, i+1).toUpperCase();
            if (letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")) {
                vocal++;
            }
            
        }
        System.out.println("la frase tiene "+vocal+" vocales ");
    }
    
    public void invertirFrase(){
        String fraseInvert="";
        for (int i = c1.getFrase().length(); i >0; i--) {
            fraseInvert=fraseInvert.concat(c1.getFrase().substring(i-1, i));
            
        }    
        
       System.out.println("la frase invertida es "+fraseInvert );
    }
    
    public void  vecesRepetida(String caract){
        int c=0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
             letra=c1.getFrase().substring(i, i+1).toUpperCase();
             if(letra.equals(caract)){
                 c++;
             }
        }
        System.out.println("la letra se repite "+c+" veces ");
        
    }
    
}
