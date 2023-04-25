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
    String expresion = "( (2+3)/ (3 * (8-2))"; // Falta parentesis
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion = ")4(";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion = "(4)";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion = "(2+3)/(3*(8-2))";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion = "))";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    expresion = ":)";
    System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion = "({[]})()";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion =
    //   "Tengase en cuenta (obviamente) que puede haber otros simbolos.";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
    // expresion = ":)";
    // System.out.println((parentesisBalanceados(expresion)) ? "YES" : "NO");
  }

  /**
   *
   */
  public static boolean parentesisBalanceados(String expresion) {
    // Creamos pila para almacenar los parentesis
    Stack<Character> pilaParentesis = new Stack<>(); // /()
    Stack<Character> pilaCorchetes = new Stack<>(); // []
    Stack<Character> pilaLlaves = new Stack<>(); // {}
    final String parentesis = "()";
    final String corchetes = "[]";
    final String llaves = "{}";

    // Convertimos String, donde está la expresión, en Array[]
    char[] expArray = expresion.toCharArray();
    boolean result = true;
    for (char c : expArray) {
      if (c == parentesis.charAt(0) || c == parentesis.charAt(1)) {
        if (!insertPairChar(c, pilaParentesis, parentesis)) {
          result = false;
          break;
        }
      } else if (c == corchetes.charAt(0) || c == corchetes.charAt(1)) {
        if (!insertPairChar(c, pilaCorchetes, corchetes)) {
          result = false;
          break;
        }
      } else if (c == llaves.charAt(0) || c == llaves.charAt(1)) {
        if (!insertPairChar(c, pilaLlaves, llaves)) {
          result = false;
          break;
        }
      }
    }
    if (result == false) {
      return false;
    } else {
      if (
        pilaParentesis.size() == 0 &&
        pilaCorchetes.size() == 0 &&
        pilaLlaves.size() == 0
      ) {
        return true;
      } else {
        return false;
      }
    }
  }

  /**
   *
   */

  private static boolean insertPairChar(
    char c,
    Stack<Character> pila,
    String simbolos
  ) {
    if (c == simbolos.charAt(0)) {
      pila.push(c);
    } else {
      if (pila.isEmpty()) {
        return false;
      } else {
        pila.pop();
      }
    }
    return true;
  }
}
