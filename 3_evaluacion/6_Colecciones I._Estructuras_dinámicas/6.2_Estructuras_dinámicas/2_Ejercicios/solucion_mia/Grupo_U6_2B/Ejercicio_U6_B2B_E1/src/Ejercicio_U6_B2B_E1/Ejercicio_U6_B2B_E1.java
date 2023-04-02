package Ejercicio_U6_B2B_E1;
/**
 * Ejercicio U6_B2B_E1:<p>
 * Implementa el siguiente interface Pila en una clase MiPila. 
 * Para solucionar el problema reutiliza la clase Nodo de la Lista enlazada
 * <pre>
interface Pila{
    //inserta un elemento en la cabeza de la pila
    void push(int dato);
    //saca un elemento de la cabeza de la pila.
    int pop();
    public boolean esVacia() ;
}
 * </pre>
 * Recuerda la clase Nodo
 * <pre>
class Nodo {
    private Nodo sig;
    private int dato;

    public Nodo(int dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }
    public void setSiguiente(Nodo sig) {
        this.sig = sig;
    }
    public Nodo getSiguiente() {
        return sig;
    }
    public int getDato() {
        return dato;
    }
}
 * </pre>
 * y que funcione correctamente el siguiente main()
 * <pre>
class App {
    public static void main(String[] args) {
        Pila mipila = new MiPila();
        mipila.push(1);
        mipila.push(2);
        mipila.push(3);
        mipila.push(4);
        mipila.push(5);
        while (!mipila.esVacia()) {
            System.out.println(mipila.pop());
        }
    }
}
 * </pre>
 */

public class Ejercicio_U6_B2B_E1 {
    public static void main(String[] args) {
        Pila mipila = new MiPila();
        mipila.push(1);
        mipila.push(2);
        mipila.push(3);
        mipila.push(4);
        mipila.push(5);
        while (!mipila.esVacia()) {
            System.out.println(mipila.pop());
        }
    }
}




