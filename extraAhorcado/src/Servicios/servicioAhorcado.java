package Servicios;

import Entidades.creaAhorcado;
import java.util.Scanner;

public class servicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    creaAhorcado juego = new creaAhorcado();
    int n, cont, encontradas = 0, intento = 1;
    boolean valida = false;
    boolean aux2 = false;
    String[] repetida = new String[n];


    /*
     * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
     * máxima. Con la palabra del usuario, pone la longitud de la palabra, como
     * la longitud del vector. Después ingresa la palabra en el vector, letra
     * por letra, quedando cada letra de la palabra en un índice del vector. Y
     * también, guarda en cantidad de jugadas máximas, el valor que ingresó el
     * usuario y encontradas en 0.
     */
    public void crearJuego() {
        System.out.println("Ingrese una palabra a buscar en el juego del ahorcado ");
        String palabra = leer.next();
        n = palabra.length();
        String aux[] = new String[n];

        for (int i = 0; i < n; i++) {
            aux[i] = palabra.substring(i, i + 1);
            juego.setPalabra(aux);
            System.out.print(" " + juego.getPalabra()[i]);
        }
        do {
            System.out.println("\n ingrese la cantidad de jugadas maximas que tendra el juego (maximo 10) ");
            juego.setJugadasMaximas(leer.nextInt());
        } while (juego.getJugadasMaximas() > 10 || juego.getJugadasMaximas() < 1);
    }

    /*Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.*/
    public void longitud() {
        int longPalabra = juego.getPalabra().length;
        System.out.println("la palabra ingresada tiene longitud " + longPalabra);
    }

    /*Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public void buscarLetra(String letra) {
        boolean bandera = false;

        for (int i = 0; i < n; i++) {

            if (letra.equalsIgnoreCase(juego.getPalabra()[i])) {
                repetida[i] = letra;
                bandera = true;

            }

        }

        if (bandera) {
            System.out.println("La letra ingresada si esta en la palabra ");

        } else {
            System.out.println("la letra ingresada no esta en la palabra ");
            juego.setLetrasEncontradas(juego.getLetrasEncontradas() );
           juego.setJugadasMaximas(juego.getJugadasMaximas() - 1);
           System.out.println("tienes " + juego.getJugadasMaximas() + " oportunidades");
        }

    }

    /*Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean letrasEncontradas(String letra) {
        boolean bandera1 = false;
        cont = 0;

        for (int i = 0; i < n; i++) {
            if (letra.equalsIgnoreCase(juego.getPalabra()[i])) {
                juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
                cont++;
                bandera1 = true;
            }

        }
        if (bandera1) {
            if (!valida) {

                if (cont == 1) {
                    System.out.println("la letra ingresada solo se encuentra una vez en la palabra ");
                    System.out.println("te faltan " + (n - juego.getLetrasEncontradas()) + " letras ");
                } else if (cont > 1) {
                    System.out.println("la letra ingresada a sido encontrada " + cont + " veces. ");
                    System.out.println("te faltan " + (n - juego.getLetrasEncontradas()) + " letras ");
                }
            }
        }
        if (!bandera1) {
            return bandera1;
        }
        valida = true;
        return bandera1;
    }

    /*Método intentos(): para mostrar cuantas oportunidades le queda al jugador. */
    public int intentos() {

        juego.setJugadasMaximas(juego.getJugadasMaximas() - 1);

        System.out.println("te quedan " + juego.getJugadasMaximas() + " oportunidades");
        intento++;

        return juego.getJugadasMaximas();
    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main. */
    public void juego() {

        int re = 0;
        String letra, letrasIngresadas;
        crearJuego();
        longitud();
        int aux=juego.getJugadasMaximas();

        letrasIngresadas = "";
        repetida = new String[n];

        do {

            do {
                System.out.println("ingrese una letra a buscar en el juego del ahorcado");

                letra = leer.next();
                if (letrasIngresadas.indexOf(letra) < 0) {
                    letrasIngresadas += letra;

                    valida = false;

                } else {
                    System.out.println("la  letra ingresada esta repetida ");
                    valida = true;
                    juego.setLetrasEncontradas(juego.getLetrasEncontradas() );
                    
                    System.out.println("tienes " + juego.getJugadasMaximas() + " oportunidades");
                    aux = intentos();
                    if (aux <= 0) {
                        System.out.println("se acabaron los intentos");
                        break;
                    }
                }

            } while (valida);
            buscarLetra(letra);
            aux2 = letrasEncontradas(letra);

            if (aux == 0) {
                break;
            }
            if(juego.getJugadasMaximas()==0){
                break;
            }

        } while (n >= juego.getLetrasEncontradas());

        if (aux != 0) {
            if (aux == 3 && (encontradas == n)) {
                System.out.println("FELICIDADES!!");
                System.out.println("Encontraste todas las palabras en un solo intento");
            } else {
                System.out.println("encontraste un total de " + juego.getLetrasEncontradas() + " letras");

                System.out.println("en un total de " + intento + " intentos");

            }
        } else {
            System.out.println("PERDISTE!");
        }

    }

}
