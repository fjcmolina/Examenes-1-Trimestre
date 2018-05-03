/*
 *       Realiza un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y
 *       corriente. Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la
 *       superior): la primera se pinta, la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide
 *       siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide normal tienen 4
 *       asteriscos. El programa pedirá la altura. Se supone que el usuario introducirá un número entero mayor
 *       o igual a 3; no es necesario comprobar los datos de entrada.
 *
 *       Ejemplo 1:
 *       Introduzca la altura de la pirámide maya: 5
 *       ******
 *       ** **
 *       **********
 *       **** ****
 *       **************
 *
 *       Ejemplo 2:
 *       Introduzca la altura de la pirámide maya: 8
 *              ******
 *             **   **
 *            **********
 *           ****    ****
 *          **************
 *         ******    ******
 *        ******************
 *       ********    ********
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

    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = s.nextInt();

    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int espaciosInternos = 4;
    int lineaAsteriscos = 6;
    int asteriscos = 2;

    while (altura <= alturaIntroducida) {

      //línea 1
      //espacios externos 
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      //asteriscos
      for (int i = 1; i <= lineaAsteriscos; i++) {
        System.out.print("*");
      }

      lineaAsteriscos += 4;
      altura++;
      espacios--;
      System.out.println();

      //línea 2
      //espacios externos
      if (altura <= alturaIntroducida) {

        for (int i = 1; i <= espacios; i++) {
          System.out.print(" ");
        }

        //asteriscos
        for (int i = 1; i <= asteriscos; i++) {
          System.out.print("*");
        }

        //espacios internos
        for (int i = 1; i <= espaciosInternos; i++) {
          System.out.print(" ");
        }

        //asteriscos derecha
        for (int i = 1; i <= asteriscos; i++) {
          System.out.print("*");
        }

        asteriscos += 2;
        altura++;
        espacios--;
        System.out.println();

      }
    }
  }

}
