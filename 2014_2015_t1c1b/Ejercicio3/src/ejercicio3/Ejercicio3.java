/*
 *     Realiza un programa que pinte la letra N hecha de asteriscos. El programa debe pedir la altura de la
 *     letra, que deberá ser un número mayor o igual que 4. En caso de que el usuario introduzca un número
 *     no válido, se mostrará un mensaje de error.
 *
 *     Ejemplo:
 *     Por favor, introduzca la altura de la N: 5
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

    System.out.print("Introduzca la altura de la N: ");
    int alturaIntroducida = s.nextInt();

    while (alturaIntroducida < 4) {
      System.out.println("La altura de la N debe ser mayor o igual de 4");
      System.out.print("Por favor, Introduzca la altura de la N: ");
      alturaIntroducida = s.nextInt();
    }

    int altura = 1;
    int espacios = 0;

    while (altura <= alturaIntroducida) {

      System.out.print("*");

      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      espacios++;

      System.out.print("*");

      for (int i = espacios; i < alturaIntroducida; i++) {
        System.out.print(" ");
      }

      altura++;

      System.out.println("*");
    }
  }
}
