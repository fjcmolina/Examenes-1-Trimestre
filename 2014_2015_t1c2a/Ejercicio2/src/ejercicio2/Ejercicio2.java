/*
 *   Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
 *   caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
 *   fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
 *   puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
 *   por el usuario y deberá ser mayor o igual a 3.
 *
 *    Ejemplo:
 *     Por favor, indique la altura del plano inclinado: 5
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
    
    System.out.println("Por favor, indique la altura del plano inclinado:");
    int altura = s.nextInt();
    
    int anchura = 1;
    int peldaño = 1;
    
    int bolita = bolita = (int) ((Math.random() * 4) + 1);

    for (int e = 0; e < altura; e++) {

      for (int i = 0; i < peldaño; i++) {

        for (int r = 0; r < anchura; r++) {
          System.out.print("#");
        }

        if ((e == bolita)) {
          System.out.print(" O");
        }
        System.out.println();
      }

      anchura++;
    }
  }

}
