/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U6_B1_E2:</h3><p>
 * Observa el siguiente ejemplo y consultando en el API la 
 * clase Double, explica la diferencia entre valueOf y parseDouble.
 * <pre>
class App {
    public static void main(String[] args) {
        String s="1234.5678";
        double d;
        d=Double.valueOf(s).doubleValue();
        System.out.println("d con valueOf: "+ d);
        d=Double.parseDouble(s);
        System.out.println("d con parseDouble: "+ d);
    }
}
 * </pre>
 */
package Ejercicio_U6_B1_E2;
