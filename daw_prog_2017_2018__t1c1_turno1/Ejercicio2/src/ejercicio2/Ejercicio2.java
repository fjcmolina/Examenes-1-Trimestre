/*
 * Realiza un programa que lea 10 números por teclado y que muestre la media de los números primos
 *     introducidos. Los números que no son primos se ignoran. Si el usuario no ha introducido ningún
 *     número primo, se mostrará el mensaje: “No ha introducido ningún número primo, no puedo calcular la
 *     media”.
 *
 *     Ejemplo:
 *     Por favor, introduzca diez números enteros positivos:
 *     68 
 *     15
 *     12
 *     23
 *     11
 *     48
 *     72 
 *     19
 *     La media de los primos es 12.4
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

    System.out.println("Por favor, introduzca diez números enteros positivos: ");

    boolean primo = false;
    int divisor = 0;
    int contador = 0;
    int dividendo = 0;

    // Recoge 10 numeros
    do {
      primo = true;
      int numero = s.nextInt();
      
      // Comprueba si son primos
      int i = 2;
      primo = true;
      
      while ((i < numero)) {
        if (((numero % i) == 0) && (numero != 0)) {
          primo = false;
        }
        i++;
      }
      // Si es primo, aumenta el dividendo y divisor
      if (primo) {
        dividendo += numero;
        divisor++;
      }
      contador++;
    } while (contador < 10);
    
    
    //  Si hay primos (divisor distinto de 0), se hace la media
    if (divisor != 0) {
      double media = (double) (dividendo) / (double) (divisor);
      System.out.println("La media de los primos es: " + media);
    } else {
      System.out.println("No ha introducido ningún número primo, no puedo calcular la media");
    }
  }

}
