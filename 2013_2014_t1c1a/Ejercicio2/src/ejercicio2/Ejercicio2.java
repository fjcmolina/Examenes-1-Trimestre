/*
 *  Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se
    leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier longitud siempre que lo
    permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int ya
    que el primero admite números más largos.

    Ejemplo1:
    Por favor, introduzca un número entero positivo: 678
    El 678 no es capicúa.

    Ejemplo2:
    Por favor, introduzca un número entero positivo: 2019102
    El 2019102 es capicúa.
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
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = s.nextLong();
    
    long numero = numeroIntroducido;
    long numeroReves = 0;
    
    //Le da la vuelta al numero
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
    }

    if(numeroIntroducido == numeroReves){
      System.out.println("El " + numeroIntroducido + " es capicua");
    }else{
      System.out.println("El " + numeroIntroducido + " no es capicua");
    }
  }

}
