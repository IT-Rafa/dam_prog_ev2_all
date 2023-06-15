package U8_B4_E3;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E3<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E3<p>
   * Añadimos comentarios al código
   * <p>
   * Creamos listado de puntos, para tenerlos juntos.
   * <p>
   * Creamos nuevo objeto Function que recibe y devuelve un punto y
   * y le asignamos la referencia al metodo constructor, sin argumentos
   * <p>
   * añadimos los puntos a la lista y los mostramos
   */
  public static void main(String[] args) {
    ArrayList<Punto> listaPunto = new ArrayList<>();

    //BiFunction<Integer, Integer, Punto> constructor = (x, y) -> new Punto(x, y);
    // Referencia al constructor de la clase Punto usando BiFunction

    // Se usa BiFunction, interfaz funcional genérica que recibe dos parámetros
    // y devuelve otro. En este caso recibe dos Integer y devuelve un Punto
    // Se le asigna la REFENCIA A MÉTODOS CONSTRUCTORES, de Punto
    BiFunction<Integer, Integer, Punto> constructor = Punto::new;
    Function<Punto, Punto> constructorCopia = Punto::new;

    // Crear un objeto Punto con las coordenadas (3, 4)
    listaPunto.add(constructor.apply(3, 4));
    listaPunto.add(constructorCopia.apply(listaPunto.get(0)));

    // Mostramos objetos de listaPunto
    for (Punto p : listaPunto) {
      System.out.println(
        "Punto " + p + ": Coordenadas: (" + p.getX() + ", " + p.getY() + ")"
      );
    }
  }
}

/**
 * Representa un punto con dos coordenadas
 */
class Punto {

  // ATTRIBUTES
  /**
   * Coordenada x
   */
  private int x;
  /**
   * Coordenada y
   */
  private int y;

  // CONSTRUCTORS
  /**
   * Constructor que recibe las coordenadas x e y
   *
   * @param x Coordenada x
   * @param y Coordenada y
   */
  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Constructor que recibe las coordenadas x e y
   *
   * @param x Coordenada x
   * @param y Coordenada y
   */
  public Punto(Punto p) {
    this.x = p.x;
    this.y = p.y;
  }

  // GETTER & SETTER
  /**
   * Devuelve la coordenada x
   *
   * @return Coordenada x
   */
  public int getX() {
    return x;
  }

  /**
   * Devuelve la coordenada y
   *
   * @return Coordenada y
   */
  public int getY() {
    return y;
  }
}
