package U8_B2_E9;

import java.util.function.Predicate;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E9<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E9<p>
   */
  public static void main(String[] args) {
    // lista palabras
    String[] listaPalabras = { "hola", "adios", "zorros", "pimiento" };

    System.out.println("Imprimir palabras con más de 5 caracteres: ");
    eval(listaPalabras, st -> st.length() > 5);

    System.out.println("Imprimir palabras menores que chorizo: ");
    eval(listaPalabras, st -> st.compareTo("chorizo") < 0);
  }

  /**
   * Recibe una array de int y un Predicate para Integer<p>
   * Pasa por cada elemento del array y lo analiza con el
   * Predicate. Si la valoración es True, muesta el contenido en
   * consola.
   *
   * @param list Array de String a analizar
   * @param predicate Predicado que almacena un lambda, que recibe un
   * String y devuelve un boolean. Se ejecuta con su método test
   */
  public static void eval(String[] list, Predicate<String> predicate) {
    for (String st : list) {
      if (predicate.test(st)) {
        System.out.println(st + " ");
      }
    }
  }
}
