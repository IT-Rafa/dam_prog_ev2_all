package Ejercicio_U7_B4_9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_9
 */
public class Ejercicio_U7_B4_9 {

  /**
   * Añadimos enunciado.<p>
   * Cambiamos LinkedList<T> por Queue<T>, usando operadores de cola(queue)
   */
  public static void main(String[] args) {
    Queue<Integer> cola = new LinkedList<>();
    // en  offer(T) es igual a addLast()
    cola.offer(1);
    cola.offer(2);
    cola.offer(3);

    while (!cola.isEmpty()) {
      // poll() es equivalente a removeFirst()
      System.out.print(cola.poll() + " ");
    }
    System.out.println();
  }
}
