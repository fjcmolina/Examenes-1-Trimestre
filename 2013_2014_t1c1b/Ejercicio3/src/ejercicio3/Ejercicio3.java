/*
 *  Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir
    la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario
    se debe mostrar un mensaje de error.
    Ejemplo:
    Por favor, introduzca la altura del reloj de arena: 5
    *****
     ***
      *
     ***
    *****
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
    System.out.print("Introduce la altura del reloj de arena: ");
    int altura = s.nextInt();

    
     //Parte de arriba del reloj
    for (int i = 1; i <= (altura / 2); i++){
      for (int j = 1; j <= (i - 1); j++){
        System.out.print(" ");
      }
      for (int j = (altura - (2 * (i - 1))); j >= 1; j--){
        System.out.print("*");
      }
      System.out.println();
    }

    // Parte central del reloj
    for (int i = 1; i <= (altura / 2); i++){
      System.out.print(" ");
    }    
    System.out.println("*");

    //Parte de abajo del reloj
    for (int i = (altura / 2); i >= 1; i--){
      for (int j = (i - 1); j >= 1; j--){
        System.out.print(" ");
      }
      for (int j = (altura - (2 * (i - 1))); j >= 1; j--){
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
