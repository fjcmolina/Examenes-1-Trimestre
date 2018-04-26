/*
 *     Realiza un programa que pinte la letra N hecha de asteriscos. El programa debe pedir la altura de la
 *     letra, que deberá ser un número mayor o igual que 4. En caso de que el usuario introduzca un número
 *     no válido, se mostrará un mensaje de error.
 *
 *     Ejemplo:
 *     Por favor, introduzca la altura de la N: 5
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

    System.out.println("Introduzaca la altura de la N: ");
    int altura = s.nextInt();

    while (altura < 4) {
      System.out.println("La altura de la Z debe ser mayor o igual de 4");
      System.out.print("Por favor, Introduzca la altura de la Z: ");
      altura = s.nextInt();
    }

    //Primera linea
    System.out.print("*");
    for (int j = 1; j <= (altura - 2); j++) {
      System.out.print(" ");
    }
    System.out.println("*");

    //Parte del centro de la N
    for (int i = (altura - 2); i <= altura; i++) {
      System.out.print("*");
      
      
      
      for (int j = 1; j <= (altura - 2); j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

    //Ultima linea
    System.out.print("*");
    for (int j = 1; j <= (altura - 2); j++) {
      System.out.print(" ");
    }
    System.out.println("*");
  }
}
