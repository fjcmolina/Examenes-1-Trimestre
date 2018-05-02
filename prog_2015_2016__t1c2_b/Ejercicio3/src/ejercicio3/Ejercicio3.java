/*
 *     Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
 *     correspondientes a nombres de fruta se deben almacenar al final (sin importar el orden) y las que no son
 *     nombres de fruta al principio. Puedes utilizar tantos arrays auxiliares como quieras. Las frutas que conoce
 *     el programa deben estar en otro array y son las siguientes: manzana, mandarina, mango, chirimoya y
 *     nectarina.
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

    String[] fruta = {
      "manzana", "mandarina", "mango", "chirimoya", "nectarina"
    };

    String[] palabra = new String[8];
    String[] resultado = new String[8];

    System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");

    int j = 0;

    for (int i = 0; i < 8; i++) {
      palabra[i] = s.nextLine();

      // Si la palabra introducida es un fruta, la guarda en el array resultado.
      for (String c : fruta) {
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }

    // Mete las palabras que no son frutaes al final del array resultado.
    for (int i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : fruta) {
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
