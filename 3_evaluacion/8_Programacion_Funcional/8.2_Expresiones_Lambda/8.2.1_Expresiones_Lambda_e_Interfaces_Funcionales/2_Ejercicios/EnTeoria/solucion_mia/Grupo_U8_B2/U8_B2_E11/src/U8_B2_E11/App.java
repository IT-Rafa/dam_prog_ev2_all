package U8_B2_E11;

/**
 * Interface BiFunction<T,U,R>
 *  T - first argument type
 *  U - second argument  type
 *  R - result type
 */
import java.util.function.BiFunction;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E11<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E11<p>
   */
  public static void main(String[] args) {
    // Creamos predicado o interfaz funcional con dos entradas
    // (Double, Integer) y una salida (Double)
    // y le añadimos el lambda para elevar el primer argumento
    // con el segundo
    BiFunction<Double, Integer, Double> xElevadoY = (x, y) -> Math.pow(x, y);

    // Pasamos primer argumento como double y se convierte con
    // autoboxing
    System.out.println(xElevadoY.apply(5.0, 2));

    // Pasamos primer argumento como int y da error
    // (la conversión de primitivos, como int a double
    // es válida, pero a Double no)
    // System.out.println(xElevadoY.apply(2,2));

    // Pasamos primer argumento como String
    System.out.println(xElevadoY.apply(Double.parseDouble("5"), 2));
  }
}
