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
    // Ejecutamos imprimir y creamos objeto anónimo
    // como function
    imprimir(
      new Function<String, String>() {
        @Override
        public String apply(String s) {
          return s.toLowerCase();
        }
      },
      "imprimir1: STRING TO LOWERCASE"
    );

    // Ejecutamos imprimir y usamos expresión lambda para
    // crear la Function
    imprimir(s -> s.toLowerCase(), "imprimir2: STRING TO LOWERCASE");

    //añadir impresion con tipo::
    // Usamos Tipo::métodoInstancia
    // Ejecutamos imprimir y usamos Referencias a métodos para
    // crear la Function
    imprimir(String::toLowerCase, "imprimir3: STRING TO LOWERCASE");
  }

  /**
   * Método que recibe un objeto Function, que recibe y devuelve un String, y
   * el String que se le envía a la Function.<p>
   * Se imprimira el resultado de la Function.
   *
   * @param function Recibe un String y devuelve otro. El resultado se imprime
   * @param s String que recibirá la función como parámetro.
   */
  public static void imprimir(Function<String, String> function, String s) {
    System.out.println(function.apply(s));
  }
}
