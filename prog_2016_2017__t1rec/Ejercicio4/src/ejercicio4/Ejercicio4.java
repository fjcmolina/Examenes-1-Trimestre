/*
 *       Escribe un programa que diga cuánto suman todos los dígitos de un número introducido por el
 *       usuario. El programa debe ser válido tanto para los números positivos como para los negativos.
 *
 *       Ejemplo 1:
 *       Introduzca un número: 40958
 *       Los dígitos del número 40958 suman 26
 *
 *       Ejemplo 2:
 *       Introduzca un número: -164
 *       Los dígitos del número -164 suman 11
 *
 *       Ejemplo 3:
 *       Introduzca un número: 0
 *       Los dígitos del número 0 suman 0
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

    System.out.print("Introduzca un número: ");
    int numeroIntroducido = s.nextInt();

    int suma = 0;
    int numero = numeroIntroducido;

    while (numeroIntroducido != 0) {
      suma += numeroIntroducido % 10;;
      numeroIntroducido /= 10;
    }
    System.out.println("Los dígitos del número " + numero + " suman " + suma);
  }

}
