/*
 *     Realiza un programa que pida 10 números enteros por teclado. A continuación el programa nos tiene
 *     que decir cuál es el número que más se repite y cuántas veces se repite. Si hay varios números
 *     repetidos las mismas veces, se da por bueno cualquiera de ellos.
 *
 *     Ejemplo:
 *     Introduzca diez números enteros:
 *     23
 *     6789
 *     -345
 *     88 6789
 *     9387
 *     2344
 *     -1024
 *     8
 *     El número que más aparece es el 8. Se repite 3 veces.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca diez números enteros: ");
    
    for (int i = 0; i < 10; i++) {
      int numero = s.nextInt();
    }
  }
}
