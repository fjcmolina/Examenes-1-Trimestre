/*
 *   Escribe un programa que muestre 60 números enteros aleatorios comprendidos entre 300 y 600
 *   ambos incluidos y separados por espacios. Muestra también el máximo de los múltiplos de 3, el
 *   mínimo de los pares y la media de todos los números
 */
package ejercicio3;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  public static void main(String[] args) {
    
    int minimo = 600;
    int multiploMaximo = 0;
    int suma = 0;

    for (int i = 0; i < 60; i++) {
      int numero = (int) (Math.random() * 300) + 300;
      System.out.print(numero + " ");
      
      suma += numero;

      if ((numero < minimo) && (numero % 2 == 0)) {
        minimo = numero;
      }
      if ((numero % 3 == 0) && (numero > multiploMaximo)) {
        multiploMaximo = numero;
      }
    }
    System.out.println("");
    System.out.println("Media: " + (suma/60) );
    System.out.println("Minimo par: " + minimo);
    System.out.println("Maximo multiplo de 3: " + multiploMaximo);
  }
  
}
