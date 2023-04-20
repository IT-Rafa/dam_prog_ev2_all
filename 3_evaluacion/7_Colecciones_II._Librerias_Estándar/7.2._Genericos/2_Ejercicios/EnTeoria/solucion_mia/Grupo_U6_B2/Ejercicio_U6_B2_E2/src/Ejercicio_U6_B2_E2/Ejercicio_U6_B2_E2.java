package Ejercicio_U6_B2_E2;

/**
 * Clase que contiene el main del Ejercicio_U6_B2_E2
 */
public class Ejercicio_U6_B2_E2 {

  /**
   * Según instrucciones (y añadimos imprimir datos)
   * <ul>
   * <li>Modificamos clase Pair<T, V>, añadiendo un constructor
   * <li>Creamos cada objeto Pair, indicando los objetos internos y
   * añadiendo los atributos al construirlos.</li>
   * <li>Imprimimos los datos, con la clase de cada objeto y atributo</li>
   * </ul>
   */
  public static void main(String[] args) {
    // Creamos el par 1º con los datos en contructor
    Pair<Integer, Float> parIntFloat = new Pair<>(
      Integer.valueOf(1),
      Float.valueOf("0.1")
    );

    // Creamos el par 2º con los datos en contructor
    int[] array = { 2, 22 };
    Pair<String, int[]> parStrIntArr = new Pair<>("segundo", array);

    // Creamos el par 3º con los datos en contructor
    Pair<Persona, Persona> parPerPer = new Pair<>(
      new Persona("persona1", 20),
      new Persona("persona2", 30)
    );

    // Mostramos datos de cada par
    System.out.println(
      parIntFloat.getClass().getSimpleName() +
      ":\n\t" +
      parIntFloat.getFirst().getClass().getSimpleName() +
      ": " +
      parIntFloat.getFirst() +
      "\n\t" +
      parIntFloat.getSecond().getClass().getSimpleName() +
      ": " +
      parIntFloat.getSecond()
    );

    System.out.println(
      parStrIntArr.getClass().getSimpleName() +
      ":\n\t" +
      parStrIntArr.getFirst().getClass().getSimpleName() +
      ": " +
      parStrIntArr.getFirst() +
      ":\n\t" +
      parStrIntArr.getSecond().getClass().getSimpleName() +
      ": {" +
      parStrIntArr.getSecond()[0] +
      ", " +
      parStrIntArr.getSecond()[1] +
      "}"
    );

    System.out.println(
      parPerPer.getClass().getSimpleName() +
      ":\n\t" +
      parPerPer.getFirst().getClass().getSimpleName() +
      ": " +
      parPerPer.getFirst().nombre +
      ", " +
      parPerPer.getFirst().edad +
      "\n\t" +
      parPerPer.getSecond().getClass().getSimpleName() +
      ": " +
      parPerPer.getSecond().nombre +
      ", " +
      parPerPer.getSecond().edad
    );
  }
}
