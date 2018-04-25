/*
 * Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo.
Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda usar long en
lugar de int ya que el primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición dentro del número: 3
Introduzca el nuevo dígito: 1
El número resultante es 401783
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

    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = s.nextLong();

    System.out.print("Introduce la posición dentro del número: ");
    long posicion = s.nextLong();

    System.out.print("Introduce el nuevo dígito: ");
    long digito = s.nextLong();

    long numero = numeroIntroducido;

    int longitud = 0;

    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);

    // Parte izquierda 
    long parteIzquierda = numeroIntroducido / (long) (Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;

    // Parte derecha
    long parteDerecha = numeroIntroducido % (long) (Math.pow(10, longitud - posicion));

    // Resultado
    numero = parteIzquierda * (long) (Math.pow(10, longitud - posicion)) + parteDerecha;
    System.out.print("El número es " + numero);
  }

}
