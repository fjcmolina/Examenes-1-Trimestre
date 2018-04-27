/*
 *   Escribe un programa que genere el menú del día de un restaurante vegetariano. El programa debe pedir el día
 *   de la semana, que será un número del uno al siete, y a continuación debe mostrar de forma aleatoria la
 *   secuencia de platos en función de las siguientes condiciones: (a) De primer plato puede haber ensalada, pasta
 *   o arroz (b) De segundo plato puede haber hamburguesas de soja, filetes de seitán o albóndigas de tofu que irán
 *   acompañados con una guarnición que puede ser patatas bravas, verduras a la plancha o pimientos asados (c)
 *   De postre puede haber flan, helado o arroz con leche (d) Cuando el primer plato es arroz, el postre no puede ser
 *   arroz con leche (e) Los sábados y domingos no hay menú (se debe mostrar un mensaje que así lo indique).
 *
 *   Ejemplo:
 *   Selecciona un día de la semana (un número del 1 al 7): 5
 *   Menú del día: pasta de primero, albóndigas de soja con patatas bravas de segundo y arroz con leche de postre.
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

    System.out.print("Selecciona un día de la semana (un número del 1 al 7):");
    int dia = s.nextInt();

    if (dia < 6) {

      int primerPlato = (int) ((Math.random() * 3) + 1);
      System.out.println("MENU DEL DIA");
      System.out.print("Primer plato: ");

      switch (primerPlato) {

        case 1:
          System.out.println("Ensalada");
          break;

        case 2:
          System.out.println("Pasta");
          break;

        case 3:
          System.out.println("Arroz");
          break;

        default:
      }

      int segundoPlato = (int) ((Math.random() * 3) + 1);
      System.out.print("Segundo plato: ");

      switch (segundoPlato) {

        case 1:
          System.out.println("Hamburguesa de soja");
          break;

        case 2:
          System.out.println("Filetes de seitán");
          break;

        case 3:
          System.out.println("Albóndigas de tofu");
          break;

        default:
      }

      int guarnicion = (int) ((Math.random() * 3) + 1);
      System.out.print("Guarnicion: ");

      switch (guarnicion) {

        case 1:
          System.out.println("Patatas bravas");
          break;

        case 2:
          System.out.println("Verduras a la planca");
          break;

        case 3:
          System.out.println("Pimientos asados");
          break;

        default:
      }

      int postre = (int) ((Math.random() * 3) + 1);
      System.out.print("Postre: ");

      switch (postre) {

        case 1:
          System.out.println("Flan");
          break;

        case 2:
          System.out.println("Helado");
          break;

        case 3:
          System.out.println("Arroz con leche");
          break;

        default:
      }
    } else if ((dia == 6) || (dia == 7)) {
      System.out.println("Lo sentimos, el domingo no tenemos menú disponible.");
    }
  }

}
