/**
 * package con clases para ejercicio: <p>
 * <h3>Ejercicio U8_B2_E2</h3>
 * Escribir el ejemplo anterior sin expresión λ , es decir, 
 * implementando el interface IntPredicate con una clase 
 * escrita por nosotros.
 * <h4>Ejemplo anterior</h4>
 * <pre>
import java.util.function.IntPredicate;

public class App{
    public static void main(String[] args){
        int[] lista = {1,2,3,4,5,6,7,8,9};
        System.out.println("Imprimir números int pares:");
        IntPredicate predicate=n-> n%2==0;
        eval(lista, predicate);
        //eval(lista, n-> n%2 == 0 );
    }
    public static void eval(int[] list, IntPredicate predicate) {
        for(int n: list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
 * </pre>
 */
package U8_B2_E2;
