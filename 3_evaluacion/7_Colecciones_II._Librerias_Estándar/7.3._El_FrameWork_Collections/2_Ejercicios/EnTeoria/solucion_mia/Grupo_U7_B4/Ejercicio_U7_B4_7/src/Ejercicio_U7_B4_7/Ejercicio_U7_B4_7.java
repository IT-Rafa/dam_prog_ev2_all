package Ejercicio_U7_B4_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_7
 */
public class Ejercicio_U7_B4_7 {

  /**
   * Captura entradas de usuario.
   * - Si alguna está vacia, finaliza programa
   * Analiza paréntesis, corchetes y llaves.
   * Si aparece el cerrado o no coinciden apertura y cierre, muestra "No".
   * Si están correcto muestra "Sí"
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Captura mientras haya líneas del usuario.
    while (sc.hasNextLine()) {
      // Cogemos línea del usuario
      String input = sc.nextLine();
      if (input.compareToIgnoreCase("") == 0) {
        // Fin si línea vacia
        break;
      }
      System.out.println((parentesisBalanceados(input) ? "YES" : "NO"));
    }
    sc.close();
  }

  /**
   *
   */
  private static boolean parentesisBalanceados(String expresion) {
    // Creamos array pila para almacenar los stacks de cada símbolo
    List<Stack<Character>> pilas = new ArrayList<Stack<Character>>();
    pilas.add(new Stack<>());
    pilas.add(new Stack<>());
    pilas.add(new Stack<>());

    // Guardamos String con llaves apertura y cierre
    String[] simbolos = { "()", "[]", "{}" };

    // Convertimos expresión del usuario en Array[]
    char[] expArray = expresion.toCharArray();

    // Recorremos caracteres de expresión
    for (char c : expArray) {
      // Revisamos cada stack (pila) de simbolos
      for (int i = 0; i < simbolos.length; i++) {
        if (simbolos[i].indexOf(c) != -1) {
          if (!insertPairChar(c, pilas.get(i), simbolos[i])) {
            // Si devuelve falso, se encontro un cierre sin apertura
            return false;
          }
          // Si encontro símbolo, ya no pertenece a los otros stack
          continue;
        }
      }
    }

    // Si llega aqui, no hubo cierres sin abrir
    // Revisamos que cada pila está a 0
    for (int i = 0; i < pilas.size(); i++) {
      if (pilas.get(i).size() != 0) {
        // Si no está a 0 sobran simbolos de apertura
        return false;
      }
    }

    // Si llega aquí, todo está bien
    return true;
  }

  /**
   * Según el caracter c, si es la apertura, introduce en la pila.
   * Si no, es cierre y lo elimina, si existe,
   * Si es cierre y no hay ninguno en la lista, devuelve false.
   *
   * @param c Caracter a leer
   * @param pila Pila de caracteres correspondientes a tipo de símbolo
   * @param simbolos String con los símbolos de apertura y cierre.
   *
   * @return Devuelve True si la entrada fue correcta. False si c es símbolo de
   * cierre y no existe ningúno de apertura.
   */
  private static boolean insertPairChar(
    char c,
    Stack<Character> pila,
    String simbolos
  ) {
    if (c == simbolos.charAt(0)) {
      // Apertura simbolo
      pila.push(c);
    } else { // cierre simbolo
      if (pila.isEmpty()) {
        return false;
      } else {
        pila.pop();
      }
    }
    return true;
  }
}
