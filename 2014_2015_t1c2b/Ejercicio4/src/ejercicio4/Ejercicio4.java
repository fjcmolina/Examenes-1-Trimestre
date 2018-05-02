/*
 *         Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
 *         adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
 *         relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
 *         adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
 *         2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
 *         ésta última es mayor o igual que 4.
 *
 *         Ejemplo:
 *         Por favor, indique la altura del árbol de Navidad: 6
 *             *
 *             ^
 *            O^^
 *           ^^O^^
 *          ^*^^*^^
*          *^^O^^O^^
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce altura del arbol: ");
    int altura = s.nextInt();
    
    int espacios = altura - 2;
    int linea = 1;
    int aleatorio = 0;
    String caracter = "";
    
    //pintamos la cima
    while (espacios + 2 > 0) { //pinta la primera estrella
      System.out.print(" ");
      espacios--;
    }
    espacios = altura - 1;
    System.out.println("*");

    while (espacios + 1 > 0) { //pinta la cima
      System.out.print(" ");
      espacios--;
    }
    aleatorio = ((int) (Math.random() * 9 + 1));
    switch (aleatorio) {
      case 1:
        caracter = "^";
        break;
      case 2:
        caracter = "^";
        break;
      case 3:
        caracter = "^";
        break;
      case 4:
        caracter = "^";
        break;
      case 5:
        caracter = "^";
        break;
      case 6:
        caracter = "^";
        break;
      case 7:
        caracter = "o";
        break;
      case 8:
        caracter = "o";
        break;
      case 9:
        caracter = "*";
        break;
    }
    System.out.println(caracter);
    espacios = altura - 1;
    
    //empezamos a pintar la piramide
    for (int i = altura; i > 0; i--) { //pinta el arbol

      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < ((linea * 2) + 1); k++) {
        aleatorio = ((int) (Math.random() * 9 + 1));
        switch (aleatorio) {
          case 1:
            caracter = "^";
            break;
          case 2:
            caracter = "^";
            break;
          case 3:
            caracter = "^";
            break;
          case 4:
            caracter = "^";
            break;
          case 5:
            caracter = "^";
            break;
          case 6:
            caracter = "^";
            break;
          case 7:
            caracter = "o";
            break;
          case 8:
            caracter = "o";
            break;
          case 9:
            caracter = "*";
            break;
        }
        System.out.print(caracter);
      }
      espacios--;
      linea++;
      System.out.println();
    }
  }

}
