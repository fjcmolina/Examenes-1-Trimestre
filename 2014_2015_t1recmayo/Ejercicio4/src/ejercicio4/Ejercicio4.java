/*
 *     Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
 *     se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
 *     colocar de forma alterna y en orden los pares y los impares: primero par, luego impar, luego par, luego
 *     impar… Cuando se acaben los pares o los impares, se completará con los números que queden.
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
    int[] par = new int[10];
    int[] impar = new int[10];
    int pares = 0;
    int impares = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      n[i] = s.nextInt();

    }
    System.out.println("Array original: ");

    for (int i = 0; i < 10; i++) {

      System.out.print(n[i] + " ");

      if (n[i] % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }

    int indicePar = 0;
    int indiceImpar = 0;

    for (int i = 0; i < 10; i++) {

      if (n[i] % 2 == 0) {
        par[indicePar] = n[i];
        indicePar++;
      } else {
        impar[indiceImpar] = n[i];
        indiceImpar++;
      }
    }

    int[] ordenado = new int[10];

    if (pares > impares) {

      indicePar = 0;
      indiceImpar = 1;

      for (int d = 0; d < impares; d++) {

        ordenado[indicePar] = par[d];
        ordenado[indiceImpar] = impar[d];
        indicePar += 2;
        indiceImpar += 2;
      }

      for (int d = impares; d < pares; d++) {

        ordenado[indicePar] = par[d];
        indicePar++;
      }
    } else {

      indicePar = 0;
      indiceImpar = 1;

      for (int d = 0; d < pares; d++) {

        ordenado[indicePar] = par[d];
        ordenado[indiceImpar] = impar[d];
        indicePar += 2;
        indiceImpar += 2;
      }

      for (int d = pares; (d < impares) && (indiceImpar < 10); d++) {

        ordenado[indiceImpar] = impar[d];
        indiceImpar++;
      }
    }

    System.out.println();
    System.out.print("Array final: ");
    System.out.println();

    for (int r = 0; r < 10; r++) {
      System.out.print(ordenado[r] + " ");
    }
  }

}
