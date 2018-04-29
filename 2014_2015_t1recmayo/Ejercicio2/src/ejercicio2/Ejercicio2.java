/*
 *   Escribe un programa que muestre una secuencia aleatoria de colores a elegir entre rojo, amarillo,
 *   blanco o verde. El programa parará cuando salga el rojo.
 *
 *   Ejemplo:
 *   amarillo verde amarillo blanco blanco rojo
 */
package ejercicio2;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    for (int i = 0; i < 4; i++) {

      int colores = (int) (Math.random() * 5);

      if (colores == 2) {
        i = 3;
      }
      switch (colores) {
        case 1:
          System.out.println("Amarillo");
          break;

        case 2:
          System.out.println("Rojo");
          break;

        case 3:
          System.out.println("Blanco");
          break;

        case 4:
          System.out.println("Verde");
          break;
      }
    }
  }
}
