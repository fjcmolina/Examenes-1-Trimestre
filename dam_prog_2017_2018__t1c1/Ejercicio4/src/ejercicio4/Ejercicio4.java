/*
 *     El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
 *     encuentre). Realiza un programa que muestre un número antes y después de haber sido comido por
 *     el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
 *
 *     Ejemplo 1:
 *     Introduzca un número entero (mayor que cero): 51803458
 *     Después de haber sido comido por el gusano numérico se queda en 51345
 *
 *     Ejemplo 2:
 *     Introduzca un número entero (mayor que cero): 29614
 *     El gusano numérico no se ha comido ningún dígito.
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

    System.out.print("Introduzca un número entero (mayor que cero): ");
    long numUs = s.nextLong();

    // Cuenta los números y calcula el reves
    long aux = numUs;
    int numDig = 0;
    long numReves = 0;

    while (aux > 0) {
      numReves = ((numReves * 10) + (aux % 10));
      aux /= 10;
      numDig++;
    }

    // Revisa los números y elimina el 8 y el 0
    long gusano = 0;

    for (int i = 1; i <= numDig; i++) {
      if ((numReves % 10 != 0) && (numReves % 10 != 8)) {
        gusano = ((gusano * 10) + (numReves % 10));
      }
      numReves /= 10;
    }
    System.out.print("Después de haber sido comido por el gusano numérico se queda en " + gusano);
  }

}
