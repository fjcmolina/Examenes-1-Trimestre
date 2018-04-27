/*
 *   Realiza un programa que elimine un determinado dígito de un número introducido por teclado. Utiliza el tipo long
 *   donde sea necesario para aceptar números largos.
 *
 *   Ejemplo:
 *    Introduzca un número entero: 291081756
 *    ¿Qué dígito desea eliminar? 1
 *    El número resultante es el 2908756
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    long numeroIntroducido = s.nextLong();
    
    System.out.print("¿Qué dígito desea eliminar? ");
    long digito = s.nextLong();
    
    
    System.out.println("El numero resultante es el " );
  }
  
}
