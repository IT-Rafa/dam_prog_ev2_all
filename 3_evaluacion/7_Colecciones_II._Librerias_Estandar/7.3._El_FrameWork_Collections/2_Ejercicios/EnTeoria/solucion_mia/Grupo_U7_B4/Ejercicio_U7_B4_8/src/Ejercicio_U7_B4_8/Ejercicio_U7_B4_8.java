package Ejercicio_U7_B4_8;

import java.util.LinkedList;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_8
 */
public class Ejercicio_U7_B4_8 {

  /**
   * Añadimos enunciado.<p>
   * Cambiamos MiCola<T> por LinkedList<T>, usando operadores de cola(queue)
   */
  public static void main(String[] args) {
    LinkedList<Integer> mc1 = new LinkedList<>();
    // en LinkedList add() y addLast() son iguales
    mc1.add(1);
    mc1.add(2);
    mc1.add(3);

    while (!mc1.isEmpty()) {
      // en LinkedList remove() y removeFirst() son iguales
      System.out.print(mc1.remove() + " ");
    }
    System.out.println();
  }
}
