/*
 *   Escribe un programa que mezcle los dígitos de dos números de la misma longitud que se introducen
 *   por teclado. Se debe comprobar que los dos números efectivamente tienen la misma longitud. Se
 *   recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 *   Ejemplo1:
 *   Por favor, introduzca un número entero positivo: 54
 *   Ahora introduzca otro número de la misma longitud que el anterior: 321
 *   Los datos introducidos no son válidos, los dos números deben tener la misma longitud.
 *
 *   Ejemplo2:
 *   Por favor, introduzca un número entero positivo: 543
 *   Ahora introduzca otro número de la misma longitud que el anterior: 321
 *   La mezcla de los dos números es 534231.
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
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numero1 = s.nextInt();
    
    System.out.print("Ahora introduzca otro número de la misma longitud que el anterior: ");
    long numero2 = s.nextInt();
    
    System.out.println("");
  }
  
}
