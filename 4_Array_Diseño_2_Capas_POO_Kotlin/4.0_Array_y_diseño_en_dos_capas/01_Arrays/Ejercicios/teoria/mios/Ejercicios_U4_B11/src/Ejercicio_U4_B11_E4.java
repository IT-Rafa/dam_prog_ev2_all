/**
 * Ejercicio U4_B11_E4:<p>
 * Imprime la media del siguiente array
 * <pre>
 * double[] notas = {8.5,7.0,6.0,9.2};
 * </pre>
 */
class Ejercicio_U4_B11_E4 {

  public static void main(String[] args) {
    double[] notas = { 8.5, 7.0, 6.0, 9.2 };
    double suma = 0;
    for (double d : notas) {
      suma += d;
    }
    System.out.println("Media del array: " + suma / notas.length);
  }
}
