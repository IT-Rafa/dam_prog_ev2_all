package U7_B6B_E2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Ejercicio U7_B6B_E2:
 * <p>
 * Deseo ordenar una lista de teléfonos de la siguiente forma;
 * <p>
 * Primero aparecerán ordenados de mayor a menor los números internacionales
 * (con símbolo "+" delante) y después los locales, también ordenados de mayor
 * a menor.
 * <p>
 * SE PIDE: Escribe el comparador. Hay que tener en cuenta dos cosas:
 * <ul>
 * <li>El + es tiene código unicode menor que los dígitos, por lo tanto, para
 * listar primero números con + y ser de mayor o menor no basta con la
 * comparación
 * directa de Strings</li>
 * <li>¿Cómo interpretamos que string numérico es mayor que otro?.
 * Recuerda que la comparación de String, independientemente de que los
 * caracteres sean dígitos o no digitos se hace por “orden alfabético estilo
 * diccionario” , o mejor dicho, “por orden de código de caracteres”.
 * De tal forma que por ejemplo:
 * <p>
 * Pensando en enteros 111 > 12 es true, pero Pensando en Strings “111” > “12”
 * es false ya que la “palabra” “111” iría antes en un diccionario que
 * “12”.</li>
 * </ul>
 */
public class App {

    /**
     * Añadimos el comparador de Strings a Collections.sort
     * <p>
     * Montamos el comparador.
     */
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("981555555");
        telefonos.add("+34981565656");
        telefonos.add("666666666");
        telefonos.add("+34666666666");

        Collections.sort(telefonos, new ComparadorTelefonos());
        for (String tlf : telefonos) {
            System.out.println(tlf + " ");
        }
    }

}

class ComparadorTelefonos implements Comparator<String> {

    @Override
    public int compare(String st1, String st2) {
        //
        st1 = st1.trim();
        st2 = st2.trim();
        // Comprobamos si son iguales o si uno comienza con + y el otro no
        if (st1.equals(st2)) {
            return 0;
        } else if (st1.startsWith("+")) {
            if (st2.startsWith("+")) {
                // Ambos empiezan con +; Comparar números
            } else {
                return -1;
            }
        } else {
            if (st2.startsWith("+")) {
                return 1;
            } else {
                // Ambos no empiezan con +; Comparar números
            }
        }

        // Ambos tienen, o ambos no tienen el +; + no es relevante en números
        Long n1 = Long.parseLong(st1);
        Long n2 = Long.parseLong(st2);
        if (n1 < n2) {
            return 1;
        } else if (n1 > n2) {
            return -1;
        } else {
            return 0;
        }

    }

}
