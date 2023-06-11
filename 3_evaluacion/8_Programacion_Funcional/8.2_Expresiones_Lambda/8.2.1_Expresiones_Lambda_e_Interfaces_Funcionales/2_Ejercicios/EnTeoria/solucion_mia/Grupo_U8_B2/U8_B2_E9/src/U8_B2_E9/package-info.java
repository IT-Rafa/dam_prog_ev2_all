/**
 * package con clases para Ejercicio U8_B2_E9:
 * <p>
 * Haz un ejemplo similar al anterior con
 * <p>
 * String[] listaPalabras={"hola","adios","zorros","pimiento"};
 * <p>
 * Y con ejecución:
 * <pre>
run:
Imprimir palabras con más de 5 caracteres:
zorros
pimiento
Imprimir palabras menores que chorizo
adios
BUILD SUCCESSFUL (total time: 0 seconds)
 * </pre>
 * 
 * <h4>Ejemplo anterior</h4>
 * <pre>
import java.util.function.Predicate;
public class App{
    public static void main(String args[]){
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Imprimir todos los números:");
        Predicate<Integer> predicado = n -> true;
        eval(lista, predicado);
        System.out.println("Imprimir números pares:");
        eval(lista, n-> n%2 == 0 );
        System.out.println("Imprimir numeros mayores que 3:");
        eval(lista, n-> n > 3 );
    }

    public static void eval(int[] list, Predicate<Integer> predicate) {
        for(int n: list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
 * </pre>
 */
package U8_B2_E9;
