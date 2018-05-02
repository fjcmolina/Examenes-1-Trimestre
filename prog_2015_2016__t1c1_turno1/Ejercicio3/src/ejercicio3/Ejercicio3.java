/*
 *      Realiza un generador de melodía con las siguientes condiciones:
 *
 *       a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 *       b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a
 *       28 y siempre múltiplo de 4 (4, 8, 12…).
 *       c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la
 *       barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
 *       d) La última nota de la melodía debe coincidir con la primera.
 *
 *       Ejemplo 1:
 *       do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 *
 *       Ejemplo 2:
 *       la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */
package ejercicio3;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  public static void main(String[] args) {

    String nota = "";
    String ultimaNota = "";
    int compas = (int) (Math.random() * 7) + 1;

    for (int j = 0; j <= compas; j++) {
      for (int i = 1; i <= 4; i++) {

        int notaNumero = (int) (Math.random() * 7) + 1;
        switch (notaNumero) {
          case 1:
            nota = "do";
            break;
          case 2:
            nota = "re";
            break;
          case 3:
            nota = "mi";
            break;
          case 4:
            nota = "fa";
            break;
          case 5:
            nota = "sol";
            break;
          case 6:
            nota = "la";
            break;
          case 7:
            nota = "si";
            break;
        }

        if ((j == 0) && (i == 1)) {
          ultimaNota = nota;
        }
        if ((j == compas) && (i == 4)) {
          System.out.print(ultimaNota + " ");
        } else {
          System.out.print(nota + " ");
        }
      }//for notas

      if (j < compas) {
        System.out.print("|");
      } else if (j == compas) {
        System.out.print("||");
      }
    }// for del compas
  }

}
