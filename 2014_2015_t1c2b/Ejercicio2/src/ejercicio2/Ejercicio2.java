/*
 *    Escribe un programa que pida 6 palabras y las almacene en un array. A continuación, en otro array se deben
 *    guardar las mismas palabras pero esta vez cambiadas de orden de forma aleatoria.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String[] palabras = new String[6];

    System.out.println("Introduce 6 palabras: ");

    for (int i = 0; i < 6; i++) {
      palabras[i] = s.nextLine();

    }

    System.out.println("Array original: ");

    for (int i = 0; i < 6; i++) {
      System.out.print(" " + palabras[i] + " ");
    }

    for (int i = 0; i < 500; i++) {
      int x = (int) (Math.random() * 6);
      int y = (int) (Math.random() * 6);
      String temporal = palabras[x];
      palabras[x] = palabras[y];
      palabras[y] = temporal;
    }
    
    System.out.println();
    System.out.println("\nArray barajado: ");
    
    for (int i = 0; i < 6; i++) {
      System.out.print(" " + palabras[i] + " ");
    }
  }

}
