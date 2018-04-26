/*
 *   Realiza un programa que calcule el coste mensual del servicio de almacenamiento en la nube de los
 *   datos de nuestra empresa. El programa debe pedir el tipo de servicio (un número del 1 al 3) y el
 *   número de gigabytes que se han transferido durante el mes. El tipo de servicio, según la velocidad de
 *   transferencia, puede ser básico, estándar o premium; con un coste mínimo de 200, 500 y 800 euros al
 *   mes respectivamente. El precio mínimo se cobra cuando la transferencia de datos ha sido de 40
 *   gigabytes o menos. Si se han transferido más de 40 gigabytes, cada gigabyte extra se paga al 5% del
 *   coste base, es decir a 10, 25 o 40 euros según el tipo de servicio. Por ejemplo, un servicio de tipo
 *   básico con un tráfico de 20 gigabytes costaría 200 euros. Un servicio de tipo estándar con un tráfico
 *   de 50 gigabytes costaría 750 euros (500 + 250).
 */
package ejercicio1;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Francis
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el tipo de servicio (1.Basico 2. Estandar 3.Premium):");
    int tipoServicio = s.nextInt();

    System.out.println("Introduce el numero de gigabytes consumidos: ");
    int gigabytes = s.nextInt();

    int coste = 0;
    int datos = 0;

    switch (tipoServicio) {

      case 1:
        coste = 200;
        break;

      case 2:
        coste = 500;
        break;

      case 3:
        coste = 800;
        break;

      default:
    }
    int gigabytesExtras = gigabytes - 40;
    int extra = (coste * 5) / 100;

    if (gigabytes <= 40) {
      System.out.println("Coste mensual: " + coste);
    } else {
      System.out.println("Coste mensual: " + (coste + (gigabytesExtras * extra)));
    }
  }
}
