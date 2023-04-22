package Ejercicio_U7_B4_1;

import java.util.ArrayList;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_1
 */
public class Ejercicio_U7_B4_1 {

  /**
   *
   */
  public static void main(String[] args) {
    // Declaración y creación del LinkedList de enteros.
    ArrayList<Integer> ll = new ArrayList<>();

    // Añade un elemento al final de la lista.
    ll.add(1);

    // Añade otro elemento al final de la lista.
    ll.add(3);
    System.out.println("Después de añadir 1 y 3:" + ll);

    // Añade en la posición 1 el elemento 2.
    ll.add(1, 2);
    System.out.println(
      "Después de añadir en la posición 1 el elemento 2:" + ll
    );

    // Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.
    ll.add(ll.get(1) + ll.get(2));
    System.out.println(
      "Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.:" +
      ll
    );

    // Elimina el primer elemento de la lista.
    ll.remove(0);
    System.out.println(
      "Eliminado el primer elemento de la lista anterior:" + ll
    );
  }
}
