/*
 *     Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha
 *     tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1’40 y el donut 1 euro. En caso
 *     de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; el primero vale
 *     1’20 y el segundo 1’80. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’25
 *     respectivamente. Se pueden omitir las tildes (por ej. cafe en lugar de café) para evitar posibles
 *     problemas en la codificación de caracteres.
 *
 *     Ejemplo 1:
 *     ¿Qué ha tomado de comer? palmera, donut o pitufo: pitufo
 *     ¿Con qué se ha tomado el pitufo? aceite o tortilla: tortilla
 *     ¿Qué ha tomado de beber? zumo o cafe: café
 *     Pitufo con tortilla: 1’80
 *     Café: 1’25
 *     Total desayuno: 3’05
 *
 *     Ejemplo 2:
 *     ¿Qué ha tomado de comer? palmera, donut o pitufo: donut
 *     ¿Qué ha tomado de beber? zumo o cafe: zumo
 *     Donut: 1
 *     Zumo: 1’50
 *     Total desayuno: 2’50
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

    double precioBebida = 0;
    double precio = 0;
    String acompañamiento = "";

    System.out.print("Qué ha tomado de comer? palmera, donut o pitufo: ");
    String comida = s.next();

    if (comida.equals("pitufo")) {
      System.out.print("¿Con qué se ha tomado el pitufo? aceite o tortilla: ");
      acompañamiento = s.next();

      if (acompañamiento.equals("aceite")) {
        precio = 1.20;
      }
      if (acompañamiento.equals("tortilla")) {
        precio = 1.80;
      }
    }

    if (comida.equals("palmera")) {
      precio = 1.40;
    }

    if (comida.equals("donut")) {
      precio = 1;
    }

    System.out.print("¿Qué ha tomado de beber? zumo o cafe: ");
    String bebida = s.next();

    if (bebida.equals("zumo")) {
      precioBebida = 1.50;
    }

    if (bebida.equals("cafe")) {
      precioBebida = 1.25;
    }

    double total = precio + precioBebida;

    if (comida.equals("pitufo")) {
      System.out.println(comida + " con " + acompañamiento + ": " + precio);
    } else {
      System.out.println(comida + ": " + precio);
    }
    System.out.println(bebida + ": " + precioBebida);
    System.out.println("Total desayuno: " + total);
  }

}
