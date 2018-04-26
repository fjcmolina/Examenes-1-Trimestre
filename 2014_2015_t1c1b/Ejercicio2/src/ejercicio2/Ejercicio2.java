/*
 *     Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
 *     números son primos. Los primos repetidos también cuentan. El número 1, por convenio, no se
 *     considera primo (el 0 tampoco es primo).
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

    int cantidadPrimos = 0;
    String primos = "";

    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce un numero: ");
      int numero = s.nextInt();

      boolean esPrimo = true;
      int divisor = 2;

      while ((esPrimo) && (divisor <= (numero / 2))) {

        if ((numero % divisor) != 0) {
          divisor++;
        } else {
          esPrimo = false;
        }
      }

      if ((esPrimo) && (numero > 1)) {
        if (cantidadPrimos == 0) {
          primos += numero + "";
        } else {
          primos += ", " + numero;
        }
        cantidadPrimos++;
      }
    }

    System.out.print("En total ha introducido " + cantidadPrimos + " números primos, los cuales" + " son " + primos + ".");
  }
}
