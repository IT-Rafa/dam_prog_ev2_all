package U8_B3_E3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Clase con ejecutable de Ejercicio U8_B3_E3<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B3_E3<p>
   * En vez de crear la clase en otro lugar, la definimos y
   * creamos directamente al llamarla en parámetro Comparator
   * de Collections.sort
   */
  public static void main(String[] args) {
    // Creamos lista
    LinkedList<Articulo> articulos = new LinkedList<Articulo>();

    // Incluimos artículos
    articulos.add(new Articulo("34", "cuchillo", 5));
    articulos.add(new Articulo("12", "tenedor", 7));
    articulos.add(new Articulo("41", "cuchara", 4));
    articulos.add(new Articulo("11", "plato", 6));

    // Ordenamos lista
    // Con clase estática de esta clase AppStatic
    Collections.sort(
      articulos,
      // Definimos y creamos clase anónima, que hereda del la clase
      // Comparator (indicado por el constructor) y sobreescribimos
      // el método compare
      new Comparator<Articulo>() {
        @Override
        public int compare(Articulo o1, Articulo o2) {
          return o1.codArticulo.compareTo(o2.codArticulo);
        }
      }
    );

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
