/*
 *       Los Reyes Magos de Oriente se están entrenando para estar en forma cuando tengan que repartir los
 *       regalos a los niños. Para ello, compiten con frecuencia haciendo carreras de camellos entre ellos.
 *       Realiza un simulador de carreras de camellos que cumpla las siguientes condiciones:
 *       a) La pista de carreras tiene 8 posiciones (7 guiones y una bandera).
 *       b) La carrera se realizará por pasos, en cada paso el programa debe pintar el estado de la carrera.
 *       c) La línea de meta se indica con una banderita (una P mayúscula), que está exactamente en la
 *       posición número 8 de la pista de carreras.
 *       d) En el paso número 1, todos los competidores están en la posición número 1.
 *       e) En cada paso, uno de los competidores (elegido de forma aleatoria) avanza un paso.
 *       f) Gana la carrera el Rey Mago que consigue llegar a la línea de meta (donde está la bandera).
 *       g) Los caracteres utilizados y el formato debe ser como el que se muestra en el ejemplo.
 */
package ejercicio4;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  public static void main(String[] args) {

    //Crea el array de la pista de carreras y lo rellena
    char[] pistaCarreras = new char[8];

    for (int i = 0; i < pistaCarreras.length; i++) {
      pistaCarreras[i] = '-';
      if (i == pistaCarreras.length - 1) {
        pistaCarreras[i] = 'P';
      }
    }

    //Crea y rellena los arrays de los Reyes
    char[] melchor = new char[8];
    melchor[0] = 'M';
    char[] gaspar = new char[8];
    gaspar[0] = 'G';
    char[] baltasar = new char[8];
    baltasar[0] = 'B';

    // #LaCarrera
    int numPaso = 1;
    int posM = 0;
    int posG = 0;
    int posB = 0;

    // Imprime la posición de salida
    System.out.printf("%-9s", "Salida");
    for (int i = 0; i < pistaCarreras.length; i++) {
      System.out.print(pistaCarreras[i]);
    }

    System.out.println();

    System.out.printf("%9s", "Melchor:");
    for (int i = 0; i < melchor.length; i++) {
      System.out.print(melchor[i]);
    }

    System.out.println();

    System.out.printf("%9s", "Gaspar:");
    for (int i = 0; i < gaspar.length; i++) {
      System.out.print(gaspar[i]);
    }

    System.out.println();

    System.out.printf("%9s", "Baltasar:");
    for (int i = 0; i < baltasar.length; i++) {
      System.out.print(baltasar[i]);
    }

    System.out.println();

    do {
      System.out.printf("%s %-4d", "Paso", numPaso);
      for (int i = 0; i < pistaCarreras.length; i++) {
        System.out.print(pistaCarreras[i]);
      }

      System.out.println();
      numPaso++;

      //Quién avanza
      int rey = (int) ((Math.random() * 3));

      switch (rey) {
        case 0:
          melchor[posM + 1] = melchor[posM];
          melchor[posM] = ' ';
          posM++;
          break;
        case 1:
          gaspar[posG + 1] = gaspar[posG];
          gaspar[posG] = ' ';
          posG++;
          break;
        case 2:
          baltasar[posB + 1] = baltasar[posB];
          baltasar[posB] = ' ';
          posB++;
          break;
      }

      // Imprime el avance
      System.out.printf("%9s", "Melchor:");
      for (int i = 0; i < melchor.length; i++) {
        System.out.print(melchor[i]);
      }

      System.out.println();

      System.out.printf("%9s", "Gaspar:");
      for (int i = 0; i < gaspar.length; i++) {
        System.out.print(gaspar[i]);
      }

      System.out.println();

      System.out.printf("%9s", "Baltasar:");
      for (int i = 0; i < baltasar.length; i++) {
        System.out.print(baltasar[i]);
      }

      System.out.println();
      System.out.println();

    } while ((posM < 7) && (posG < 7) && (posB < 7));

    System.out.println();

    System.out.print("¡Ha ganado ");
    if (posM == 7) {
      System.out.println("Melchor!");
    }
    if (posG == 7) {
      System.out.println("Gaspar!");
    }
    if (posB == 7) {
      System.out.println("Baltasar!");
    }
  }

}
