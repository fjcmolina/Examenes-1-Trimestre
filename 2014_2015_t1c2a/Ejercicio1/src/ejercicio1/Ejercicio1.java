/*
 *     Realiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo se formará
 *     con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones impares. Se debe conservar
 *     el orden de los dígitos. Da igual el trozo que se muestre primero con tal de que cada trozo esté bien formado.
 *     Utiliza el tipo long donde sea necesario para aceptar números largos.
 *
 *     Ejemplo:
 *      Introduzca un número entero: 29108756
 *      Primer trozo: 2185
 *      Segundo trozo: 9076
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

    long[] num = new long[100];
    
    int i = 0;
    long resultado = 0;
    int digitos = 0;

    System.out.println("Introduzca un número entero: ");
    long numero = s.nextLong();
    
    long copia = numero;

    while (copia > 0) {
      digitos++;
      copia /= 10;
    }

    for (i = digitos - 1; i >= 0; i--) {
      num[i] = numero % 10;
      numero /= 10;
    }

    System.out.print("Primer trozo: ");

    for (i = 0; i < digitos; i += 2) {
      System.out.print(num[i]);
      
    }

    System.out.print("\nSegundo Trozo: ");

    for (i = 1; i < digitos; i += 2) {
      System.out.print(num[i]);
    }
    System.out.println("");
  }

}
