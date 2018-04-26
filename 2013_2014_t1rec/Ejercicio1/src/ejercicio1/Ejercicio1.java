/*
 *     Realiza un programa que genere un tique de compra a partir del precio inicial y del código de
 *     descuento. Se aplicará siempre un IVA del 21%. El precio inicial se debe indicar en euros y puede
 *     tener decimales. El descuento se aplica al precio inicial, antes de calcular el importe del IVA. Los
 *     códigos de descuento son “FCJ4”, “Q25Y” y “AM68” que restan 3, 5 y 10 euros respectivamente
 *     (siempre que el importe de la compra sea igual o inferior al descuento que se quiere hacer). El código
 *     “0” indica que no hay descuento. Los datos de la tienda deben estar almacenados en las cadenas de
 *     caracteres cifTienda y nombreTienda (no se piden por teclado).
 *
 *     Ejemplo:
 *      Por favor, introduzca el precio inicial del artículo en euros: 39.95
 *      Introduzca el código de descuento (introduzca 0 si no hay descuento): AM68
 *
 *      MODAS LA GUAPILLA - CIF:1234567A
 *      TIQUE DE COMPRA
 *      Precio artículo: 39.95
 *      Descuento: 10.00 (AM68)
 *      Precio con descuento: 29.95
 *      IVA: 6.29 (21%)
 *      TOTAL: 36.24
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

    System.out.println("Por favor, introduzca el precio inicial del artículo en euros: ");
    double precio = s.nextDouble();

    System.out.println("Introduzca el código de descuento (introduzca 0 si no hay descuento): ");
    String codigo = s.next();

    double descuento = 0;
    
    if (codigo.equals("0")) {
      descuento = 0;
    }
    if (codigo.equals("FCJ4")) {
      descuento = 3;
    }
    if (codigo.equals("Q25Y")) {
      descuento = 5;
    }
    if (codigo.equals("AM68")) {
      descuento = 10;
    }
     
    
    String nombreTienda = "MODAS LA GUAPILLA";
    String cifTienda = "1234567A";
    
    System.out.println("\n" + nombreTienda + " - " + cifTienda);
    System.out.println("TIQUE DE COMPRA");
    System.out.println("Precio Articulo: " + precio);
    System.out.println("Descuento: " + descuento + "(" + codigo + ")");
    System.out.println("Precio con descuento: " + (precio - descuento));
    System.out.println("IVA: ");
    System.out.println("TOTAL: ");
  }

}
