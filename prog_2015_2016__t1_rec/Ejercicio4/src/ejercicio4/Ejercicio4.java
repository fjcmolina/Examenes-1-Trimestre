/*
 *     Realiza un programa que gestione los votos de las próximas elecciones. La aplicación debe cumplir
 *     los siguientes requisitos:
 *
 *     a) Los nombres de los partidos se deben guardar en un array llamada nombrePartido que se debe
 *     inicializar al principio del programa con los siguientes nombres: Ciudadanos, Podemos, PP, PSOE,
 *     Izquierda Unida y UpyD.
 *     b) El programa debe pedir el número de votos que ha obtenido cada uno de los partidos. Estos
 *     datos se deben guardar en un array llamado votacion.
 *     c) El programa calculará la media de todas las votaciones y la mostrará por pantalla.
 *     d) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
 *     encima de la media son: " seguido de los nombres de los partidos cuyos votos han sido superiores
 *     a la media.
 *     e) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
 *     debajo de la media son: " seguido de los nombres de los partidos cuyos votos han sido inferiores a
 *     la media.
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

    String[] nombrePartido = {"Ciudadanos", "Podemos", "PP", "PSOE", "Izquierda Unida", "UpyD"};
    int[] votacion = new int[6];
    int suma = 0;

    for (int i = 0; i < 6; i++) {
      System.out.print("Introduce el numero de votos de " + nombrePartido[i] + ": ");
      votacion[i] = s.nextInt();
      suma += votacion[i];
    }

    System.out.println();

    int media = suma / 6;

    System.out.println("La media de votos de es: " + media);

    System.out.println();

    for (int i = 0; i < 6; i++) {

      if (media < votacion[i]) {
        System.out.println("Este partido ha obtenido votos por encima de la media: ");
        System.out.println(nombrePartido[i] + " ");
      }

      if (media > votacion[i]) {
        System.out.println("Este partido ha obtenido votos por debajo de la media: ");
        System.out.println(nombrePartido[i] + " ");

      }
    }

  }
}
