/*
 *       Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben
 *       guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
 *       GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
 *       como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
 *       distinguir bien. Por cada 5 números mostrados hay un salto de línea.
 *
 *       Ejemplo:
 *       Por favor, introduzca sus 5 números favoritos:
 *       13
 *       23
 *       55
 *       45
 *       1 no me gusta, 2 no me gusta, 3 no me gusta, 4 ME GUSTA, 5 ME GUSTA,
 *       6 no me gusta, 7 no me gusta, 8 no me gusta, 9 no me gusta, 10 no me gusta,
 *       11 no me gusta, 12 no me gusta, 13 ME GUSTA, 14 no me gusta, 15 no me gusta,
 *       (...)
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    int numero;
    int[] favoritos = new int[5];
    boolean favorito = false;

    System.out.println("Introduce tus 5 números favoritos: ");

    for (int i = 0; i < 5; i++) {

      numero = s.nextInt();
      favoritos[i] = numero;
    }

    for (int i = 1; i < 101; i++) {

      favorito = false;

      for (int r = 0; r < 5; r++) {

        if (favoritos[r] == i) {
          favorito = true;
        }
      }

      if (favorito == true) {
        System.out.print(i + " ME GUSTA,");
      } else {
        System.out.print(i + " no me gusta,");
      }

      if (i % 5 == 0) {
        System.out.println();
      }
    }
  }

}
