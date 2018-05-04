/*
 *       Realiza un programa que pinte por pantalla un cuadrado a base de asteriscos con borde doble. El
 *       usuario deberá introducir la longitud del lado del cuadrado que deberá ser mayor o igual a 5.
 *
 *       Ejemplo 1:
 *       Introduzca la longitud del lado (5 como mínimo): 6
 *       * * * * * *
 *       * * * * * *
 *       * *     * *
 *       * *     * *
 *       * * * * * *
 *       * * * * * *
 *
 *       Ejemplo 2:
 *       Introduzca la longitud del lado (5 como mínimo): 8
 *       * * * * * * * *
 *       * * * * * * * *
 *       * *         * *
 *       * *         * *
 *       * *         * *
 *       * *         * *
 *       * * * * * * * *
 *       * * * * * * * *
 *
 *       Ejemplo 3:
 *       Introduzca la longitud del lado (5 como mínimo): 5
 *       * * * * *
 *       * * * * *
 *       * *   * *
 *       * * * * *
 *       * * * * *
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la longitud del lado (5 como mínimo): ");
    int lado = s.nextInt();

    for (int i = 1; i <= lado; i++) {
      for (int j = 1; j <= lado; j++) {

        // Imprime asterisco cuando la fila o la colunna son la primera, segunda, penultima y ultima
        if ((i == 1) || (i == 2) || (i == lado) || (i == lado - 1) || (j == 1) || (j == 2) || (j == lado) || (j == lado - 1)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

}
