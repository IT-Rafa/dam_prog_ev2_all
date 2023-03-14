/**
 * Ejercicio U4_B11_E5:<p>
 * Utilizando los operadores lógicos, imprime las tablas de verdad
 * de <code>a</code> and <code>b</code>, <code>a</code> or <code>b</code>,
 * <code>a</code> exor <code>b</code> y <code>a</code> nand <code>b</code>.<p>
 *
 * Las operaciones anteriores tienen su correspondiente operador
 * java excepto nand que la implementamos manualmente como not and. <p>
 * Los valores de a y b deben de estar almacenados obligatoriamente
 * para este ejercicio en arrays de tipo boolean con el siguiente aspecto.
 * <pre>
a
  false    false    true    true
b
  false    true     false   true
 * </pre>
 * Y la salida será (es suficiente con el and y el or):
 * <pre>
L:\Programacion>java Unidad3
A       B       AorB    AandB    AexorB   AnandB
false   false   false   false    false    true
false   true    true    false    true     true
true    false   true    false    true     true
true    true    true    true     false    false
 * </pre>
 *
 */
public class Ejercicio_U4_B11_E5 {

  public static void main(String[] args) {
    boolean[] a = { false, false, true, true };
    boolean[] b = { false, true, false, true };
    System.out.println(" A      B      AorB   AandB  AxorB  AnandB");
    for (int i = 0; i < a.length; i++) {
      System.out.println(
        String.format(
          " %-5b  %-5b  %-5b  %-5b  %-5b  %-5b",
          a[i],
          b[i],
          (a[i] | b[i]),
          (a[i] & b[i]),
          (a[i] ^ b[i]),
          (a[i] ? !b[i] : true)
        )
      );
    }
  }
}
