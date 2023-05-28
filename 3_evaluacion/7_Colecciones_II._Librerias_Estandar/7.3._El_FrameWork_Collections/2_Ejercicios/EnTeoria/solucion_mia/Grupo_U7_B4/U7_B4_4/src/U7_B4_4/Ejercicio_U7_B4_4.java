package U7_B4_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_4
 */
public class Ejercicio_U7_B4_4 {

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

      if (input.compareToIgnoreCase("") == 0) {
        // Fin si línea vacia
        break;
      } else {
        // Línea válida, recogemos caracteres

        // Creamos List con LinkedList vacia

        List<Character> linea = new LinkedList<>();
        // Posición de entrada datos = 0
        int newIndice = 0;

        // Recorremos entrada del usuario
        for (int i = 0; i < input.length(); i++) {
          // character introducido
          char c = input.charAt(i);

          // Según las teclas, añadimos o modificamos si son(-, +, *, 3)
          if (c == '-') {
            // inicio
            newIndice = 0;
          } else if (c == '+') {
            // fin
            newIndice = linea.size() - 1;
          } else if (c == '*') {
            // flecha derecha
            if (newIndice <= linea.size() - 1) {
              // Si está antes del final, aumentamos
              newIndice++;
            } else {
              // Si está en la última o mas, la pasamos a la última
              newIndice = linea.size() - 1;
            }
          } else if (c == '3') {
            // Suprimir (no del) Eliminamos derecha. posicion igual
            linea.remove(newIndice);
          } else {
            // Añadimos la letra en la posición a introducir y cambiamos
            // la posición a la siguiente
            linea.add(newIndice, c);
            newIndice++;
          }
        }
        // Recorremos la lista imprimiendo los caracteres
        for (Character character : linea) {
          System.out.print(character);
        }
        // añadimos salto línea
        System.out.println();
      }
    }

    sc.close();
  }
}
