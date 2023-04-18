/**
 * Contiene clases para: <p>
 * Ejercicio U6_2C_E4: <p>
 * Añadir la impresión de valor NULL al ejercicio anterior.<p>
 * Una solución al ejercicio anterior es la siguiente.
 * <pre>
public void recorridoPreordenConTAB() {
    ayudantePreordenConTAB(raiz,"");
}

private void ayudantePreordenConTAB(NodoArbol nodo,String tab) {
    if (nodo == null) {
        return;
    }
    System.out.println(tab+nodo.datos);
    tab=tab+"\t";
    ayudantePreordenConTAB(nodo.nodoIzq,tab);
    ayudantePreordenConTAB(nodo.nodoDer,tab);
}
 * </pre>
 * Ahora además queremos modificar este código de forma que también 
 * nos imprima los hijos null, y la salida sería:
 * <pre>
Recorrido preorden .....
8 4 2 5 10 9 12
Recorrido preorden con indentaciones.....
8
    4
        2
            null
            null
        5
            null
            null
    10
        9
            null
            null
        12
            null
            null
 * </pre>
 */
package Ejercicio_U6_2C_E4;
