/*
 *   Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
 *   se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
 *   colocar en las últimas posiciones los números que terminen en 7 dejando el resto en las primeras
 *   posiciones.
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

    int[] n = new int[10];
    int numero;

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      numero = s.nextInt();
      n[i] = numero;
    }
    System.out.print("\nOriginal: ");

    for (int i = 0; i < 10; i++) {

      System.out.print(n[i] + " ");
    }

    System.out.println();

    int[] ordenado = new int[10];
    int indiceOrdenado = 0;
    int modulo = 0;

    for (int i = 0; i < 10; i++) {

      modulo = n[i] % 10;

      if (modulo != 7) {
        ordenado[indiceOrdenado] = n[i];
        indiceOrdenado++;
      }
    }

    // Los que no acaben en 7 ya están guardados. Ahora recorremos por si hubiera
    // acabados en 7.
    for (int i = 0; i < 10; i++) {

      modulo = n[i] % 10;

      if (modulo == 7) {
        ordenado[indiceOrdenado] = n[i];
        indiceOrdenado++;
      }
    }

    // Ahora imprimimos el array ordenado con los números acabados en 7 al final.
    System.out.print("Array ordenado: ");

    for (int i = 0; i < 10; i++) {

      System.out.print(ordenado[i] + " ");
    }
  }

}
