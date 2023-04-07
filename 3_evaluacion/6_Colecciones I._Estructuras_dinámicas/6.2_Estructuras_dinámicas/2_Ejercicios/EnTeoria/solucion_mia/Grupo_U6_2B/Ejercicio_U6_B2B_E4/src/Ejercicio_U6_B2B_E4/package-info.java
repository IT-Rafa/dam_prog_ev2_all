
/**
 * Ejercicio U6_B2B_E4: <p>
 * Implementa el interface Cola en la clase MiCola<p>
 * Observa que ahora la cola maneja dos referencias: primero y último. 
 * Por definición de cola, principio se refiere al extremo por donde 
 * salen y final por donde entran.
 * <pre>
interface Cola {
    //inserta un elemento al final de la cola
    void encolar(int dato);

    //saca el primer elemento de la cola
    //el primer elemento es el más antiguo
    int desencolar();

    public boolean esVacia();
}

class MiCola implements Cola{
    Nodo primero=null;
    Nodo ultimo=null;
    etc...
}
 * </pre>
 * Pruébala con el siguiente main()<p>
 * <pre>
class App {
    public static void main(String[] args) {
        MiCola mc = new MiCola();
        mc.encolar(1);
        mc.encolar(2);
        mc.encolar(3);
        while (!mc.esVacia()) {
            System.out.println(mc.desencolar());
        }
    }
}
run:
1
2
3
 * </pre>
 */
package Ejercicio_U6_B2B_E4;
