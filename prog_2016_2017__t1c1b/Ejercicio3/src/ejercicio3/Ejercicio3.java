/*
 *       Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada
 *       dígito se le suma 1 si es par y se le resta 1 si es impar. Usa long en lugar de int donde sea necesario
 *       para admitir números largos.
 *
 *       Ejemplo 1:
 *       Por favor, introduzca un número: 9402
 *       Dislocando el 9402 sale el 8513.
 *
 *       Ejemplo 2:
 *       Por favor, introduzca un número: 870958422
 *       Dislocando el 870958422 sale el 961849533.
 *
 *       Ejemplo 3:
 *       Por favor, introduzca un número: 137
 *       Dislocando el 137 sale el 26
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
    
    System.out.print("Introduce un número : ");
    long numeroIntroducido = s.nextLong();

    long numeroNuevo = 0;
    long volteado = 0;

    while (numeroIntroducido >= 1) {

      long digito = numeroIntroducido % 10;

      if (digito % 2 == 0) {

        digito++;
        numeroNuevo = numeroNuevo + digito;
        numeroNuevo = numeroNuevo * 10;

      } else {
        digito--;
        numeroNuevo = numeroNuevo + digito;
        numeroNuevo = numeroNuevo * 10;

      }
      numeroIntroducido /= 10;

    }

    numeroNuevo /= 10;

    //volteado
    while (numeroNuevo > 0) {

      volteado = (volteado * 10) + (numeroNuevo % 10);

      numeroNuevo /= 10;

    }

    System.out.println("Dislocado sale el " + volteado);
  }

}
