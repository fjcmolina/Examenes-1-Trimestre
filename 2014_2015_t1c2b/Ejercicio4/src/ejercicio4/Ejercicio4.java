/*
 *    Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
 *     adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
 *     relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
 *     adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
 *     2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
 *     ésta última es mayor o igual que 4.
 *
 *   Ejemplo:
 *     Por favor, indique la altura del árbol de Navidad: 6
 *         *
 *         ^
 *        O^^
 *       ^^O^^
 *      ^*^^*^^
 *     *^^O^^O^^
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, indique la altura del árbol de Navidad: ");
    int altura = s.nextInt();

    for (int i = 0; i < altura; i++) {

      for (int e = 0; e < altura * 2 - 1; e++) {

        if (i == altura - 1) {
          System.out.print("^");

        } else if (e + i == altura - 1 || (altura * 2 - 1) - e + i == altura) {
          System.out.print("^");

        } else if (e + i > altura - 1 && (altura * 2 - 1) - e + i > altura) {

          int adorno = (int)(Math.random() * 6);
          
          switch (adorno) {
            case 0:
              System.out.print("*");
              break;
              
            case 1:
              System.out.print("O");
              break;
              
            case 2:
              System.out.print("O");
              break;
            case 3:
              System.out.print("O");
              break;
              
            case 4:
              System.out.print("*");
              break;
              
            case 5:
              System.out.print("O");
              break;
              
            default:
              System.out.print("^");
          }
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}
