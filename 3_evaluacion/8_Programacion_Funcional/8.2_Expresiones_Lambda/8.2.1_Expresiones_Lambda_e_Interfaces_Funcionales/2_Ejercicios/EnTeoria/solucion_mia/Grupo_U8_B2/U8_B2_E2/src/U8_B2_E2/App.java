package U8_B2_E2;

import java.util.function.IntPredicate;

public class App {

  public static void main(String[] args) {
    int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Imprimir números int pares:");
    // Creamos la el predicado al llamar a la función
    // Debe coincidir con el prototipo de IntPredicate,
    // que es recibir un entero y devolver un boolean.
    // Concretamente, devuelve True si el valor entre 2 da 0
    // y false en el resto
    eval(lista, n -> n % 2 == 0);
  }

  /**
   * Método que recibe una lista para evaluar y el predicado
   * que usa su método .test para analizar cada elemento de la lista
   */
  public static void eval(int[] list, IntPredicate predicate) {
    // Recorre los enteros de la lista
    for (int n : list) {
      // analiza n con el lambda añadido: n -> n % 2 == 0
      if (predicate.test(n)) {
        // Muestra el resultado si da True
        System.out.println(n + " ");
      }
    }
  }
}
