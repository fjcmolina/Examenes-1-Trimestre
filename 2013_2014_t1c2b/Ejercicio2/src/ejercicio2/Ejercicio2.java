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

    int suma = 0;
    int minimo = 1000;
    int multiploMaximo = 0;

    for (int i = 0; i < 45; i++) {
      int numero = (int) (Math.random() * 900) + 100;
      System.out.print(numero + " ");

      suma += numero;
      
      if ((numero < minimo) && ((numero % 2) == 1)) {
        minimo = numero;
      }
      if ((numero % 7 == 0) && (numero > multiploMaximo)) {
        multiploMaximo = numero;
      }
    }
    System.out.println("");
    System.out.println("Media: " + (suma/45));
    System.out.println("Minimo impar: " + minimo);
    System.out.println("Maximo multiplo de 7: " + multiploMaximo);
  }

}
