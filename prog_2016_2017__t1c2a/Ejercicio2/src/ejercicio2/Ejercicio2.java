/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;

    for (int i = 0; contador < 10; i++) {
      numero = (int) ((Math.random() * 220) + 330);

      if ((numero % 11) == 0) {
        System.out.print(numero + " ");
        contador++;
      }
    }
  }

}
