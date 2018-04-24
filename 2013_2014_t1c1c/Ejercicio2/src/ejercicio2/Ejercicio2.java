/*
 *   Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
 *   número. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 *   
 *   Ejemplo 1:
 *   Por favor, introduzca un número entero positivo: 406783
 *   El 406783 contiene 4 dígitos pares y 2 dígitos impares.
 *
 *   Ejemplo 2:
 *   Por favor, introduzca un número entero positivo: 3177840
 *   El 3177840 contiene 3 dígitos pares y 4 dígitos impares.
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
    long numeroIntroducido = s.nextInt();
    
    long numero = numeroIntroducido;
    long numeroReves = 0;
    int contadorPar = 0;
    int contadorImpar = 0;
    
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
  
      int digito;

      digito = (int)(numeroReves % 10);
      if((digito % 2) == 0){
      contadorPar++;
        }else{
          contadorImpar++;
          }
      numeroReves /= 10;
      }
      
     System.out.print("\n Hay " +contadorPar + " numeros pares");
     System.out.print("\n Hay " +contadorImpar + " numeros impares");
  }
  
}
