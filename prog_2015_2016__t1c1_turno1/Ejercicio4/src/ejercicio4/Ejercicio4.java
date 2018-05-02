/*
 *     Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares.
 *     Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde
 *     sea necesario para admitir números largos.
 *
 *     Ejemplo 1:
 *     Por favor, introduzca un número entero positivo: 94026782
 *     Dígitos pares: 4 0 2 6 8 2
 *     Suma de los dígitos pares: 22
 *
 *     Ejemplo 2:
 *     Por favor, introduzca un número entero positivo: 31779
 *     Dígitos pares:
 *     Suma de los dígitos pares: 0
 *
 *     Ejemplo 3:
 *     Por favor, introduzca un número entero positivo: 2404
 *     Dígitos pares: 2 4 0 4
 *     Suma de los dígitos pares: 10
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = s.nextLong();
    
    long numero = numeroIntroducido;
    long numeroReves = 0;
    int longitud = 0;
    
     while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    
    int digito;
    int suma = 0;
    
    System.out.print("Los numeros pares son : " );
    
    for(int i = 0;i < longitud;i++){
      digito = (int)(numeroReves % 10);
      if((digito % 2) == 0){
        System.out.print(digito + " ");
        suma += digito;
        }
      numeroReves /= 10;
      }
     System.out.print("\nLa suma de los numeros pares es : " + suma );
  }
  
}
