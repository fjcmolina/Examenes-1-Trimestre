/*
 *     Escribe un programa que sea capaz de insertar un dígito dentro de un número indicando la posición.
 *     El nuevo dígito se colocará en la posición indicada y el resto de dígitos se desplazará hacia la
 *     derecha. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el
 *     usuario introduce correctamente los datos. Se recomienda usar long en lugar de int ya que el primero
 *     admite números más largos.
 *
 *     Ejemplo 1:
 *      Por favor, introduzca un número entero positivo: 406783
 *      Introduzca la posición donde quiere insertar: 3
 *      Introduzca el dígito que quiere insertar: 5
 *      El número resultante es 4056783..
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
    
    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = s.nextLong();

    System.out.print("Introduce la posición donde quiere insertar: ");
    long posicion = s.nextLong();

    System.out.print("Introduce el dígito que quiere insertar: ");
    long digito = s.nextLong();

    long numero = numeroIntroducido;

    int longitud = 0;

    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);

    // Parte de la izquierda del numero
    long parteIzquierda = numeroIntroducido / (long) (Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;

    // Parte de la derecha del numero
    long parteDerecha = numeroIntroducido % (long) (Math.pow(10, longitud - posicion + 1));

    // REsultado con el numero insertado
    numero = parteIzquierda * (long) (Math.pow(10, longitud - posicion + 1)) + parteDerecha;
    System.out.print("El número es " + numero);
  }

}
