/*
 *         Realiza un programa que pinte una marina (un cuadro en el que se ve el mar). El marco del cuadro
 *         siempre tiene un grosor de un carácter y se pinta con asteriscos. El mar se dibuja mediante el carácter
 *         ~ (Alt Gr + ñ). El nivel del mar se situará en una posición aleatoria dentro del cuadro. El usuario debe
 *         introducir la altura y anchura del cuadro. Ambos valores deben ser mayores o iguales a 7. En caso de
 *         que el usuario introduzca una altura o anchura incorrectas, mostrará un mensaje de error.
 *
 *         Ejemplo 1:
 *         Introduzca la altura del cuadro (mayor o igual que 7): 5
 *         Ahora introduzca la anchura (mayor o igual que 7): 8
 *         Lo siento, los datos no son correctos.
 *
 *         Ejemplo 2:
 *         Introduzca la altura del cuadro (mayor o igual que 7): 8
 *         Ahora introduzca la anchura (mayor o igual que 7): 10
 *         * * * * * * * * * *
 *         *                 *
 *         *                 *
 *         *                 *
 *         *                 *
 *         * ~ ~ ~ ~ ~ ~ ~ ~ *
 *         * ~ ~ ~ ~ ~ ~ ~ ~ *
 *         * * * * * * * * * *
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

    System.out.print("Introduce la altura(minimo 7): ");
    int altura = s.nextInt();

    System.out.print("Introduce la anchura(minimo 7): ");
    int ancho = s.nextInt();

    if ((altura < 7) || (ancho < 7)) {
      System.out.println("Lo siento, los datos no son correctos.");

    } else {

      int i = 0;
      int espacios = 0;

      // Se pinta el cuadrado de la pecera
      for (i = 1; i <= ancho; i++) {
        System.out.print("*");
      }

      for (i = 2; i < altura; i++) {
        System.out.print("\n*");
        for (espacios = 2; espacios < ancho; espacios++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();

      for (i = 1; i <= ancho; i++) {
        System.out.print("*");
      }
    }
  }

}
