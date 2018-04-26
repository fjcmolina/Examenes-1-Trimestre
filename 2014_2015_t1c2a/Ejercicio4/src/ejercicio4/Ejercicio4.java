/*
 *     Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
 *     otro array con esos mismos números “barajados”, es decir, reordenados de forma aleatoria. Puede haber
 *     números repetidos en el array original.
 */
package ejercicio4;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  public static void main(String[] args) {

    int[] arrayNumeros = new int[10];
    int i = 0;
    int temp = 0;
    int x = 0;
    int y = 0;

    System.out.println("Array original: ");
    
    for ( i = 0; i < 10; i++) {
      arrayNumeros[i] = (int) (Math.random() * 101);
      System.out.print(" " + arrayNumeros[i] + " ");
    }
    
     for (i = 0; i < 500; i++) {
      x = (int)(Math.random() * 10);
      y = (int)(Math.random() * 10);
      temp = arrayNumeros[x];
      arrayNumeros[x] = arrayNumeros[y];
      arrayNumeros[y] = temp;
    }
     
     System.out.println();
     
     System.out.println("Array barajado: ");
    
    for ( i = 0; i < 10; i++) {
      
      System.out.print(" " + arrayNumeros[i] + " ");
    }
     
  }
}
