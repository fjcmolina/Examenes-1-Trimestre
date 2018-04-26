/*
 *     Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. Se debe pedir
 *     al usuario la anchura y la altura. Hay que comprobar que tanto la anchura como la altura sean
 *     mayores o iguales que 2, en caso contrario se debe mostrar un mensaje de error.
 *     
 *     Ejemplo 1:
 *     Por favor, introduzca la anchura del rectángulo (como mínimo 2): 4
 *     Ahora introduzca la altura (como mínimo 2): 1
 *     Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.
 *     
 *     Ejemplo 2:
 *     Por favor, introduzca la anchura del rectángulo (como mínimo 2): 6
 *     Ahora introduzca la altura (como mínimo 2): 4
 *     * * * * * *
 *     *         *
 *     *         *
 *     * * * * * *
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

    System.out.print("Introduce la altura(minimo 2): ");
    int altura = s.nextInt();

    System.out.print("Introduce la anchura(minimo 2): ");
    int ancho = s.nextInt();

    int i = 0;
    int espacios = 0;

    for (i = 1; i <= ancho; i++) {
      System.out.print("*");
    }

    for (i = 2; i < altura; i++) {
      System.out.print("\n*");
      for (espacios = 2; espacios < ancho; espacios++) {
        System.out.print(" ");
      }
      System.out.print("*");
    }
    System.out.println();

    for (i = 1; i <= ancho; i++) {
      System.out.print("*");
    }
  }

}
