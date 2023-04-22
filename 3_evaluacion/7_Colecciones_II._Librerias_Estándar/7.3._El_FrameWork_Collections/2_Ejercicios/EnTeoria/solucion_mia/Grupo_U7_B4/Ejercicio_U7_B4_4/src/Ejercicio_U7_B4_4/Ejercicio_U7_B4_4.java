package Ejercicio_U7_B4_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_4
 */
public class Ejercicio_U7_B4_4 {

  /**
   * - | inicio
   * + | final
   * * | 1 pos derecha
   * 3 | Suprime lo que hay a la derecha
   */
  public static void main(String[] args) {
    // Captura las líneas del usuario. Fin si línea vacia
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      String input = sc.nextLine();

      if (input.compareToIgnoreCase("") == 0) {
        break;
      } else {
        List<Character> linea = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
          linea.add(input.charAt(i));
        }
      }
    }

    sc.close();
  }
}
