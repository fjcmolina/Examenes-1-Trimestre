/*
 *     Realiza un programa que pinte una pirámide hecha de números. El programa debe pedir la altura de la
 *     pirámide. Los números se distribuyen según se muestra en el ejemplo.
 *
 *     Ejemplo:
 *     Por favor, introduzca la altura de la pirámide: 5
 *             9    
 *           9 8 9
 *         9 8 7 8 9
 *       9 8 7 6 7 8 9
 *     9 8 7 6 5 6 7 8 9
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

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = s.nextInt();

    int i = 0;
    int j = 0;
    int digitos = 0;

    for (i = 1; i <= altura; i++) {

      System.out.println(" ");

      //Espacios
      for (j = 1; j <= altura - i; j++) {

        System.out.print(" ");

      }

      for (j = 1, digitos = 1; j <= i; j++, digitos++) {

        System.out.print((digitos % 10));

      }

      for (j = 1, digitos -= 2; j <= i - 1; j++, digitos--) {

        System.out.print((digitos % 10));

      }

    }

    System.out.println();
  }

}
