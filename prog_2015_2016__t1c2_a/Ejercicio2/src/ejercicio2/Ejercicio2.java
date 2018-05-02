/*
 *     Escribe un programa que rellene un array de 100 elementos con números enteros comprendidos entre
 *     0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
 *     quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
 *     número destacado entre dobles asteriscos.
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
    
    int[] numero = new int[100]; // se define el array y se reserva espacio para 10 enteros
    int maximo = 0;
    int minimo = 9999999;

    for (int i = 0; i < 100; i++) {
      numero[i] = (int) (Math.random() * 501); //Genera numeros aleatorios

      // Comprobar maximo y minimo
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    System.out.println();

    //Mostrar valores array original
    System.out.println("Los valores son: ");
    for (int i = 0; i < 100; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.print("\n¿Que quieres destacar?(1.Minimo 2.Maximo):");
    int opcion = s.nextInt();

    int destacado = 0;

    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }
    // Muestra el resultado.
    for (int i = 0; i < 100; i++) {
      if (numero[i] == destacado) {
        System.out.print(" **" + numero[i] + "** ");
      } else {
        System.out.print(numero[i] + " ");
      }
    }
  }

}
