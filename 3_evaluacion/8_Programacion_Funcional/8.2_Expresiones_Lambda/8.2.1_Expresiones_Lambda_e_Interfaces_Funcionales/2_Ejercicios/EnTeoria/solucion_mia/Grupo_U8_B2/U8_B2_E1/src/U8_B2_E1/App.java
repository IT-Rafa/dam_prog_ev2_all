package U8_B2_E1;

/**
 * Ejercicio U8_B2_E1<p>
 * <pre>
@FunctionalInterface<p>
interface TransformadorNumerico{
    public int transformar(int x);
}
 * </pre>
 * con una expresión lambda, sobre el interface anterior 
 * genera una implementación que por ejemplo devuelva el 
 * cuadrado de un número.
 */

@FunctionalInterface
interface TransformadorNumerico {
  public int transformar(int x);
}

class App {

  public static void main(String[] args) {
    TransformadorNumerico hacerCuadrado = a1 -> a1 * a1;
    System.out.println(hacerCuadrado.transformar(5));
  }
}
