/*
 *       La compañía automovilística Ñesla nos ha encargado un configurador para calcular el precio de su
 *       coche eléctrico. Los dos modelos que tiene a la venta son el Ñesla Modelo 5 y el Ñesla Modelo 8,
 *       que tienen un precio base de 30.000 € y 36.000 € respectivamente. El Modelo 5 se puede encargar
 *       con batería de 50 kWh o de 70 kWh mientras que el modelo 8 se puede pedir con 80 kWh o con 120
 *       kWh. En todos los casos, cada kWh de batería se paga a 125 €. El Modelo 8 (solo este modelo) se
 *       puede encargar con el paquete de conducción autónoma, que cuesta 1800 €. Todos los coches
 *       eléctricos cuentan con una subvención del gobierno del 5% del precio final del vehículo. No hay que
 *       considerar el IVA, ya está incluido en todas las tarifas.
 *
 *       Ejemplo 1:
 *       Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: a
 *       Seleccione el tipo de batería (a) 50 kWh (b) 70 kWh: b
 *       Gracias. Aquí tiene el presupuesto de su coche.
 *       Ñesla Modelo 5
 *       Precio base 30000.00 €
 *       Batería de 70 kWh 8750.00 €
 *       Subvención estatal -1937.50 €
 *       Total 36812.50 €
 *
 *       Ejemplo 2:
 *       Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: b
 *       Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: a
 *       ¿Quiere el paquete de conducción autónoma? (s/n): n
 *       Gracias. Aquí tiene el presupuesto de su coche.
 *       Ñesla Modelo 8
 *       Precio base 36000.00 €
 *       Batería de 80 kWh 10000.00 €
 *       Sin conducción aut. 0.00 €
 *       Subvención estatal -2300.00 €
 *       Total 43700.00 €
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

    System.out.print("Seleccione el modelo de coche (a) Modelo 5 (b) Modelo 8: ");
    String modelo = s.next();

    int precioBase = 0;
    String nombreModelo = "";
    String tipoBateria = "";
    int bateria = 0;

    if (modelo.equals("a")) {
      precioBase = 30000;
      nombreModelo = "Ñesla Modelo 5";

      System.out.print("Seleccione el tipo de bateria (a) 50 kWh (b) 70 kWh: ");
      tipoBateria = s.next();

      if (tipoBateria.equals("a")) {
        bateria = 50;
      }
      if (tipoBateria.equals("b")) {
        bateria = 70;
      }
    }

    if (modelo.equals("b")) {
      precioBase = 36000;
      nombreModelo = "Ñesla Modelo 8";

      System.out.print("Seleccione el tipo de batería (a) 80 kWh (b) 120 kWh: ");
      tipoBateria = s.next();

      if (tipoBateria.equals("a")) {
        bateria = 80;
      }
      if (tipoBateria.equals("b")) {
        bateria = 120;
      }
    }

    System.out.println();
    
    int precioBateria = bateria * 125;

    System.out.println("Gracias. Aquí tiene el presupuesto de su coche.");
    System.out.println(nombreModelo);
    System.out.println("Precio base: " + precioBase);
    System.out.println("Bateria de " + bateria + " kWh: " + precioBateria);
    System.out.println("Subvencion estatal: ");
    System.out.println("Total");
  }

}
