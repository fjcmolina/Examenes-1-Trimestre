/*
 *    Realiza un programa que genere la versión tacaña de un número a partir de otro introducido por
 *     teclado. La versión tacaña es aquella que contiene los mismos dígitos o menos que el número original
 *     y en el mismo orden. A efectos prácticos es como quitarle dígitos de forma aleatoria a un determinado
 *     número.
 *
 *     Ejemplo 1:
 *     Por favor, introduzca un número: 746812
 *     La versión tacaña del 746812 es 462
 *
 *     Ejemplo 2:
 *     Por favor, introduzca un número: 746812
 *     La versión tacaña del 746812 es 7482
 *
 *     Ejemplo 3:
 *     Por favor, introduzca un número: 746812
 *     La versión tacaña del 746812 es 681
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int numero = s.nextInt();

    int volteado = 0;
    int modulo = 0;
    int aux = numero;

    do {
      modulo = numero % 10;
      volteado = volteado * 10 + modulo;
      numero /= 10;
    } while (numero > 0);

    // Ya tienes el número volteado, que es necesario para imprimirlo
    // luego en orden.
    int borrado;

    System.out.println("La versión tacaña del número " + aux + " es ");

    do {
      borrado = (int) (Math.random() * 2);

      // Con los valores 0 y 1 decides si cada cifra la imprimes o no.
      switch (borrado) {
        case 0:
          System.out.print(volteado % 10);
          volteado /= 10;
          break;
        case 1:
          volteado /= 10;
          break;
      }
    } while (volteado > 0);
  }

}
