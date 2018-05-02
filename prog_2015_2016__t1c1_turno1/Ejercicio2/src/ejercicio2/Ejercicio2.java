/*
 *     Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
 *     altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura
 *     más uno.
 *
 *     Ejemplo:
 *     Introduzca la altura de la L: 5
 *     *
 *     *
 *     *
 *     *
 *     * * *
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

    System.out.print("Introduzca la altura de la L: ");
    int altura = s.nextInt();

    for (int i = 0; i < (altura - 1); i++) {
      System.out.println("*");
    }
    for (int i = 0; i < ((altura / 2) + 1); i++) {
      System.out.print("*");
    }

  }

}
