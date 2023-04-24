package Ejercicio_U7_B4_7;

import java.util.Stack;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_7
 */
public class Ejercicio_U7_B4_7 {

    /**
     * Creamos varios String con expresión con parentesis y mostramos
     * si los paréntesis están balanceados o no, es decir si los parentesis
     * abiertos coinciden con los cerrados.
     */
    public static void main(String[] args) {
        String expresion = "((2+3)/(3*(8-2))";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = ")4(";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = "(4)";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = "(2+3)/(3*(8-2))";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = "))";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = "({[]})()";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = "Tengase en cuenta (obviamente) que puede haber otros simbolos.";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
        expresion = ":)";
        System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");

    }

    /**
     *
     */
    public static boolean parentesisBalanceados(String expresion) {
        // Creamos pila para almacenar los parentesis
        Stack<Character> pila = new Stack<>();
        // Convertimos String, donde está la expresión, en Array[]
        char[] array = expresion.toCharArray();
        // Recorremos el array
        for (char c : array) {
            if (c == '(') {
                // Si el paréntesis se abre, lo añadimos
                pila.push(c);
            } else if (c == ')') {
                // Si el paréntesis se cierra
                if (!pila.isEmpty()) {
                    // y la lista no está vacia, lo eliminamos
                    pila.pop();
                } else {
                    // y la lista está vacia, ya no está balanceado y devolvemos false
                    return false;
                }
            }
        }

        // Si los paréntesis cerrados van detras y coinciden en número
        // Devolvemos true
        if (pila.isEmpty()) {
            return true;
        } else {
            // En caso de que no, devolvemos false
            return false;
        }
    }
}
