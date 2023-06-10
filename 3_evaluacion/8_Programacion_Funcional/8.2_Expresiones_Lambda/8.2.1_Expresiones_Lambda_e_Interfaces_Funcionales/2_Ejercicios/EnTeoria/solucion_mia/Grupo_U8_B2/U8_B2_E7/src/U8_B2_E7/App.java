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
    MiIntPredicateA a = new MiIntPredicateA();
    MiIntPredicateB b = new MiIntPredicateB();
    // or no devuelve boolean, devuelve un IntPredicate más complejo
    IntPredicate c = a.or(b);
    System.out.println(c.test(5));
    //lo mismo pero más compacto y dificil de entender
    System.out.println(a.or(b).test(5));
  }
}

class MiIntPredicateA implements IntPredicate {

  @Override
  public boolean test(int n) {
    return n < 0;
  }
}

class MiIntPredicateB implements IntPredicate {

  @Override
  public boolean test(int n) {
    return n % 2 == 0;
  }
}
