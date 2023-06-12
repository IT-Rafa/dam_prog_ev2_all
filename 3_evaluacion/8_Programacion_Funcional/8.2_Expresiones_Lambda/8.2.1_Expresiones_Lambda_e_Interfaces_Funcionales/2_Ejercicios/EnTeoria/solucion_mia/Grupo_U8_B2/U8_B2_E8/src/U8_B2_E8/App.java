package U8_B2_E8;

import java.util.function.Predicate;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E8<p>
 * Creamos clases que hereden de Predicate<Integer> sobreescribiendo
 * el método test para cada caso
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E8<p>
   * Creamos lista elementos y evaluamos la lista con
   * los Predicados.
   */
  public static void main(String[] args) {
    // lista números decimales
    int[] lista = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    System.out.println("Imprimir todos los números:");
    eval(lista, new PredicateAll());

    System.out.println("Imprimir números pares:");
    eval(lista, new PredicatePares());

    System.out.println("Imprimir numeros mayores que 3:");
    eval(lista, new PredicateSup3());
  }

  /**
   * Recibe una array de int y un Predicate para Integer<p>
   * Pasa por cada elemento del array y lo analiza con el
   * Predicate. Si la valoración es True, muesta el contenido en
   * consola.
   *
   * @param list Array de enteros a analizar
   * @param predicate Predicado que almacena un lambda, que recibe un
   * Integer y devuelve un boolean. Se ejecuta con su método test
   */
  public static void eval(int[] list, Predicate<Integer> predicate) {
    for (int n : list) {
      if (predicate.test(n)) {
        System.out.println(n + " ");
      }
    }
  }
}

/**
 * Usa interface Predicate<Integer>
 */
class PredicateAll implements Predicate<Integer> {

  /**
   * Método sobreescrito que recibe un entero y devuelve True si
   * en cualquier caso
   *
   * @param n Entero a analizar
   * @return Siempre True
   */
  @Override
  public boolean test(Integer n) {
    return true;
  }
}

/**
 * Usa interface Predicate<Integer>
 */
class PredicatePares implements Predicate<Integer> {

  /**
   * Método sobreescrito que recibe un entero y devuelve True si
   * el entero es par; False en caso contrario
   *
   * @param n Entero a analizar
   * @return True si el entero es par; False en caso contrario
   */
  @Override
  public boolean test(Integer n) {
    return (n % 2 == 0);
  }
}

/**
 * Usa interface Predicate<Integer>
 */
class PredicateSup3 implements Predicate<Integer> {

  /**
   * Método sobreescrito que recibe un entero y devuelve True si
   * el entero es mayor que 3; False en caso contrario
   *
   * @param n Entero a analizar
   * @return True si el entero es mayor que 3;
   * False en caso contrario
   */
  @Override
  public boolean test(Integer n) {
    return n > 3;
  }
}
