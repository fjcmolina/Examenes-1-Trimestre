/*
 *       En ocasiones, en clase, se pide la iniciativa de un alumno voluntario para corregir ejercicios, salir a la
 *       pizarra, etc. Por vergüenza, por no tener las tareas hechas o por cualquier otro motivo, a veces nadie
 *       se presta voluntario o bien se ofrecen siempre los mismos. Para evitar esta situación vamos a realizar
 *       un programa que seleccione un alumno de la clase de forma aleatoria. Para simplificar, se tienen en
 *       cuenta solamente 6 alumnos. Todos los nombres se almacenan en un array tal como se muestra en la
 *       siguiente tabla:
 *       
 *       Está terminantemente prohibido utilizar las sentencias if o switch en este ejercicio.
 *
 *       Ejemplo 1
 *       Le ha tocado salir a… María Margarita Benítez
 *
 *       Ejemplo 2
 *       Le ha tocado salir a… Jorge Alcaraz
 */
package ejercicio2;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    String[] clase = {"Adrián Aguilar", "Manuel Alcántara", "Jorge Alcaraz", "Joaquín Bello", "María Margarita Benítez", "Francisco Casasola"};

    int aleatorio = (int) (Math.random() * 6);

    System.out.println("Le ha tocado salir a " + clase[aleatorio]);

  }

}
