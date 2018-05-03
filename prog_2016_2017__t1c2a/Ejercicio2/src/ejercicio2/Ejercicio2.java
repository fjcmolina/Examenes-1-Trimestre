/*
 *     Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 11 comprendidos entre el
 *     330 y el 550 ambos incluidos.
 *
 *     Ejemplo:
 *     517 440 385 374 550 517 484 462 363 418
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
