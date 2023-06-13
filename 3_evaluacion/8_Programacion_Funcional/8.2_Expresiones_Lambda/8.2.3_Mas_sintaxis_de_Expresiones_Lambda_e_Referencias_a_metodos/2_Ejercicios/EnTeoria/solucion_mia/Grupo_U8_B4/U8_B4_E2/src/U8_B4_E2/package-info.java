/**
 * package con clases para
 * <h3>Ejercicio U8_B4_E2:</h3>
 * Añade al siguiente ejemplo un “imprimir3” de forma que la
 * forma de implementar el interfaz funcional sea con el operador ::
 * <pre>
import java.util.function.Function;

public class App{
    public static void main(String[] args){
        imprimir(
            new Function<String, String>(){
            @Override
            public String apply(String s){
                return s.toLowerCase();
            }
        }, "imprimir1:STRING TO LOWERCASE");
        imprimir(s -> s.toLowerCase(), "imprimir2: STRING TO LOWERCASE");
        //añadir impresion con tipo::
    }
    public static void imprimir(Function<String, String> function, String s){
        System.out.println(function.apply(s));
    }
}
 * </pre>
 */
package U8_B4_E2;
