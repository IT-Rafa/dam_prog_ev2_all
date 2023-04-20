package Ejercicio_U6_B2_E1;

/**
 * Clase que contiene el main del Ejercicio_U6_B1_E1
 */
public class Ejercicio_U6_B2_E1 {

  /**
   * Según instrucciones (y añadimos imprimir datos)
   * <ul>
   * <li>Creamos cada objeto Pair, indicando los objetos internos.</li>
   * <li>Usamos setFirst y setSecond para añadir los artículos.</li>
   * <li>Imprimimos los datos, con la clase de cada objeto y atributo</li>
   * </ul>
   */
  public static void main(String[] args) {
    // Creamos los pares indicados
    Pair<Integer, Float> parIntFloat = new Pair<>();
    Pair<String, int[]> parStrIntArr = new Pair<>();
    Pair<Persona, Persona> parPerPer = new Pair<>();

    // Añadimos datos al primer par
    parIntFloat.setFirst(Integer.valueOf(1));
    parIntFloat.setSecond(Float.valueOf("0.1"));

    // Añadimos datos al segundo par
    parStrIntArr.setFirst("segundo");
    int[] array = { 2, 22 };
    parStrIntArr.setSecond(array);

    // Añadimos datos al tercer par
    parPerPer.setFirst(new Persona("persona1", 20));
    parPerPer.setSecond(new Persona("persona2", 30));

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
