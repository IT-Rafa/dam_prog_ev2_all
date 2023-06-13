package U8_B3_E2.intLocalVersion;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Clase con ejecutable de Ejercicio U8_B3_E2<p>
 * Creamos versión de clase interna como local (en método)
 */
public class AppIntLocal {

  /**
   * Ejecutable Ejercicio U8_B3_E2<p>
   * Creamos lista de artículos, añadimos artículos, ordenamos la
   * lista y la mostramos.
   */
  public static void main(String[] args) {
    /**
     * Clase interna de método main en  objeto AppStatic.
     * <p>
     * Creada en método método main de clase App, que es
     * quien la usa
     * <p>
     * Gestiona el uso del Comparador ordenando según código
     * del artículo (codArticulo)
     */
    class ComparadorArticulos implements Comparator<Articulo> {

      /**
       * Compara los artículos por el código del artículo (codArticulo)
       */
      @Override
      public int compare(Articulo o1, Articulo o2) {
        return o1.codArticulo.compareTo(o2.codArticulo);
      }
    }

    // Creamos lista
    LinkedList<Articulo> articulos = new LinkedList<Articulo>();

    // Incluimos artículos
    articulos.add(new Articulo("34", "cuchillo", 5));
    articulos.add(new Articulo("12", "tenedor", 7));
    articulos.add(new Articulo("41", "cuchara", 4));
    articulos.add(new Articulo("11", "plato", 6));

    // Ordenamos lista
    // Usamos la clase especificada en este método
    Collections.sort(articulos, new ComparadorArticulos());

    // Mostramos artículos
    for (Articulo a : articulos) {
      System.out.println(
        a.codArticulo + ", " + a.descripcion + ", " + a.cantidad
      );
    }
  }
}

/**
 * Representa un grupo de artículos con mismo código
 */
class Articulo {

  // ATTRIBUTES
  /**
   * Código del artículo
   */
  String codArticulo;
  /**
   * Descripción
   */
  String descripcion;
  /**
   * Cantidad de artículos almacenados
   */
  int cantidad;

  // CONSTRUCTOR
  /**
   * Constructor que pide el código, la descripción y la cantidad de
   * estos artículos almacenada
   *
   * @param codArticulo Código del artículo
   * @param descripcion Descripción del artículo
   * @param cantidad Cantidad de este artículo almacenada
   */
  Articulo(String codArticulo, String descripcion, int cantidad) {
    this.codArticulo = codArticulo;
    this.descripcion = descripcion;
    this.cantidad = cantidad;
  }
}
