/**
 * Contiene clases para:
 * <h3>Ejercicio U6_2C_E8:</h3>
 * Árbol binario que almacena expresión aritmética<p>
 * Un árbol de expresión es un árbol binario en el que cada nodo no hoja 
 * se corresponde con un operador y cada nodo hoja se corresponde con un 
 * operando. <p>
 * Observa el siguiente el árbol de expresión:
 * <pre>
.       x        ( ?            x ?)
       / \         
      -   3      ((? -       ?) x 3) 
     / \
    9   +        ((9 - (? + ?)) x 3) 
       / \
      5   2      ((9 - (5 + 2)) x 3) 
 * </pre>
 * La estructura del árbol determina el orden de las operaciones, la 
 * forma del árbol produce un efecto similar a cuando escribimos 
 * paréntesis en una expresión con notación inja <p>
 * Si recorres el árbol INORDEN puedes observar que almacena la siguiente 
 * expresión aritmética en notación inja.
 * <pre>
((9 - (5 + 2 ))x 3)
 * </pre>
 * Es una expresión totalmente parentizada, por cada operador hay siempre 
 * un paréntesis de apertura y otro de cierre. Hay paréntesis que se podrían 
 * suprimir pero para nuestro objetivo es más fácil pensar en una expresión 
 * totalmente parentizada.<p>
 * El siguiente código, por el momento incompleto, obtendría del árbol anterior 
 * la expresión anterior.
 * <pre>
class NodoArbol {
    NodoArbol nodoIzq;
    String datos;
    NodoArbol nodoDer;

    public NodoArbol(String datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null;
    }
}
class Arbol {
    NodoArbol raiz;
}
public class App {
    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        NodoArbol n=new NodoArbol("x");
        arbol.raiz=n;
        NodoArbol n1=new NodoArbol("-");
        NodoArbol n2=new NodoArbol("3");
        n.nodoIzq=n1;
        n.nodoDer=n2;
        NodoArbol n11=new NodoArbol("9");
        NodoArbol n12=new NodoArbol("+");
        n1.nodoIzq=n11;
        n1.nodoDer=n12;
        NodoArbol n121=new NodoArbol("5");
        NodoArbol n122=new NodoArbol("2");
        n12.nodoIzq=n121;
        n12.nodoDer=n122;
        //arbol.imprimir();
    }
}

 * </pre>
 * 
 * SE PIDE:<p>
 * descomentar la última instrucción del main y escribir el código 
 * necesario en la clase Árbol para que se imprima la expresión formato infijo 
 * correctamente parentizada, es decir:<p>
 * <pre>
((9 - (5 + 2 ))x 3)
 * </pre>
 */
package Ejercicio_U6_2C_E8;
