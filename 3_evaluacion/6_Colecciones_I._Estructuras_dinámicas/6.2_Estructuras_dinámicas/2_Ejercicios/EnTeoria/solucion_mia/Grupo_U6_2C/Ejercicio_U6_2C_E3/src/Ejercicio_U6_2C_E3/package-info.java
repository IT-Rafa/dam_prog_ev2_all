/**
 * Contiene clases para: <p>
 * Ejercicio U6_2C_E3: <p>
 * Ahora queremos también imprimir, usando preorden, una versión
 * con tabulaciones y saltos de línea, que ayuda a visualizar el 
 * árbol que hay en memoria, que es dificil de ver al imprimirlo 
 * como una lista de nodos secuencial
 * <pre>
public class App {
    public static void main(String args[]) {
        Arbol arbol = new Arbol();
        arbol.insertar(8);arbol.insertar(4);arbol.insertar(10);
        arbol.insertar(2);arbol.insertar(5);arbol.insertar(9);
        arbol.insertar(12);
    

    System.out.println("\nRecorrido preorden .....");
    arbol.recorridoPreorden();
    System.out.println("\nRecorrido preorden con indentaciones.....");
    arbol.recorridoPreordenConTAB();
    }
}
 * </pre>
 * salida:
 * <pre>  
Recorrido preorden .....
8 4 2 5 10 9 12
Recorrido preorden con indentaciones.....
8
    4
        2
        5
    10
        9
        12
 * </pre>  
 * TRUCO: añade al método ayudanteecorridoPreordenConTAB() un 
 * parámetro String sangrado que vaya creciendo a medida que avanza 
 * la recursividad.
 */
package Ejercicio_U6_2C_E3;
