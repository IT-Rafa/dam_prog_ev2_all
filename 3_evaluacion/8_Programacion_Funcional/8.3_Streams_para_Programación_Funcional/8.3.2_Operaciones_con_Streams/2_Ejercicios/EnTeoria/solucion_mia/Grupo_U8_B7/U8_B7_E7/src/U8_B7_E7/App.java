package U8_B7_E7;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Clase con ejecutable de Ejercicio U8_B7_E7
 * <p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B7_E7<p>
   * Resumen enunciado PDF
   * <p>
   * Introducir 1 número (positivo y menor de 1000) ¡
   * Si el número es 0, finaliza programa
   * El resto mostrará su valor en base 1 (un 1 por la cantidad: 1=1; 5=11111)
   * La entrada estará compuesta por distintos números mayores que 0 y
   * que nunca serán mayores que 1.000,
   *
   * <p>
   * Prohibido usar if ni bucle
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Stream
      .generate(sc::nextInt)
      .takeWhile(n -> n > 0)
      .map(n -> convertToBin(n))
      .forEach(System.out::println);
    sc.close();
  }

  /**
   * @param n
   * @return
   */
  static StringBuilder convertToBin(int n) {
    final StringBuilder result = new StringBuilder("");
    IntStream.range(0, n).forEach(i -> result.append("1"));
    return result;
  }
}
