package U8_B4_E1;

import java.util.function.Consumer;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
   */
  public static void main(String[] args) {
    // Usamos Consumer porque espera un operador y no devuelve nada
    // En este caso coincide con println, que espera un String y no
    // devuelve nada, con lo que usamos usamos la versión para
    // String, y usamos la expresión lambda con :: para sobreescribir
    // su único método accept(T objeto)
    // ( T será un String indicado por el genérico )
    Consumer<String> saludo = System.out::println;

    // Ejecutamos el accept de consumer con el String indicado
    saludo.accept("Hola mundo ");
  }
}
