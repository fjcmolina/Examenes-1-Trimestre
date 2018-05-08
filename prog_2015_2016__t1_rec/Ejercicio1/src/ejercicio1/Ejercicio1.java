/*
 *       El nuevo partido político Izquierda Hacia la Izquierda nos ha pedido una aplicación que genere su
 *       logotipo. El logotipo de este partido es la letra I inclinada hacia la izquierda. Se debe pedir por teclado
 *       la altura del logotipo. La anchura siempre es de 4 asteriscos.
 *
 *       Ejemplo:
 *       Introduzca la altura del logotipo: 5
 *       ****
 *        ****
 *          ****
 *            ****
 *              ****
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

    System.out.print("Introduzca la altura del logotipo: ");
    int alturaIntroducida = s.nextInt();

    int altura = 1;
    int espacios = alturaIntroducida;

    while (altura <= alturaIntroducida) {

      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      System.out.print("****");

      System.out.println();
      altura++;
      espacios++;
    }
  }
}
