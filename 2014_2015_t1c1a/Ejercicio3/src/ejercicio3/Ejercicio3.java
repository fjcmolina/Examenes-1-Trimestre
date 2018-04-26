/*
 *   Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
 *   números son capicúa. Los números capicúa son los que se leen igual hacia delante y hacia atrás. Los
 *   capicúa repetidos también cuentan.
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

    for (int i = 0; i < 10; i++) {
      System.out.print("\nIntroduce un numero: ");
      long numeroIntroducido = s.nextLong();

      long numero = numeroIntroducido;
      long numeroReves = 0;

      while (numero > 0) {
        numeroReves = (numeroReves * 10) + (numero % 10);
        numero /= 10;
      }

      if (numeroIntroducido == numeroReves) {
        System.out.println("El numero es capicua ");
      } else {
        System.out.println("El numero no es capicua");
      }
    }
  }

}
