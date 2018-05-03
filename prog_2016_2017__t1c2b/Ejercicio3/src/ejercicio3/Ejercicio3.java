/*
 *     Escribe un programa que, a partir de un número generado al azar entre 0 y 100000, pinte una figura
 *     zigzagueante. Por cada dígito del número se debe pintar una diagonal con tantos asteriscos como
 *     indique el dígito, empezando siempre de izquierda a derecha. El dígito 0 se ignora y no tiene ningún
 *     efecto sobre la figura. La dirección de las diagonales se van alternando: primero de izquierda a
 *     derecha, luego de derecha a izquierda, luego otra vez de izquierda a derecha, etc. Observa que, al
 *     final, el número de asteriscos pintados es igual a la suma de todos los dígitos del número. Hay que
 *     dejar un espacio prudencial entre el primer carácter que se pinta y el borde izquierdo de la pantalla
 *     (por ej. 15 o 20 espacios). Fíjate que lo único aleatorio que tiene este ejercicio es la generación del
 *     número.
 */
package ejercicio3;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  public static void main(String[] args) {

    int numero = (int) (Math.random() * 100001);
    int espacios = 20;
    int direccion = 0;

    System.out.println("El número generado es: " + numero);

    // Lo primero es voltear el número para imprimir según el orden
    int modulo;
    int volteado = 0;
    int cifra;

    do {
      modulo = numero % 10;
      volteado = volteado * 10 + modulo;
      numero /= 10;
    } while (numero > 0);

    do {

      cifra = volteado % 10;

      if (cifra == 0) {

        if (direccion == 1) {
          direccion = 0;
        } else {
          direccion = 1;
        }
      }

      if (direccion == 0) {

        for (int i = 0; i < cifra; i++) {

          if (i == cifra - 1) {
            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            espacios--;
          } else {

            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            espacios++;
          }
        }
        direccion = 1;
        volteado /= 10;
      } else {

        for (int i = 0; i < cifra; i++) {

          if (i == cifra - 1) {
            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            espacios++;
          } else {

            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            espacios--;
          }
        }
        direccion = 0;
        volteado /= 10;
      }

    } while (volteado > 0);
  }

}
