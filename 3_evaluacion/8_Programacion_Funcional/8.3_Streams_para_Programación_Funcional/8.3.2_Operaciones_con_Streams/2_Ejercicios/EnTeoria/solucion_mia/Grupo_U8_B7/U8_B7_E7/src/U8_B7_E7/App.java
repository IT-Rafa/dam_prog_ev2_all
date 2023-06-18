package U8_B7_E7;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
=======
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;
>>>>>>> 9f3a80d (U8_B7_E7)

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

<<<<<<< HEAD
    Stream
      .generate(sc::nextInt)
      .takeWhile(n -> n > 0)
      .forEach(System.out::println);

    sc.close();
=======
    StreamSupport
      .stream(it.spliterator(), false)
      .map(String::trim)
      .mapToInt(st -> Integer.parseInt(st))
      .forEach(n -> {
        if (n != 0) {
          IntStream.range(0, n).forEach(i -> System.out.print(1));
        } else {
          System.exit(0);
        }
      });
>>>>>>> 9f3a80d (U8_B7_E7)
  }
}
