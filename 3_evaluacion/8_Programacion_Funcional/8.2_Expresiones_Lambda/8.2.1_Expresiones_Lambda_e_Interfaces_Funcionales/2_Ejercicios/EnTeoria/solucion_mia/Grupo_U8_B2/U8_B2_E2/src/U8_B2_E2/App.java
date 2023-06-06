package U8_B2_E2;

import java.util.function.IntPredicate;

public class App {

  public static void main(String[] args) {
    int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Imprimir números int pares:");
    eval(lista, n -> n % 2 == 0);
  }

  public static void eval(int[] list, IntPredicate predicate) {
    for (int n : list) {
      if (predicate.test(n)) {
        System.out.println(n + " ");
      }
    }
  }
}
