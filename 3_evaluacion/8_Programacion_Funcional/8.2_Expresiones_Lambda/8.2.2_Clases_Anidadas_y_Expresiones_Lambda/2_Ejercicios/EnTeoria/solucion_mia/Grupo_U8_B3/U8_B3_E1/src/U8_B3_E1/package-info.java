/**
 * package con clases para 
 * <h3>Ejercicio U8_B3_E1:</h3>
 * Recuerda la siguiente implementación de pila
 * <p>
 * <pre>
interface Pila{
    //inserta un elemento en la cabeza de la pila
    void push(int dato);
    
    //saca un elemento de la cabeza de la pila.
    int pop();
    
    public boolean esVacia();
}

class Nodo {
    private Nodo sig;
    private int dato;

    public Nodo(int dato) {
        this.dato = dato;
        this.sig = null;
    }

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
class MiPila implements Pila{
    
    private Nodo cabeza = null;

    public void push(int dato) {
        if (cabeza == null) {
            cabeza = new Nodo(dato);
        } else {
            Nodo temp = new Nodo(dato, cabeza);
            cabeza = temp;
        }
    }

    public int pop() {
        int dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        return dato;
    }

    public boolean esVacia() {
        return cabeza == null;
    }
}

class App {
        public static void main(String[] args) {
            MiPila mipila = new MiPila();
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
 * Queremos ocultar la clase Nodo a App que no le interesa 
 * en absoluto. Realmente es un detalle técnico de la clase 
 * Pila.
 * <p>
 * Se pide:
 * <p>
 * Convierte la clase Nodo en un miembro interno de la clase 
 * Pila. Podemos hacer además esa clase private y recordando 
 * que entre contenedora e interna no hay restricciones de 
 * acceso podemos eliminar set() y get().
 */
package U8_B3_E1;
