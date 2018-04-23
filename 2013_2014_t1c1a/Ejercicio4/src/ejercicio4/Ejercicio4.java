/*
 *    Escribe un programa que genere un albarán bien desglosado a partir del precio inicial, el porcentaje de
      descuento y el tipo de IVA aplicado. El precio inicial se debe indicar en euros y puede tener decimales. El
      descuento es un porcentaje y se aplica al precio inicial. El tipo de IVA puede ser 1) Superreducido 2) Reducido 3)
      General, siendo del 4%, 10% y 21% respectivamente. El IVA se aplica después de haber calculado el descuento.

      Ejemplo:
      Por favor, introduzca el precio inicial del artículo en euros: 18.90
      Introduzca el porcentaje de descuento aplicable: 10
      Introduzca el tipo de IVA 1) Superreducido 2) Reducido 3) General: 3

      ALBARÁN
      Precio inicial: 18.90
      Descuento: 1.89 (10%)
      Precio con descuento: 17.01
      IVA: 3.57
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

    System.out.print("Por favor, introduzca el precio inicial del artículo en euros: ");
    double precio = s.nextDouble();

    System.out.print("Introduzca el porcentaje de descuento aplicable: ");
    int descuento = s.nextInt();

    System.out.print("Introduzca el tipo de IVA 1) Superreducido 2) Reducido 3) General ");
    int tipo = s.nextInt();

    int iva = 0;

    switch (tipo) {
      case 1:
        iva = 4;
        break;

      case 2:
        iva = 10;
        break;

      case 3:
        iva = 21;
        break;

      default:

    }

    double rebaja = ((descuento * precio) / 100);
    double precio1 = (precio - rebaja);
    double total = ((iva * precio1) / 100) + precio1;

    //  ALBARAN
    System.out.println("ALBARAN");
    System.out.println("Precio inicial:       " + precio);
    System.out.println("Descuento:            " + rebaja);
    System.out.println("Precio con descuento: " + precio1);
    System.out.println("IVA:                  " + (iva * precio1) / 100);
    System.out.println("TOTAL:                " + total);
  }

}
