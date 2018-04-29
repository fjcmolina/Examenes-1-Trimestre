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

    int[] numero = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      numero[i] = s.nextInt();
    }

    System.out.println("Array original: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(" " + numero[i] + " ");
    }
    
    
    System.out.println("Array modificado: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(" " + numero[i] + " ");
    }
  }

}
