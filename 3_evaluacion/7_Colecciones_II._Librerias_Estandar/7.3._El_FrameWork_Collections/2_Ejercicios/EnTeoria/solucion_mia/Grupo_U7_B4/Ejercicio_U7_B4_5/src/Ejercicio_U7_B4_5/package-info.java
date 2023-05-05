/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U7_B4_5:</h3><p>
 * En el boletín de estructuras dinámicas escribiste una clase 
 * Pila “a pelo” usando nodos enlazados. <p>
 * Escribe ahora una clase Pila pero utilizando subyacentemente
 * LinKedList
 * <pre>
import java.util.LinkedList;

class Pila<T>{
    LinkedList<T> listaDatos= new LinkedList<>();
    //escribir push(), pop() y esVacia()
}

public class App {
    public static void main(String args[]) {
        Pila<Character> miPila= new Pila<>();
        miPila.push('a');miPila.push('b');miPila.push('c');
        while(!miPila.esVacia()){
            System.out.print(miPila.pop()+" ");
        }   
    }
}
 * </pre>  
 */
package Ejercicio_U7_B4_5;
