/*
 *       Escribe un programa que diga cuántos números capicúa ha introducido un usuario. A priori, el
 *       programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir
 *       los datos cuando meta un número negativo.
 *
 *       Ejemplo 1:
 *       Por favor, vaya introduciendo números y pulsando [INTRO]:
 *       678876
 *       9 
 *       534
 *       4802
 *       -2
 *       Ha introducido 2 números capicúa.
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

    long numeroIntroducido = 0;
    int contador = 0;
    
    do {
      System.out.print("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
      numeroIntroducido = s.nextLong();

      long numero = numeroIntroducido;
      long numeroReves = 0;

      while (numero > 0) {
        numeroReves = (numeroReves * 10) + (numero % 10);
        numero /= 10;
      }

      if (numeroIntroducido == numeroReves) {
        contador++;
      }
    } while (numeroIntroducido > 0);
    
    System.out.println("Ha introducido " + contador + " números capicúa.");
  }
}
