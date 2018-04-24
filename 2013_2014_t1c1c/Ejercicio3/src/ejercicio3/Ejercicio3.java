/*
 *   Genera el precio (bien desglosado) de un pedido a un almacén en función de las siguientes
 *   condiciones:
 *
 *   - Se pregunta el precio del artículo, el número de unidades y el código de descuento.
 *   - El precio inicial del pedido se calcula multiplicando el precio unitario por la cantidad.
 *   - El código 685 hace que se resten 15 euros.
 *   - El código 778 aplica un 5% de descuento a las 20 primeras unidades.
 *   - El código 219 hace que las primeras 5 unidades salgan gratis (válido solo si se piden más de 5
 *   unidades).
 *   - Al final se suma el 21% de IVA.
 *
 *   Cualquier código diferente a los anteriormente mencionados no tiene ningún efecto sobre el precio.
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

    System.out.println("Precio del articulo: ");
    int precio = s.nextInt();

    System.out.println("Numero de unidades: ");
    int unidades = s.nextInt();

    System.out.println("Codigo de descuento: ");
    int codigo = s.nextInt();

    int precioTotal = 0;
    int descuento = 0;

    if (codigo == 685) {
      precioTotal = (precio * unidades) - 15;
    }
    
    if (codigo == 778) {
      if(unidades <= 20){
      descuento = ((precio * unidades) * 5)/100;
        }else {
      precioTotal = descuento + (precio * (unidades - 20));
      }
    }

    if (codigo == 219) {
      if (unidades > 5) {
        precioTotal = precio * (unidades - 5);
      } else {
        precioTotal = precio * unidades;
      }
    }
  }

}
