/*
 *   Realiza un programa que pinte la letra Z hecha de asteriscos. El programa debe pedir la altura de la
 *   letra, que deberá ser un número mayor o igual que 4. En caso de que el usuario introduzca un número
 *   no válido, se mostrará un mensaje de error.
 *
 *   Ejemplo:
 *   Por favor, introduzca la altura de la Z: 5
 *   * * * * *
 *         *
 *       *
 *     *
 *   * * * * *
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

    System.out.print("Por favor, introduzca la altura de la Z: ");
    int altura = s.nextInt();

    for (int i = 0; i < altura; i++) {
      System.out.print("*");
    }

    System.out.println();
    
    // Parte central de la Z
    for (int i = (altura - 2); i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

    for (int i = 0; i < altura; i++) {
      System.out.print("*");
    }
  }

}
