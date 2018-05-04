/*
 *       Los números “donut” son los que tienen un 0 justo en la posición central, en caso de que el número de
 *       cifras sea impar; o bien, los que tienen dos ceros en las posiciones centrales, en caso de que el
 *       número de dígitos sea par. El resto de dígitos pueden ser ceros o no, no se tienen en cuenta. Por
 *       ejemplo, los números 23037, 1008, 9060044, 0 y 8000 son “números donut”. Sin embargo 6758, 8903,
 *       4200, 1234 y 7 no lo son. Realiza un programa que diga si un número introducido por teclado es un
 *       “número donut” o no.
 *
 *       Ejemplo 1:
 *       Introduzca un número entero positivo: 51803458
 *       El 51803458 no es un número donut.
 *
 *       Ejemplo 2:
 *       Introduzca un número entero positivo: 2960140
 *       El 2960140 es un número donut.
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
    
    boolean par = false;
    boolean donut = false;
    
    System.out.print("Introduzca un número entero positivo: ");
    int numeroIntroducido = s.nextInt();
    
    // Cuenta los digitos y le da la vuelta
    int numero = numeroIntroducido;
    int numDig = 0;
    int numReves = 0;
    
    while (numero > 0) {
      numero /= 10;
      numDig++;
    }
    numero = numeroIntroducido;
    
    // Si el numeroIntroducido de digitos es par, comprueba las dos posiciones del centro
    if (numDig % 2 == 0) {
      for (int i = 0; i < (numDig / 2) - 1; i++) {
        numero /= 10;
      }
      int cifra = numero % 10;
      if (cifra == 0) {
        donut = true;
      }
      numero /= 10;
      cifra = numero % 10;
      if (cifra != 0) {
        donut = false;
      }
    } else {
      // Si es impar, comprueba solo la del centro
      for (int i = 0; i < (numDig / 2); i++) {
        numero /= 10;
      }
      int cifra = numero % 10;
      if (cifra == 0) {
        donut = true;
      }
    }
    
    System.out.print("El " + numeroIntroducido);
    
    if (donut) {
      System.out.println(" es un número donut");
    } else {
      System.out.println(" no es un número donut");
    }
  }

}
