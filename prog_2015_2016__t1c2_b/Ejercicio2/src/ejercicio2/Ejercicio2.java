/*
 *     Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
 *     minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana
 *     comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y hora correctos,
 *     anterior al viernes a las 15:00h.
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
    
    System.out.print("Introduzca un dia de la semana (Lunes a Viernes): ");
    String semana = s.next();

    int dia = 0;

    switch (semana) {
      case "lunes":
        dia = 0;
        break;
      case "martes":
        dia = 1;
        break;
      case "miércoles":
      case "miercoles":
        dia = 2;
        break;
      case "jueves":
        dia = 3;
        break;
      case "viernes":
        dia = 4;
        break;
      default:
        System.out.print("El día introducido no existe");
    }

    System.out.println("\nAhora vamos a introducir la hora del dia elegido");
    System.out.print("Introduce una hora: ");
    int hora = s.nextInt();

    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();

    int minutosFinSemana = (4 * 24 * 60) + (15 * 60);
    int minutosActual = (dia * 24 * 60) + (hora * 60) + minutos;
    int resultado = (minutosFinSemana - minutosActual);

    System.out.printf("Faltan %d minutos hasta el finde de semana", resultado);
  }

}
