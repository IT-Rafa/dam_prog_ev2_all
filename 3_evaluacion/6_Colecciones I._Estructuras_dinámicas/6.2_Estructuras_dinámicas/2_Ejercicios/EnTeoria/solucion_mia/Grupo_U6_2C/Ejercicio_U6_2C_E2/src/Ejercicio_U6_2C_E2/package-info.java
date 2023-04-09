/**
 * Contiene clases para: <p>
 * Ejercicio U6_2C_E2: <p>
 * Escribe en la clase árbol un método existe() que toma como parámetro 
 * un entero y si el entero existe en el árbol devuelve true y si no 
 * existe devuelve false.<p>
 * Un pseudocódigo podría ser:
 * <pre>
si nodo = null
    false
si valorBuscado = nodo.datos
    true
si nodo.datos < valorBuscado
    busca en subarbol izquierdo (y esto da true o false)
sino
    busca en subarbol derecho (y esto da true o false)
 * <pre/>
 * 
 * Observa que la búsqueda en un ABB es rapidísima ya que 
 * en cada decisión eliminamos la mitad de los nodos en que buscar.<p>
 * Puedes usar el siguiente main para probarlo:
 * <pre>
public class App {
    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(8);
        arbol.insertar(15);
        arbol.insertar(26);
        arbol.insertar(19);
        arbol.insertar(17);
        arbol.insertar(4);

        System.out.println("\nExiste el valor "+ 3 + "?: " 
            + arbol.existe(3));
        System.out.println("\nExiste el valor "+ 19 + "?: "
            + arbol.existe(19));
    }
}
 * <pre/>
 */
package Ejercicio_U6_2C_E2;
