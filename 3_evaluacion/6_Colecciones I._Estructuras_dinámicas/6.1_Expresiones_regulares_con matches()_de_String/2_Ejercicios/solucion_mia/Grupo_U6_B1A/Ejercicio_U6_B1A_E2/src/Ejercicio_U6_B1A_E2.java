/**
 * Ejercicio U6_B1A_E2:<p>
 * Valida strings que contienen DNIs usando una expresión regular que
 * de por bueno el siguiente formato: de 1 a 8 dígitos seguidos por 
 * una letra mayúscula o minúscula.
 * Prueba la ER con:
 * <pre>
public class App {
    public static void main(String[] args) {
        String er=ESCRIBE AQUÍ TU EXPRESIÓN REGULAR
        String[] dnis = {"1a","a1","12345678A", "123456789A", "123456789", "0000001R", "00000001R", "", "123abv11a"};
        for (String dni : dnis) {
            System.out.println(dni+ " es "+ dni.matches(er));
        }
    }
}
 * </pre>

 */
public class Ejercicio_U6_B1A_E2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
