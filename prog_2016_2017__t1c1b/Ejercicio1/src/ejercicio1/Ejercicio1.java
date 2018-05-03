/*
 *     Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El programa
 *     preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. La tarta de
 *     manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el programa
 *     debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 *     segunda 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; la nata suma
 *     2’50 y la escritura del nombre 2’75.
 *
 *     Ejemplo 1:
 *     Elija un sabor (manzana, fresa o chocolate): chocolate
 *     ¿Qué tipo de chocolate quiere? (negro o blanco): negro
 *     ¿Quiere nata? (si o no): si
 *     ¿Quiere ponerle un nombre? (si o no): no
 *     Tarta de chocolate negro: 14
 *     Con nata: 2’50
 *     Total: 16’50
 *
 *     Ejemplo 2:
 *     Elija un sabor (manzana, fresa o chocolate): manzana
 *     ¿Quiere nata? (si o no): no
 *     ¿Quiere ponerle un nombre? (si o no): si
 *     Tarta de manzana: 18
 *     Con nombre: 2’75
 *     Total: 20’75
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

    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = s.next();

    double precio = 0;
    String chocolate = "";
    double precioNata = 0;
    double precioNombre = 0;

    if (sabor.equals("chocolate")) {

      System.out.print(" ¿Qué tipo de chocolate quiere? (negro o blanco): ");
      chocolate = s.next();

      if (chocolate.equals("negro")) {
        precio = 14;
      }
      if (chocolate.equals("blanco")) {
        precio = 15;
      }
    }

    if (sabor.equals("manzana")) {
      precio = 18;
    }

    if (sabor.equals("fresa")) {
      precio = 16;
    }

    System.out.print("¿Quiere nata? (si o no): ");
    String nata = s.next();

    if (nata.equals("si")) {
      precioNata = 2.50;
    }

    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    String nombre = s.next();

    if (nombre.equals("si")) {
      precioNombre = 2.75;
    }

    if (sabor.equals("chocolate")) {
      System.out.println("Tarta de " + sabor + " " + chocolate + ": " + precio);
    } else {
      System.out.println("Tarta de " + sabor + ": " + precio);
    }

    if (nata.equals("si")) {
      System.out.println("Con nata: " + precioNata);
    }

    if (nombre.equals("si")) {
      System.out.println("Con nombre: " + precioNombre);
    }
    
    double total = precio + precioNata + precioNombre;
    
    System.out.println("Total: " + total);
  }

}
