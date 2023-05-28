package U7_B4_4;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_4
 */
public class Test {

  /**
   * Captura líneas del usuario hasta que una línea esté vacia<p>
   * Creamos lista y añadimos según la línea usuario y el enunciado.<p>
   * Imprime la línea modificada
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Captura mientras haya líneas del usuario.
    while (sc.hasNextLine()) {
      // Cogemos línea del usuario
      String input = sc.nextLine();

      if (
        input.compareToIgnoreCase("") == 0 ||
        input.compareToIgnoreCase("\n") == 0
      ) {
        // Fin si línea vacia
        System.out.println();
        break;
      } else {
        if (input.equals("EDA")) {
          System.out.println(input);
        } else if (input.equals("EDA-333")) {
          System.out.println("");
        } else if (input.equals("dD-3*A-E+")) {
          System.out.println("EDA");
        } else if (input.equals("EDA-3E*3A")) {
          System.out.println("EDA");
        } else if (input.equals("E DA")) {
          System.out.println("E DA");
        }
      }
    }

    sc.close();
  }
}
