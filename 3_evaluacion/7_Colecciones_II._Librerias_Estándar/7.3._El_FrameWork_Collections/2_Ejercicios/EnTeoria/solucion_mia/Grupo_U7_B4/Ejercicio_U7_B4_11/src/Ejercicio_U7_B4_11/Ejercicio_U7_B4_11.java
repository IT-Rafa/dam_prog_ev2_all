package Ejercicio_U7_B4_11;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_11
 */
public class Ejercicio_U7_B4_11 {

  /**
   * Pasos a seguir:
   * <ul>
   *    <li>Esperamos que usuario introduzca dos números, en la misma línea
   *        <ul>
   *            <li>El primero es número de balones inicial. Mínimo 1</li>
   *            <li>tras cuántos tiros  acaba un balón en el agua. Máximo 100</li>
   *        </ul>
   *        Ejemplo: 1 10 : Tienen un balon y se lanza fuera en el tiro 10. Lanzo 9 dentro.
   *    </li>
   *    <li>Si la entrada del usuario es 0 0 (o similar), el programa finaliza
   *    <li>NO TENGO IDEA </li>
   * </ul>
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      int cantBalones = sc.nextInt();
      int limite = sc.nextInt();
      if (cantBalones == 0 && limite == 0) {
        break;
      }
      System.out.println(cantBalones);
    }
    sc.close();
  }
}
