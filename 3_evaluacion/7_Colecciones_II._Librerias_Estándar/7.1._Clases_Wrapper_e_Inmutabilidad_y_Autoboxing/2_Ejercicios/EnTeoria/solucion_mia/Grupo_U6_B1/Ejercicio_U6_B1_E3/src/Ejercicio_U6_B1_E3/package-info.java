/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U6_B1_E3:</h3><p>
 * Observa el siguiente código, ojo que no usa parseDouble como el de arriba:
 * <pre>
class App {
    public static void main(String[] args) {
        String s="1234.5678";
        double d;
        d=Double.valueOf(s).doubleValue();
        System.out.println("d con Double.valueOf(s).doubleValue(): "+ d);
        d=Double.valueOf(s);
        System.out.println("d con Double.valueOf(s): "+ d);
    }
}
 * </pre> 
 * ¿Por qué producen el mismo resultado las instrucciones?
 * <pre>
d=Double.valueOf(s).doubleValue();
d=Double.valueOf(s);
 * </pre>  
 */
package Ejercicio_U6_B1_E3;
