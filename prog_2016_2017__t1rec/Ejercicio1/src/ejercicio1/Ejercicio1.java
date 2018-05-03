/*
 *     Escribe un programa que diga cuántos números terminados en 8 ha introducido el usuario. A priori, el
 *     programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir
 *     los datos metiendo el 0. Los números negativos también se tienen en cuenta.
 *
 *     Ejemplo 1:
 *     Por favor, vaya introduciendo números y pulsando [INTRO]:
 *     34
 *     - 28
 *     585
 *     8 168
 *     -6
 *     0
 *     Ha introducido 3 números terminados en 8.
 *
 *     Ejemplo 2:
 *     Por favor, vaya introduciendo números y pulsando [INTRO]:
 *     3-
 *     1
 *     880
 *     0
 *     Ha introducido 0 números terminados en 8.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int numero = 0;
    int modulo = 0;
    int contador = 0;

    System.out.print("Por favor, vaya introduciendo números y pulsando [INTRO]: ");

    do {
      numero = s.nextInt();
      modulo = numero % 10 ;

      if (modulo == 8) {
        contador++;
      }
    } while (numero != 0);
    
    System.out.println("Ha introducido " + contador + " números terminados en 8.");
  }

}
