package Ejercicio_U6_B2B_E2;

/**
 * Ejercicio U6_B2B_E2: <p>
 * Utilizando el código del ejercicio anterior, pero haciendo la pila
 * de char, escribir un método que dada una expresión compruebe si los 
 * paréntesis están balanceados, observa que no es suficiente con contar 
 * que hay el mismo número de paréntesis ‘(‘ que ‘)’. <p>
 * Por ejemplo")4(" no es balanceada
 * <pre>
class App {
    public static boolean parentesisBalanceados(
            String expresion){
        //utiliza una pila para resolver el problema
    }
    public static void main(String[] args) {
        String expresion="((2+3)/(3*(8-2))";
        System.out.println(parentesisBalanceados(expresion));
        expresion=")4(";
        System.out.println(parentesisBalanceados(expresion));
        expresion="(4)";
        System.out.println(parentesisBalanceados(expresion));
        expresion="(2+3)/(3*(8-2))";
        System.out.println(parentesisBalanceados(expresion));
    }
}
run:
false
false
true
true
 * </pre>
 * Una forma fácil de solucionar el problema es que el método 
 * parentesisBalanceados() utilice una pila. <p>
 * Para ello vamos procesando cada caracter del String por orden, 
 * de izquierda a derecha. 
 * “Procesar” en este caso es leer el caracter del string y si 
 * detectamos que es un ‘(‘ hacemos un push(‘(‘) y si es un ‘)’ 
 * un pop().
 * 
 */
public class Ejercicio_U6_B2B_E2 {

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

  public static boolean parentesisBalanceados(String expresion) {
    Pila pila = new MiPila();
    char[] array = expresion.toCharArray();
    for (char c : array) {
      if (c == '(') {
        pila.push(c);
      } else if (c == ')') {
        if (!pila.esVacia()){
            pila.pop();
        } else{
            // Aparece ')' y pila está vacía
            return false;
        }
      }
    }

    if (pila.esVacia()) {
      return true;
    } else {
      return false;
    }
  }
}
