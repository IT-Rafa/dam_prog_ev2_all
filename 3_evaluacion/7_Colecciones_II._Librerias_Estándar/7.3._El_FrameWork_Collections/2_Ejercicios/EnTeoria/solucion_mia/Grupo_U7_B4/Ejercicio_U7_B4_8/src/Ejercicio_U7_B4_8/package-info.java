/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U7_B4_8:</h3><p>
 * se escribió una cola “casera” MiCola para resolver el siguiente 
 * main().
 * <pre>
class App{
    public static void main(String[] args) {
        MiCola<Integer> mc1 = new MiCola<>();
        mc1.encolar(1);

        mc1.encolar(2);
        mc1.encolar(3);
        while (!mc1.esVacia()) {
            System.out.print(mc1.desencolar()+ " ");
        }
    }
}
 * </pre>
 * SE PIDE: Escribir el main con LinkedList sin escribir ninguna 
 * clase (resolver directamente en main
 */
package Ejercicio_U7_B4_8;
