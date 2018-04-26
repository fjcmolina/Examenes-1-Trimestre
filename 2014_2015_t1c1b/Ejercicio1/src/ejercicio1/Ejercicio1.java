/*
 *     Escribe un programa que calcule el sueldo bruto a percibir por un trabajador de la construcción en un
 *     mes. El programa debe pedir el cargo desempeñado (un número del 1 al 3) y el número de horas
 *     trabajadas. Los cargos existentes son peón, albañil y encargado de obra; con un sueldo base de 1000,
 *     1400 y 1700 euros al mes respectivamente. El sueldo base se cobra trabajando exactamente 140
 *     horas al mes. Si un empleado trabaja menos de 140 horas en un mes, cobra la parte proporcional del
 *     sueldo. Si trabaja más de 140 horas, cada hora extra se paga al 2% del salario base, es decir a 20, 28
 *     o 34 euros según el cargo. Por ejemplo, un albañil que haya trabajado 150 horas ganaría 1680 euros
 *     (1400 + 280). Un encargado de obra que haya trabajado 70 horas ganaría 850 euros.
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

    System.out.print("Introduce el cargo desempeñado (1.Peon 2.Albañil 3.Encargado de obra): ");
    int cargo = s.nextInt();

    System.out.print("Introduce el numero de horas trabajadas: ");
    int horas = s.nextInt();

    int sueldoBase = 0;

    switch (cargo) {
      case 1:
        sueldoBase = 1000;
        break;

      case 2:
        sueldoBase = 1400;
        break;

      case 3:
        sueldoBase = 1700;
        break;

      default:
    }

    int horasExtra = ((horas - 140) * 2) / 100;

    if (horas > 140) {
      System.out.println("Sueldo del trabajador: " + (sueldoBase + (sueldoBase * horasExtra)));
    } else {
      System.out.println("Sueldo del trabajador: " + ((sueldoBase * horas)/140));
    }
  }

}
