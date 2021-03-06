/*
 *       Escribe un programa que calcule el precio final de un producto según su base imponible (precio
 *       antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
 *       promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4%
 *       respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 *       respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o
 *       se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los
 *       números no estén tabulados.
 *
 *       Ejemplo:
 *       Introduzca la base imponible: 25
 *       Introduzca el tipo de IVA (general, reducido o superreducido): reducido
 *       Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
 *
 *       Base imponible 25.00
 *       IVA (10%) 2.50
 *       Precio con IVA 27.50
 *       Cód. promo. (mitad): -13.75
 *       TOTAL 13.75
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

    System.out.print("Introduzca la base imponible: ");
    double base = s.nextDouble();

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIva = s.next();

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = s.next();

    double iva = 0;

    if (tipoIva.equals("general")) {
      iva = ((base * 21) / 100);
    }
    if (tipoIva.equals("reducido")) {
      iva = ((base * 10) / 100);
    }
    if (tipoIva.equals("superreducido")) {
      iva = ((base * 40) / 100);
    }

    double descuento = 0;
    double precioIva = base + iva;

    if (codigo.equals("nopro")) {
      descuento = 0;
    }
    if (codigo.equals("mitad")) {
      descuento = (precioIva / 2);
    }
    if (codigo.equals("meno5")) {
      descuento = 5;
    }
    if (codigo.equals("5porc")) {
      descuento = ((precioIva * 5) / 100);
    }

    double total = precioIva - descuento;

    System.out.println();
    System.out.println("Base imponible:      " + base);
    System.out.println("IVA:                 " + iva);
    System.out.println("Precio con IVA:      " + precioIva);
    System.out.println("Codigo promocional: -" + descuento);
    System.out.println("TOTAL:               " + total);
  }

}
