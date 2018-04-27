/*
 *     Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa debe
 *     pedir el día de la semana (un número del 1 al 7) y debe mostrar de forma aleatoria la secuencia del
 *     entrenamiento en función de las siguientes pautas:
 *
 *     - El entrenamiento empieza siempre con un calentamiento que puede ser bicicleta, elíptica o cinta.
 *     - A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los grupos musculares
 *     grandes son espalda, pecho y piernas y los grupos musculares pequeños son biceps, triceps y hombros.
 *     - El entrenamiento finaliza con abdominales o con ejercicio aeróbico (bicicleta, elíptica o cinta). En caso de
 *     finalizar con aeróbico, no se puede repetir el ejercicio que se hizo en el calentamiento.
 *     - Los miércoles y los domingos son días de descanso.
*
 *     Ejemplo:
 *     Introduzca un número del 1 al 7 correspondiente a un día de la semana: 4
 *     Su entrenamiento de hoy es el siguiente: elíptica, espalda, bíceps y bicicleta.
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

    System.out.print("Introduzca un número del 1 al 7 correspondiente a un día de la semana: ");
    int dia = s.nextInt();

    boolean entrenamiento = false;

    switch (dia) {
      case 1:
        entrenamiento = true;
        break;

      case 2:
        entrenamiento = true;
        break;

      case 3:
        entrenamiento = false;
        break;

      case 4:
        entrenamiento = true;
        break;

      case 5:
        entrenamiento = true;
        break;

      case 6:
        entrenamiento = true;
        break;

      case 7:
        entrenamiento = false;
        break;
      default:
    }

    int calentamiento = 0;
    int grupoGrande = 0;
    int grupoPequño = 0;

    if (entrenamiento) {

      switch (calentamiento) {
        case 1:
          System.out.print("Bicicleta");
          break;

        case 2:
          System.out.print("Eliptica");
          break;

        case 3:
          System.out.print("Cinta");
          break;

        default:
      }
    }

    if (!entrenamiento) {
      System.out.println("Hoy es dia de descanso");
    }
  }
}
