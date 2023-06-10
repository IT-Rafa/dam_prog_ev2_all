/**
 * package con clases para Ejercicio U8_B2_E7: <p>
 * Escribe el siguiente ejemplo sin expresiones lambda.
 * consulta en el API el método default or()
 * <h4>Ejemplo</h4>
 * <pre>
import java.util.function.IntPredicate;
class App{
    public static void main(String[] args) {
        IntPredicate a = x-> x < 0;
        IntPredicate b = x-> x%2== 0;

        System.out.println(a.or(b).test(4));
    }
}
 * </pre>
 */
package U8_B2_E7;
