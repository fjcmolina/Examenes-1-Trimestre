/*
 *   Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los
 *   5 números consecutivos a partir del número introducido. Al lado de cada número se debe indicar si se
 *   trata de un primo o no. Un número es primo cuando es divisible únicamente entre él mismo y la
 *   unidad.
 *
 *   Ejemplo:
 *   Por favor, introduzca un número entero positivo: 17
 *   17 es primo
 *   18 no es primo
 *   19 es primo
 *   20 no es primo
 *   21 no es primo
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = s.nextInt();

    boolean primo = true;

    for (int numero = numeroIntroducido; numero < (numeroIntroducido + 5); numero++) {
      primo = true;
      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          primo = false;
        }
      }

      if (primo) {
        System.out.println(numero + " es un numero primo");
      } else {
        System.out.println(numero + " no es un numero primo");
      }
    }
  }

}
