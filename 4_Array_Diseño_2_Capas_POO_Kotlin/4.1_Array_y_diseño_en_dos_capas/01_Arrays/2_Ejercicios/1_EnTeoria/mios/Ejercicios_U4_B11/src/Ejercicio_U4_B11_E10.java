/**
 * Ejercicio U4_B11_E10<p>
 * Con las dos sintaxis anteriores, 
 * <pre>
for(int i=0; i < x.lengh; i++){ // x[i] es el valor (sí cambias valor del array)}
for (int i:x){// i es el valor (no cambias array)}
 * </pre>
 * imprime por pantalla el siguiente array.
 * <pre>
char[] vocales = {'a', 'e','i','o','u'};
 * </pre>
 */
public class Ejercicio_U4_B11_E10 {

  public static void main(String[] args) {
    char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
    for (int i = 0; i < vocales.length; i++) {
      System.out.print(vocales[i]);
    }
    System.out.println();

    for (char c : vocales) {
      System.out.print(c);
    }
    System.out.println();
  }
}
