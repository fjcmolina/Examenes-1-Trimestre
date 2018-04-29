/*
 *    Realiza un programa que pinte una cruz hecha de asteriscos. El programa debe pedir la longitud del
 *     brazo de la cruz. El asterisco del centro no cuenta en esa longitud.
 *
 *     Ejemplo:
 *     Por favor, introduzca la longitud del brazo de la cruz: 2
 *         *
 *         *
 *     * * * * *
 *         *
 *         *
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

    System.out.print("Por favor, introduzca la longitud del brazo de la cruz: ");
    int longitud = s.nextInt();

    for (int i = 0; i < longitud * 2 + 1; i++) { //+1 (el del medio)
      if (i == longitud) {                  // Fila central 
        for (int c = 0; c < longitud * 2; c++) {
          System.out.print("*");
        }
      } else {
        //Espacios hasta la columna central
        for (int e = 0; e < longitud; e++) {
          System.out.print(" ");
        }
      }
      System.out.print("*\n");
    }
  }

}
