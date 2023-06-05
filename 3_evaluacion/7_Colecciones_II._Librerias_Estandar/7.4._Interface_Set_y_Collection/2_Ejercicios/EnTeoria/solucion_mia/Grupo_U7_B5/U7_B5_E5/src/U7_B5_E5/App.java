package U7_B5_E5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Clase que contiene las clases para ejecutar el
 * Ejercicio_U7_B5_E5
 */
public class App {

  /**
   * Pide cantidad cumpleaños
   * Si 0 finaliza
   * Pide los cumpleaños dia/mes/año
   * Si alguno está repetido muestra SÍ, si no, muestra NO
   *
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Pide Cant cumpleaños, hasta que sean 0
    while (!sc.nextLine().startsWith("0")) {
      // Preparamos variable cumpleaños
      Set<String> listaCumpleaños = new HashSet<>();

      // Variable para saber si hubo una variable a añadir repetida
      boolean repetido = false;

      // Capturamos String con todos cumpleaños
      String cumples = sc.nextLine();

      // Creamos array con cada cumpleaños
      String[] listaCumple = cumples.split(" ");

      for (String c : listaCumple) {
        // Capturamos y guardamos en int las el dia y el mes del
        // cumpleaños
        String[] cumpleSt = c.split("/");
        Integer[] cumple = new Integer[2];

        cumple[0] = Integer.parseInt(cumpleSt[0]);
        cumple[1] = Integer.parseInt(cumpleSt[1]);

        // Añadimos cada cumple a la lista
        if (!listaCumpleaños.add(cumple[0] + "/" + cumple[1])) {
          // Si devuelve falso, estará repetido. Anulamos bucle
          repetido = true;
          break;
        }
      }
      // Si se repitió, mostramos SI, si no NO
      if (repetido) {
        System.out.println("SI");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
