/*
 *   Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será
 *   indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y
 *   la capacidad máxima que pueda admitir. El ancho de la cuba no varía.
 *
 *   Ejemplo:
 *   Por favor, indique la capacidad de la cuba en litros: 3
 *
 *   #    #
 *   #====#
 *   #====#
 *   ######
 *
 *   La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
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

    System.out.print("Indica la capacidad de la cuba en litros: ");
    int capacidad = s.nextInt();

    int litros = (int) (Math.random() * (capacidad + 1));

    for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.print("#    #");
      } else {
        System.out.print("#====#");
      }
      System.out.println();
    }
    System.out.print("######");
    System.out.print("\nLa capacidad de la cuba es de " + capacidad + " litros y contiene " + litros + " litros");

  }

}
