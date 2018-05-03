/*
 *       En ajedrez, el valor de las piezas se mide en peones según la siguiente tabla:
 *       Pieza Dama Torre Alfil Caballo Peón
 *       Valor 9 peones 5 peones 3 peones 2 peones 1 peón
 *
 *       Realiza un programa que genere al azar las capturas que ha hecho un jugador durante una partida. El
 *       número de capturas será un valor aleatorio entre 0 y 15. Hay que tener en cuenta que cada jugador
 *       tiene la posibilidad de capturar algunas de las siguientes piezas (no más): 1 dama, 2 torres, 2 alfiles, 2
 *       caballos y 8 peones. El nombre de las piezas se debe guardar en un array de la forma pieza =
 *       {“Dama”, “Torre”, “Alfil”, “Caballo”, “Peón”} y el valor de cada una de ellas en otro array de la
 *       forma valor = {9, 5, 3, 2, 1}. El alumno puede utilizar más arrays si lo estima oportuno. Al final debe
 *       aparecer la puntuación total. Si hay algún problema con las cadenas de caracteres, se permite
 *       cambiar “Peón” por “Peon”.
 *
 *       Ejemplo:
 *       Fichas capturadas por el jugador:
 *       Alfil (3 peones)
 *       Caballo (2 peones)
 *       Peón (1 peones)
 *       Torre (5 peones)
 *       Peón (1 peones)
 *       Puntos totales: 12 peones.
 */
package ejercicio3;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  public static void main(String[] args) {
    //Declaramos las variables
    String[] pieza = {"Dama", "Torre", "Alfil", "Caballo", "Peón"};
    int[] valor = {9, 5, 3, 2, 1};

    //Generamos un número aleatorio para cada ficha
    int[] capturas = {
      (int) (Math.random() * 1),
      (int) (Math.random() * 2),
      (int) (Math.random() * 2),
      (int) (Math.random() * 2),
      (int) (Math.random() * 8)
    };

    //Establecemos la variable en la que iremos introduciendo los puntos
    int suma = 0;

    System.out.println("Fichas capturadas por el jugador:");

    //Imprimimos las capturas
    for (int i = 0; i < 5; i++) {
      //Si el número generado para una ficha es 0, no mostramos esa ficha
      if (capturas[i] != 0) {
        System.out.printf("%s (%d peones)\n", pieza[i], valor[i] * capturas[i], capturas[i]);
        //Sumamos los puntos de del ficha
        suma = suma + (valor[i] * capturas[i]);
      }
    }
    //Mostramos el resultado final
    System.out.printf("Puntos totales: %d peones", suma);
  }

}
