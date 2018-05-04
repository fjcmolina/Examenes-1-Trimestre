/*
 *     En ocasiones, en clase, se pide la iniciativa de un alumno voluntario para corregir ejercicios, salir a la
 *     pizarra, etc. Por vergüenza, por no tener las tareas hechas o por cualquier otro motivo, a veces nadie
 *     se presta voluntario o bien se ofrecen siempre los mismos. Para evitar esta situación vamos a realizar
 *     un programa que seleccione un alumno de la clase de forma aleatoria. Para simplificar, se tienen en
 *     cuenta solamente 6 alumnos.
 */
package ejercicio3;

/**
 *
 * @author Francis
 */
public class Ejercicio3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    String[] alumnos = {
      "Adrián Aguilar",
      "Manuel Alcántara",
      "Jorge Alcaraz",
      "Joaquín Bello",
      "María Margarita Benítez",
      "Francisco Casasola"};
    
    System.out.print("Le ha tocado salir a... ");
    
    int alumnoAleatorio = (int) ((Math.random() * 6));
    
    System.out.print(alumnos[alumnoAleatorio]);
  }

}
