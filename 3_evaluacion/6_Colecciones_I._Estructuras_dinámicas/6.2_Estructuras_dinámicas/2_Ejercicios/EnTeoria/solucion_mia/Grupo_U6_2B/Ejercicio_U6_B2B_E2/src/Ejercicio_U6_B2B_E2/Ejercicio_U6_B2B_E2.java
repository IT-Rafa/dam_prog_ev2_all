package Ejercicio_U6_B2B_E2;

/**
 * Clase que contiene el main del Ejercicio_U6_B2B_E2
 */
public class Ejercicio_U6_B2B_E2 {

  /**
   * Creamos varios String con expresión con parentesis y mostramos
   * si los paréntesis están balanceados o no, es decir si los parentesis
   * abiertos coinciden con los cerrados.
   */
  public static void main(String[] args) {
    String expresion = "((2+3)/(3*(8-2))";
    System.out.println(parentesisBalanceados(expresion));
    expresion = ")4(";
    System.out.println(parentesisBalanceados(expresion));
    expresion = "(4)";
    System.out.println(parentesisBalanceados(expresion));
    expresion = "(2+3)/(3*(8-2))";
    System.out.println(parentesisBalanceados(expresion));
    expresion = "))";
    System.out.println(parentesisBalanceados(expresion));
  }

  /**
   *
   */
  public static boolean parentesisBalanceados(String expresion) {
    // Creamos pila para almacenar los parentesis
    Pila pila = new MiPila();
    // Convertimos String, donde está la expresión, en Array[]
    char[] array = expresion.toCharArray();
    // Recorremos el array
    for (char c : array) {
      if (c == '(') {
        // Si el paréntesis se abre, lo añadimos
        pila.push(c);
      } else if (c == ')') {
        // Si el paréntesis se cierra
        if (!pila.esVacia()) {
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
    if (pila.esVacia()) {
      return true;
    } else {
      // En caso de que no, devolvemos false
      return false;
    }
  }
}
