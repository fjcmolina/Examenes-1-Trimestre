/*
 *     Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
 *     y el 210 ambos incluidos.
 *
 *     Ejemplo:
 *      203 210 140 175 217 203 175 210 140 182
 */
package ejercicio1;

/**
 *
 * @author Francis
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    int contador = 0;
    for (int i = 0; contador < 10; i++) {
      int numero = (int) ((Math.random() * 71) + 140);

      if ((numero % 7) == 0) {
        System.out.print(numero + " ");
        contador++;
      }
    }
  }

}
