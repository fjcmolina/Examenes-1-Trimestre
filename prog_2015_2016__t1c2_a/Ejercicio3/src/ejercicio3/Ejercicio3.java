/*
 *     Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
 *     correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
 *     Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben estar en
 *     otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
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

    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };

    String[] palabra = new String[8];
    String[] resultado = new String[8];

    System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");

    int j = 0;

    for (int i = 0; i < 8; i++) {
      palabra[i] = s.nextLine();

      // Si la palabra introducida es un color, la guarda en el array resultado.
      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }

    // Mete las palabras que no son colores al final del array resultado.
    for (int i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }

    // Muestra el array original.  
    System.out.println("\n\nArray original:");

    for (int i = 0; i < 8; i++) {
      System.out.printf(" ", i);
    }

    for (String p : palabra) {
      System.out.printf("│%-8s", p);
    }

    // Muestra el array resultado.  
    System.out.println("\n\nArray resultado:");

    for (int i = 0; i < 8; i++) {
      System.out.printf(" ", i);
    }

    for (String r : resultado) {
      System.out.printf("│%-8s", r);
    }

  }

}
