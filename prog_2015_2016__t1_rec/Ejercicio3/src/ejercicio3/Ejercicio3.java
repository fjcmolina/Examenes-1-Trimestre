/*
 *     Escribe un programa que rellene un array con 20 números aleatorios comprendidos entre 0 y 1000 y
 *     que los muestre por pantalla. A continuación, el programa pedirá dos números de los que se han
 *     mostrado. Por último, el programa dirá cuántos pasos hay que dar para pasar del primer número al
 *     segundo. Se supone que el usuario introduce correctamente los números, es decir, se encuentran en
 *     el array, no son el mismo, y el primer número aparece antes que el segundo.
 *
 *     Ejemplo:
 *     159 204 20 250 178 790 353 632 229 357 924 54 260 310 140 549 335 826 923 113
 *     Por favor, introduzca el primer número: 790
 *     Ahora introduzca el segundo número: 310
 *     Para pasar del 790 al 310 hay que dar 8 pasos.
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
    int[] n = new int[20];
    int indiceMenor = 0;
    int indiceMayor = 0;
    int numero;

    for (int i = 0; i < 20; i++) {

      numero = (int) (Math.random() * 1001);
      n[i] = numero;
      System.out.print(numero + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Introduce un número del array: ");
    int primero = s.nextInt();

    System.out.println("Introduce otro que esté más hacia delante: ");
    int segundo = s.nextInt();

    for (int i = 0; i < 20; i++) {

      if (n[i] == primero) {
        indiceMenor = i;
      } else if (n[i] == segundo) {
        indiceMayor = i;
      }
    }

    System.out.println("Tienes que dar " + (indiceMayor - indiceMenor) + " pasito/s.");
  }

}
