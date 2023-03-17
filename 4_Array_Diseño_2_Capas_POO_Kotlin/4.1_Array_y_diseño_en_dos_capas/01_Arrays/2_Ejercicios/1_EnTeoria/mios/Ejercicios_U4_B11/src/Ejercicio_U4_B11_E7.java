/**
 * Ejercicio U4_B11_E7<p>
 * Añade código al ejemplo anterior 
 * <pre>
int[] a = {0,2,4,6,8};
int[] b = {1,3,5,7,9};
 * </pre>
 * de forma que demuestre que si añado
 * <pre>
int[] c;
c=a;
a=b;
 * </pre>
 * la situación pasa a ser <code>c</code> apunta al primer array y 
 * <code>a</code> y <code>b</code> apuntan al segundo
 * <p>
 * Para demostrarlo imprime los Arrays a los que referencian <code>a</code>,
 *  <code>b</code> y <code>c</code>.
 */
public class Ejercicio_U4_B11_E7 {

  public static void main(String[] args) {
    int[] a = { 0, 2, 4, 6, 8 };
    int[] b = { 1, 3, 5, 7, 9 };
    int[] c;
    System.out.println(
      "Creamos var a, y asignamos dirección del nuevo array { 0, 2, 4, 6, 8 }"
    );
    System.out.println(
      "Creamos var b, y asignamos dirección del nuevo array { 1, 3, 5, 7, 9 }"
    );
    System.out.println("Creamos var c, sin asignarle nada");
    System.out.println("Mostramos direcciones de cada variable");
    System.out.println("a = " + System.identityHashCode(a));
    System.out.println("b = " + System.identityHashCode(b));
    System.out.println("c = null (No se puede mostrar, ya que compilador sabe que está vacia)");

    System.out.println("Copiamos la dirección guardada en 'a' a la variable 'b'");
    c = a;
    System.out.println("c = " + System.identityHashCode(c));
    System.out.println("Copiamos la dirección guardada en 'b' a la variable 'a'");
    a = b;
    System.out.println("Mostramos direcciones de cada variable");
    System.out.println("a = " + System.identityHashCode(a));
    System.out.println("b = " + System.identityHashCode(b));
    System.out.println("c = " + System.identityHashCode(c));
  }
}
