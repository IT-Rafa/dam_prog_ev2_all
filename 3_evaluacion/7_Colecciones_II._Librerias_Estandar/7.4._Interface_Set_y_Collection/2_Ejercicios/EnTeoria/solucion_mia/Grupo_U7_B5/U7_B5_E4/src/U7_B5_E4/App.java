package U7_B5_E4;

import java.util.TreeSet;

/**
 * Ejercicio U7_B5_E4:<p>
 * Quizá las operaciones matemáticas más típicas de conjuntos son: <p>
 * union, diferencia e intersección. <p>
 * Haz un programa que prueba con los datos de los conjuntos A y B las 
 * tres operaciones indicadas. <p>
 * El resultado del programa debe ser el siguiente. <p>
 * Union = Juntar ambos grupos<p>
 * Diferencia = Eliminar de un grupo los elementos que están en el otro<p>
 * Intersección = Quedarse solo con los elementos que también tiene el otro grupo<p>
<pre>
run:
A:[5, 7, 9, 19]
B:[5, 7, 10, 20]
A union B: [5, 7, 9, 10, 19, 20]
A diferencia B: [9, 19]
A intersección B: [5, 7]
</pre>
 * Consulta el API para saber los métodos que debes usar para hacer las 
 * operaciones deseadas. Usa TreeSet ya que al ver los elementos ordenados 
 * es más fácil comprobar que las operaciones son OK.
 */
public class App {

  /**
   * Usamos métodos para poner los conjuntos con los valores originales<p>
   * Mostramos los conjuntos originales<p>
   * Para cada operación<p>
   * <ul>
   *    <li> Hacemos la operación y mostramos resultado con la variable
   *        que lo llamo, A</li>
   *    <li> Como la variable cambió, la volvemos a dejar como estaba,
   *        con el método inicial</li>
   * </ul>
   */
  public static void main(String[] args) {
    TreeSet<Integer> elementosA = restore_A();
    TreeSet<Integer> elementosB = restore_B();

    System.out.println("A:" + elementosA);
    System.out.println("B:" + elementosB);

    elementosA.addAll(elementosB);
    System.out.println("A union B:" + elementosA);
    elementosA = restore_A();

    elementosA.removeAll(elementosB);
    System.out.println("A diferencia B:" + elementosA);
    elementosA = restore_A();

    elementosA.retainAll(elementosB);
    System.out.println("A intersección B:" + elementosA);
  }

  private static TreeSet<Integer> restore_A() {
    TreeSet<Integer> result = new TreeSet<>();
    result.add(5);
    result.add(7);
    result.add(9);
    result.add(19);
    return result;
  }

  private static TreeSet<Integer> restore_B() {
    TreeSet<Integer> result = new TreeSet<>();
    result.add(5);
    result.add(7);
    result.add(10);
    result.add(20);
    return result;
  }
}
