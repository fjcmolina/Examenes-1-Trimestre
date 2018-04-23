/*
 *  Realiza un conversor del sistema decimal al sistema de “palotes”.

    Ejemplo:
    Por favor, introduzca un número entero positivo: 470213
    El 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes.
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

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = s.nextInt();

    int numero = numeroIntroducido;
    int numeroReves = 0;
    int digito = 0;

    //Cuenta los digitos al ir volteandolo
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      digito++;
    }

    int cifra = 0;
    
    System.out.print("El " + numeroIntroducido + " en decimal es el ");
    
    for (int i = 0; i < digito; i++) {
      cifra = (numeroReves % 10);
      numeroReves /= 10;

      //Pone palitos hasta que en el digito que esta sea igual a la cifra
      for (int j = 0; j < cifra; j++) {
        System.out.print("|");
      }

      if (i < (digito - 1)) {
        System.out.print("-");
      }
    }
    System.out.print(" en el sistema de palotes");
  }

}
