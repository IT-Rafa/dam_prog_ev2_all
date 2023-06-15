/**
 * package con clases para
 * <h3>Ejercicio U8_B4_E3:</h3>
 * Añade al ejemplo anterior, a la clase Punto, un constructor copia
 * y al main la creación de un punto copia.
 * <p>
 * Observa que lógicamente, para usar el constructor copia precisaré
 * un objeto Function. Y observa como aunque Punto tenga varios
 * constructores el compilador por el contexto utiliza el apropiado.
 * <h4>Ejemplo anterior</h4>
 * <pre>
import java.util.function.BiFunction;

class Punto {
  private int x;
  private int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}


public class App {

    public static void main(String[] args) {
      //BiFunction<Integer, Integer, Punto> constructor = (x, y) -> new Punto(x, y);
      // Referencia al constructor de la clase Punto usando BiFunction
      BiFunction<Integer, Integer, Punto> constructor = Punto::new;

      // Crear un objeto Punto con las coordenadas (3, 4)
      Punto punto = constructor.apply(3, 4);
      
      System.out.println(
        "Coordenadas: (" + punto.getX() + ", " + punto.getY() + ")"
      );
    }
  }
 * </pre>
 */
package U8_B4_E3;
