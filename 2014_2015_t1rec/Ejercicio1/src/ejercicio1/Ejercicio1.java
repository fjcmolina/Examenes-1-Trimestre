/*
 *   Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
 *
 *   Ejemplo:
 *   Por favor, introduzca un número entero positivo: 21065
 *   6
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
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int num = s.nextInt();
  }
  
}
