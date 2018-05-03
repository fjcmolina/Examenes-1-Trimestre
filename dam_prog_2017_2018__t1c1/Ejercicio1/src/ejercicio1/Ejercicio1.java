/*
 *     Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
 *     positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
 *     primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
 *     cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 *
 *     Ejemplo:
 *     Por favor, vaya introduciendo números enteros positivos. Para terminar,
 *     introduzca un número primo:
 *     6
 *     8 
 *      15
 *     12
 *     23
 *     Ha introducido 4 números no primos.
 *     Máximo: 15
 *     Mínimo: 6
 *     Media: 10.25
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

    System.out.print("Por favor, vaya introduciendo números enteros positivos.\nPara terminar, introduzca un número primo: ");

    int numero = s.nextInt();
  }

}
