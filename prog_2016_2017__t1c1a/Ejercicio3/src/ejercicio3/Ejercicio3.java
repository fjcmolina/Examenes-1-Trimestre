/*
*      Realiza un programa que pinte una escalera que va descendiendo de izquierda a derecha. El
*      programa pedirá el número de escalones y la altura de cada escalón. La anchura de los escalones
*      siempre es la misma: 4 asteriscos.
*
*      Ejemplo 1:
*      Introduzca el número de escalones: 4
*      Introduzca la altura de cada escalón: 2
*      ****
*      ****
*      ********
*      ********
*      ************
*      ************
*      ****************
*      ****************
 *
*      Ejemplo 2:
*      Introduzca el número de escalones: 3
*      Introduzca la altura de cada escalón: 3
*      ****
*      ****
*      ****
*      ********
*      ********
*      ********
*      ************
*      ************
*      ************
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
    
    int anchura = 4;
    
    System.out.print("Introduzca el número de escalones: ");
    int numero = s.nextInt();
    
    System.out.print("Introduzca la altura de cada escalón: ");
    int altura = s.nextInt();
    
     for (int e = 0; e < altura; e++) {
      
      
      for (int i = 0; i < numero; i++) {
      
        for (int r = 0; r < anchura; r++) {
          System.out.print("*");
        }
        
        
          System.out.println();
        }
      
      anchura += 2;
    }
  }
  
}
