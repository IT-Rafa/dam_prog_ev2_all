package U7_B5_E4;

import java.util.Set;
import java.util.TreeSet;

/**
 * Clase que contiene las clases para ejecutar el
 * Ejercicio_U7_B5_E4
 */
public class App {

  /**
   * Usamos métodos para poner los conjuntos con los valores originales
   * <p>
   * Mostramos los conjuntos originales
   * <p>
   * Para cada operación
   * <p>
   * <ul>
   * <li>Hacemos la operación y mostramos resultado con la variable
   * que lo llamo, A</li>
   * <li>Como la variable cambió, la volvemos a dejar como estaba,
   * con el método inicial</li>
   * </ul>
   */
  public static void main(String[] args) {
    Set<Integer> elementosA = Set.of(5, 7, 9, 19);
    Set<Integer> elementosB = Set.of(5, 7, 10, 20);

    System.out.println("A:" + elementosA);
    System.out.println("B:" + elementosB);

    Set<Integer> operacion = new TreeSet<>(elementosA);
    operacion.addAll(elementosB);
    System.out.println("A union B:" + operacion);

    operacion = new TreeSet<>(elementosA);
    operacion.removeAll(elementosB);
    System.out.println("A diferencia B:" + operacion);

    operacion = new TreeSet<>(elementosA);
    operacion.retainAll(elementosB);
    System.out.println("A intersección B:" + operacion);
  }
}
