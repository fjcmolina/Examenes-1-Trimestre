/*
 *   Escribe un programa que muestre 45 números enteros aleatorios comprendidos entre 100 y 1000
 *   ambos incluidos y separados por espacios. Muestra también el máximo de los múltiplos de 7, el
 *   mínimo de los impares y la media de todos los números.
 */
package ejercicio2;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    for (int i = 0; i < 45; i++) {
      int numero = (int) (Math.random()* 1000) + 100;
      System.out.print(numero + " ");
    }
  }

}
