/*
 *   Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al
 *   usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar
 *   que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien.
 *   Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en
 *   cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.
 *
 *   Ejemplo:
 *   Por favor, introduzca la altura de la pecera (como mínimo 4): 4
 *   Ahora introduzca la anchura (como mínimo 4): 7
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

    System.out.print("Introduce la altura(minimo 4): ");
    int altura = s.nextInt();

    System.out.print("Introduce la anchura(minimo 4): ");
    int ancho = s.nextInt();

    int i = 0;
    int espacios = 0;
    int posicionPez = 0;
    int posicion = (int) (Math.random());

    // Se pinta el cuadrado de la pecera
    for (i = 1; i <= ancho; i++) {
      System.out.print("*");
    }

    for (i = 2; i < altura; i++) {
      System.out.print("\n*");
      for (espacios = 2; espacios < ancho; espacios++) {
        
        // Pintar pez //  if pinta el pez , else pinta espacio
        if (posicion == posicionPez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.print("*");
    }
    System.out.println();

    for (i = 1; i <= ancho; i++) {
      System.out.print("*");
    }
  }

}
