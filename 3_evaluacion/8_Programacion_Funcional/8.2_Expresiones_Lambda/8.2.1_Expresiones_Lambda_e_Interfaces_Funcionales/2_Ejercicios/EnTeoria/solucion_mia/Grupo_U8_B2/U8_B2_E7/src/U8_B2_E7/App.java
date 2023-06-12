package U8_B2_E7;

import java.util.function.IntPredicate;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E7<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E7<p>
   *
   */
  public static void main(String[] args) {
    // a ( con test interno sobreescrito) comprueba que n es menor que 0
    MiIntPredicateA a = new MiIntPredicateA();

    // b ( con test interno sobreescrito) comprueba que n es par
    MiIntPredicateB b = new MiIntPredicateB();

    // Creamos nuevo predicado con a.or y la clase b
    // Funciona como a || b; El segundo no se comprueba si
    // el primero es cierto.
    // Primero comprueba el primer predicado MiIntPredicateA,
    // que comprueba que el valor sea menor que 0.
    // Si es cierto, devuelve True directamente. Si no, es decir
    // si es 0 o mayor, es False y comprueba el siguiente predicado
    // que comprueba si  es par, y lo devuelve
    IntPredicate c = a.or(b);

    // El valor del test es la expresión que se le pasa a
    // ambos predicados

    // A: n=-1 es negativo y directamente devuelve True
    System.out.println(c.test(-1));

    // A: n= 2 es positivo y da False; Se combrueba B
    // B: n= 2 es par y devuelve True
    System.out.println(c.test(2));

    // A: n= 1 es positivo y da False; Se combrueba B
    // B: n= 2 es impar y devuelve False
    System.out.println(c.test(1));
  }
}

/**
 * el método sobreescrito test devuelve true si el entero es negativo.
 */
class MiIntPredicateA implements IntPredicate {

  /**
   * Método sobreescrito que recibe un entero y devuelve True si
   * es menor que 0 y False en caso contrario
   *
   * @param n Entero a analizar
   * @return True si es menor que 0; False en caso contrario
   */
  @Override
  public boolean test(int n) {
    return n < 0;
  }
}

/**
 * el método sobreescrito test devuelve true si el entero es par.
 */
class MiIntPredicateB implements IntPredicate {

  /**
   * Método sobreescrito que recibe un entero y devuelve True si
   * es par y False en caso contrario
   *
   * @param n Entero a analizar
   * @return True si es par; False si no
   */
  @Override
  public boolean test(int n) {
    return n % 2 == 0;
  }
}
