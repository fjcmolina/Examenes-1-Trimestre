/*
 *     La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
 *     ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
 *     bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
 *     precio se incrementa en 2.50 € independientemente del centimetros. Los gastos de envío son 3.25 €. El
 *     IVA ya está incluido en todas las tarifas.
 *
 *     Ejemplo:
 *     Introduzca la altura de la bandera en cm: 20
 *     Ahora introduzca la anchura: 35
 *     ¿Quiere escudo bordado? (s/n): n
 *     Gracias. Aquí tiene el desglose de su compra.
 *     Bandera de 700 cm²: 7.00 €
 *     Sin escudo: 0.00 €
 *     Gastos de envío: 3.25 €
 *     Total: 10.25 €
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

    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = s.nextInt();

    System.out.print("Ahora introduzca la anchura: ");
    int anchura = s.nextInt();

    System.out.print("¿Quiere escudo bordado? (s/n):");
    String escudo = s.next();

    System.out.println();
    int centimetros = altura * anchura;
    double bandera = centimetros * 0.01;

    System.out.println("Bandera de " + centimetros + "cm2 :" + bandera);

    double precio = 0;

    if (escudo.equals("s")) {
      precio = 2.50;
      System.out.println("Con escudo: " + precio);
    }
    if (escudo.equals("n")) {
      precio = 0;
      System.out.println("Sin escudo: " + precio);
    }

    double total = bandera + precio + 3.5;
    System.out.println("Gastos de envio: 3.25 €");
    System.out.println("Total: " + total);
  }

}
