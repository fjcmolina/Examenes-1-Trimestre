/*
 *     Escribe un programa que pida un número por teclado y que luego muestre la versión “complementaria”
 *     de ese número de tal forma que cada dígito se cambia por su complementario (9 menos el dígito). Usa
 *     long en lugar de int donde sea necesario para admitir números largos.
 *
 *     Ejemplo 1:
 *     Por favor, introduzca un número: 9402
 *     El complementario es el 597
 *
 *     Ejemplo 2:
 *     Por favor, introduzca un número: 137
 *     El complementario es el 862
 *
 *     Ejemplo 3:
 *     Por favor, introduzca un número: 870958422
 *     El complementario es el 129041577
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
    
    System.out.print("Por favor, introduzca un número: ");
    long numero =  s.nextLong();
    
    System.out.println("El complementario es el ");
  }
  
}
