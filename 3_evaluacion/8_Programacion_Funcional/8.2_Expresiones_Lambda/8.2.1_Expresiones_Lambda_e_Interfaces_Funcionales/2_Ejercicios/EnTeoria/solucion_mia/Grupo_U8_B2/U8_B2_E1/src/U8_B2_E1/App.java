package U8_B2_E1;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E1<p>
 */
class App {

  /**
   * Método ejecutable<p>
   * Ejecuta una expresión lambda
   */
  public static void main(String[] args) {
    // lambda es una letra griega, que usa el símbolo λ, en minúscula
    // y Λ, en mayúscula.<p>
    // Tiene varias asociaciones, en nuestro caso, nos interesa como se
    // considerá en matemáticas, que es un sistema formal diseñado para
    // investigar la definición de función.<p>

    // Almacenamos la expresión lambda en un objeto, con clase
    // anónima creada por Java, y que cuadra con el prototipo del
    // método único, en este caso, ejecutar, de la interface
    // TransformadorNumerico.
    // Prototipo: acepta integer y devuelve integer
    // lambda: coge entero, lo múltiplica por si mismo. La devolución es
    //   el resultado de esta operación
    TransformadorNumerico hacerCuadrado = a1 -> a1 * a1;
    // Mostramos el objeto con el parámetro 5.
    System.out.println(hacerCuadrado.ejecutar(5));
  }
}

// La anotación de Java <code>@FunctionalInterface</code>
// antes de la interface comunica el proposito de la interface y
// hace que se generen errores si la función no tiene solo un
// prototipo de interface

/**
 * Interface para crear expresiones lambda con un entero como entrada
 * o parámetro y un entero como la salida o retorno
 */
@FunctionalInterface
interface TransformadorNumerico {
  public int ejecutar(int x);
}
