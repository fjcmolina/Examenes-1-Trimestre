/*
 *  Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los
    números desde el 1 al número introducido junto con su factorial.

    Ejemplo:
    Por favor, introduzca un número entero positivo: 7
    1! = 1
    2! = 2
    3! = 6
    4! = 24
    5! = 120
    6! = 720
    7! = 5040
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
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numero = s.nextInt();
    
    for(int n = 1; n <= numero;n++){
      int factorial = n;
      for (int i = 1 ; i < n ; i++) {
          factorial *= i;
        }
    System.out.println("El factorial de " + n + " es " + factorial);
    }
  }
  
}
