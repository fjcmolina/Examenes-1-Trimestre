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

    int longitud = 0;
    long numero = numero1;
    long numeroReves = 0;

    if (numero == 0) {
      longitud = 1;
    }

    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }

    numero = numero2;
    long numeroReves2 = 0;

    while (numero > 0) {
      numeroReves2 = (numeroReves2 * 10) + (numero % 10);
      numero /= 10;
    }
    
    int digito;
    long resultado = 0;

    for (int i = 0; i < longitud; i++) {
      
      digito = (int)(numeroReves % 10);
      resultado = (resultado * 10) + digito;
      numeroReves /= 10;

      digito = (int) (numeroReves2 % 10);
      resultado = (resultado * 10) + digito;
      numeroReves2 /= 10;
    }
    
    System.out.println("La mezcla de los dos numeros es: " + resultado);
  }

}
