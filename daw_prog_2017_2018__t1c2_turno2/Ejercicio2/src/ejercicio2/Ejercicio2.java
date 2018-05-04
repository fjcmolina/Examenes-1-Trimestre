/*
 *        Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100
 *       (ambos incluidos) y que los muestre por pantalla. A continuación, el programa indicará para cada uno
 *       de ellos si es un número primo y/o un capicúa de la forma que muestra el ejemplo.
 * 
 *       Ejemplo:

 *       Array generado:
 *       19 22 57 11 3 52 32 46 2 14
 *       El 19 es primo y no es capicúa.
 *       El 22 no es primo y es capicúa.
 *       El 57 no es primo y no es capicúa.
 *       El 11 es primo y es capicúa.
 *       El 3 es primo y es capicúa.
 *       El 52 no es primo y no es capicúa.
 *       El 32 no es primo y no es capicúa.
 *       El 46 no es primo y no es capicúa.
 *       El 2 es primo y es capicúa.
 *       El 14 no es primo y no es capicúa.
 */
package ejercicio2;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    //Crea el array aleatorio entre 2 y 100 y lo imprime
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) ((Math.random() * 99) + 2);
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println();

    // Va diciendo si el número es primo, capicúa o ambos
    boolean esCap = false;
    boolean esPri = false;
    boolean esAm = false;

    for (int i = 0; i < array.length; i++) {
      esCap = false;
      esPri = true;
      System.out.print("El " + array[i]);

      //Primo
      for (int j = 2; j < array[i] - 1; j++) {
        if (array[i] % j == 0) {
          esPri = false;
        }
      }
      if (esPri) {
        System.out.print(" es primo y ");
      } else {
        System.out.print(" no es primo y ");
      }

      //Capicua
      int numAux = array[i];
      int numReves = 0;
      int numDig = 0;
      int numDerecho = array[i];

      while (numAux > 0) {
        numReves = ((numReves * 10) + (numAux % 10));
        numAux /= 10;
        numDig++;
      }

      do {
        int cifraDerecho = numDerecho % 10;
        int cifraReves = numReves % 10;

        if (cifraDerecho == cifraReves) {
          esCap = true;
        } else {
          esCap = false;
        }
        numDerecho /= 10;
        numReves /= 10;
        numDig--;
      } while ((numDig > 0) && (esCap == true));

      if (esCap) {
        System.out.println(" es capicúa.");
      } else {
        System.out.println(" no es capicúa.");
      }
    }
  }

}
