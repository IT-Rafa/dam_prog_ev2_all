/**
 * package con clases para
 * <h3>Ejercicio U8_B7_E1:</h3>
 * Indicamos en otro boletín que una lambda puede tener 
 * un cuerpo complejo pero “no es habitual” en la 
 * programación funcional. 
 * <p> 
 * Concretamente indicamos que es raro ver un cuerpo de 
 * una lambda con un if y mucho más con un while. 
 * <p>
 * El if se puede evitar si trabajamos con streams 
 * añadiendo una operación filter(). 
 * <p>
 * Escribe el siguiente ejemplo utilizando un Stream.
 * <h4>Ejemplo:</h4>
 * <pre>
import java.util.ArrayList;
import java.util.List;
class App{
    public static void main(String[] args){
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        items.forEach(item -> {
        if (item.compareTo("B") > 0) System.out.println(item);
        });
    }
}
 * </pre>
 */
package U8_B7_E1;
