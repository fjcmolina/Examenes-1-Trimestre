/*
 *     Escribe un programa que pida un número entero positivo y que diga a continuación si las cifras que lo
 *     componen están ordenadas de menor a mayor, mirando de izquierda a derecha. Se podrán introducir
 *     números de cualquier longitud mientras lo permitan las variables. Usa long en lugar de int donde sea
 *     necesario para admitir números largos. Fíjate bien que no se pide ordenar las cifras, solo saber si
 *     están ordenadas o no.
 *
 *     Ejemplo 1:
 *     Por favor, introduzca un número entero positivo: 34667
 *     Los dígitos del número 34667 están ordenados.
 *
 *     Ejemplo 2:
 *     Por favor, introduzca un número entero positivo: 85
 *     Los dígitos del número 85 no están ordenados.
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
    
    System.out.println("Por favor, introduzca un número entero positivo:");
    long numero =  s.nextLong();
    
    long digito = 0;
    
    do {
      digito = numero % 10;
      numero = numero / 10;
    } while (((numero % 10) <= digito) && (numero > 0));


    if (numero == 0) {

      System.out.print("Están ordenados de menor a mayor");

    } else {

      System.out.print("No están ordenados  de menor a mayor");
    }
  }
  
}
