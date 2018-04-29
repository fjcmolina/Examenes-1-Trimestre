/*
 *    Escribe un programa que, dado un número introducido por teclado, extraiga el dígito menor y el mayor.
 *
 *     Ejemplo:
 *     Por favor, introduzca un número entero positivo: 21065
 *      Menor: 0
 *      Mayor: 6
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    int maximo = 0;
    int minimo = 9999;
    int digito = 0;

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = s.nextInt();

    while (numero != 0) {
      digito = numero % 10;
      if (digito < minimo) {
        minimo = digito;
      }
      if (digito > maximo) {
        maximo = digito;
      }
      numero /= 10;
    }
    System.out.println("Menor: " + minimo);
    System.out.println("Mayor: " + maximo);
  }

}
