package U8_B4_E2;

// Interface funcional que recibe el parametro genérico T y
// devuelve el tipo genérico R
import java.util.function.Function;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E2<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E2<p>
   * Añadimos comentarios y solución
   */
  public static void main(String[] args) {
    // Ejecutamos imprimir y creamos definimos clase y
    // Creamos objeto anónimo con la interface Function
    //
    imprimir(
      new Function<String, String>() {
        @Override
        public String apply(String s) {
          return s.toLowerCase();
        }
      },
      "imprimir1: STRING TO LOWERCASE"
    );

    imprimir(s -> s.toLowerCase(), "imprimir2: STRING TO LOWERCASE");

    //añadir impresion con tipo::
    // Usamos Tipo::métodoInstancia

    imprimir(String::toLowerCase, "imprimir3: STRING TO LOWERCASE");
  }

  public static void imprimir(Function<String, String> function, String s) {
    System.out.println(function.apply(s));
  }
}
