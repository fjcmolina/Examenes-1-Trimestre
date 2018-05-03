/*
 *     Escribe un programa que diga cuántos números primos ha introducido un usuario. A priori, el programa
 *     no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos
 *     cuando meta un número negativo.
 *
 *     Ejemplo 1:
 *     Por favor, vaya introduciendo números y pulsando [INTRO]:
 *     34
 *     23
 *     55
 *     457-
 *     6
 *     Ha introducido 3 números primos.
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

    int numero = 0;
    int contador = -1;

    do {
      System.out.print("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
      numero = s.nextInt();

      boolean primo = true;

      for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
          primo = false;
        }
      }

      if (primo == true) {
        contador++;
      }

    } while (numero > 0);

    System.out.println("Ha introducido " + contador + " números primos");
  }

}
