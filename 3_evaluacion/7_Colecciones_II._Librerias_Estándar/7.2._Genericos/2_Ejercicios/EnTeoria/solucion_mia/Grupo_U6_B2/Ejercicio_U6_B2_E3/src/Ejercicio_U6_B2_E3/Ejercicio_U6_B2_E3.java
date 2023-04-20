package Ejercicio_U6_B2_E3;

/**
 * Clase que contiene el main del Ejercicio_U6_B2_E3
 */
public class Ejercicio_U6_B2_E3 {

  /**
   * Antes sobreescribimos toString en clase Persona,
   * para que los datos se muestren al imprimir.<p>
   *
   * Posteriormente creamos los arrays, los rellenamos y usamos el método
   * con cada array
   */
  public static void main(String[] args) {
    int max = 5;
    // array de Integer
    Integer[] integerArray = new Integer[max];
    for (int i = 0; i < integerArray.length; i++) {
      integerArray[i] = Integer.valueOf(i);
    }

    // array de Double
    Double[] doubleArray = new Double[max];
    for (int i = 0; i < doubleArray.length; i++) {
      doubleArray[i] = Double.valueOf(i);
    }
    // array de personas
    Persona[] PersonasArray = new Persona[max];
    for (int i = 0; i < PersonasArray.length; i++) {
      PersonasArray[i] = new Persona("Persona_" + i, 15 + i);
    }

    // Imprimimos los arrays
    Util.imprimirArray(integerArray);
    Util.imprimirArray(doubleArray);
    Util.imprimirArray(PersonasArray);
  }
}
