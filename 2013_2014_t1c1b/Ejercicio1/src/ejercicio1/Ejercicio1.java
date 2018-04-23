/*
 *    Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes
      condiciones:

      a) Se pregunta el cargo del empleado (1- Prog. junior, 2 – Prog. senior, 3 – Analista), los días que
      ha estado de viaje visitando clientes durante el mes y su estado civil (1 – Soltero, 2- Casado)

      b) El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior,
      un prog. senior o un analista respectivamente.

      c) Por cada día de viaje visitando clientes se pagan 30 euros, además de un 3% del sueldo base.
      Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en
      caso de estar casado.
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

    System.out.print("Por favor, introduzca el cargo de empleado (1- Prog. junior, 2 – Prog. senior, 3 – Analista): ");
    int cargo = s.nextInt();

    System.out.print("¿Cuantos das ha estado de viaje visitando clientes? ");
    int dias = s.nextInt();

    System.out.print("Por favor, introduzca el estado civil (1 – Soltero, 2- Casado): ");
    int estadoCivil = s.nextInt();

    int sueldoBase = 0;
    int irpf = 0;

    switch (cargo) {
      case 1:
        sueldoBase = 950;
        break;

      case 2:
        sueldoBase = 1200;
        break;

      case 3:
        sueldoBase = 1600;
        break;

      default:
    }

    switch (estadoCivil) {
      case 1:
        irpf = 25;
        break;

      case 2:
        irpf = 20;
        break;

      default:
    }
   
    int pagoDias = dias * 30;
 
    int irpfDescontar = ((irpf * (sueldoBase + pagoDias )) / 100);

    System.out.println("\nNOMINA");
    System.out.println("Sueldo base del empleado: " + sueldoBase);
    System.out.println("Dias de viajes: " + dias);
    System.out.println("Sueldo por dias de viaje: " + pagoDias);
    System.out.println("IRPF: " + irpfDescontar);
    System.out.println("Sueldo final: " + (sueldoBase + pagoDias - irpfDescontar));
  }

}
