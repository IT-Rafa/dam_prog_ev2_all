package U7_B5_E5;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Ejercicio U7_B5_E5:
 * <p>
 * Reto Michael J. Fox y el Pato Donald categoría conjuntos.
 * Utiliza obligatoriamente conjuntos para resolverlo.
 */
public class App {
    /**
     * Pide cantidad cumpleaños
     * Si 0 finaliza
     * Pide los cumpleaños dia/mes/año
     * Si alguno está repetido muestra SÍ, si no, muestra NO
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (!sc.nextLine().startsWith("0")) {
            LinkedHashSet<String> listaCumpleaños = new LinkedHashSet<>();
            boolean repetido = false;
            String cumples = sc.nextLine();
            String[] listaCumple = cumples.split(" ");
            for (String c : listaCumple) {
                String[] cumpleSt = c.split("/");
                Integer[] cumple = new Integer[2];

                cumple[0] = Integer.parseInt(cumpleSt[0]);
                cumple[1] = Integer.parseInt(cumpleSt[1]);

                if (!listaCumpleaños.add(cumple[0] + "/" + cumple[1])) {
                    repetido = true;
                    break;
                }

            }
            if (repetido) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
