package Ejercicio_U6_2C_E7;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U6_2C_E7
 */
public class Ejercicio_U6_2C_E7 {

  /**
   * Según instrucciones:
   * <ul>
   *    <li>Pedimos usuario cantidad Árboles a pedir</li>
   *    <li>Por cantidad pedida:
   *        <ul>
   *            <li>Pedimos descripción de un árbol binario
   *                <ul>
   *                    <li>El árbol vacío se representa con un punto (.)</li>
   *                    <li>Un árbol no vacío se representa con un * (que denota la raíz),
   *                                seguido primero de la descripción del hijo izquierdo y después de la descripción del hijo derecho.</li>
   *                    <li>Los árboles nunca contendrán más de 5.000 nodos.</li>
   *                </ul>
   *            </li>
   *            <li>Para cada árbol, se escribirá una línea con su altura. </li>
   *        </ul>
   *    </li>
   *    
   * </ul>
   *
   * Ejemplo Entrada:
   * <pre>
2
***..*..*..
**..**..**..*..
   * </pre>
   * Salida del ejemplo:
   * <pre>
3
4
   * </pre>
   */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int cant;

    // Pedimos cantidad Árboles a introducir
    while (true) {
      try {
        while (!sc.hasNext()) sc.next();
        cant = Integer.parseInt(sc.nextLine());
        if (cant > 0) {
          break;
        } else {
          System.out.println("Cantidad menor que 1; Repite entrada");
        }
      } catch (NumberFormatException e) {
        System.out.println("Entrada no válida; Repite entrada");
      }
    }

    // Repetimos por cantidad
    for (int i = 0; i < cant; i++) {
      // Pedimos descripción del árbol
      String input = sc.nextLine();
      // Dividimos string en array
      char[] desc = input.toCharArray();
      // Usamos descripción para crear árbol
      Arbol arbol = new Arbol(desc);
      System.out.println(arbol.getHeight());
    }

    sc.close();
  }
}
