/*
 *   Escribe un programa que permita partir un número introducido por teclado en dos partes. Las
 *   posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario
 *   introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo y la
 *   posición en la que se parte el número está entre 2 y la longitud del número. No se permite el uso de
 *   funciones de manejo de String (por ej. para extraer subcadenas dentro de una cadena).
 *
 *   Ejemplo:
 *   Por favor, introduzca un número entero positivo: 406783
 *   Introduzca la posición a partir de la cual quiere partir el número: 5
 *   Los números partidos son el 4067 y el 83.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = s.nextLong();

    System.out.print("Introduce la posición a partir de la cual quiere partir el número: ");
    long posicion = s.nextLong();

    long numero = numeroIntroducido;

    int longitud = 0;

    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);

    // Parte izquierda del numero
    long parteIzquierda = numeroIntroducido / (long) (Math.pow(10, longitud - posicion + 1));

    // Parte derecha del numero
    long parteDerecha = numeroIntroducido % (long) (Math.pow(10, longitud - posicion + 1));

    System.out.println("Los números partidos son el " + parteIzquierda + " y  el " + parteDerecha);
  }

}
