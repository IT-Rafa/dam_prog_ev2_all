package U8_B3_E4;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Clase con ejecutable de Ejercicio U8_B3_E4<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B3_E4<p>
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
      // El parámetro espera una lista de artículos genéricos y un Comparator de esos artículos
      // Como la lista ya se definió como de Articulo, el Comparador
      // espera que sea del mismo tipo.
      // El método a sobreescibir del Comparador es int compare(T arg0, T arg1)
      // con lo que simplemente añadimos la expresión lambda con parametro de
      // 2 objetos Artículo y con salida int.
      // En este caso, como en los otros, comparamos los códigos de ambos artículos
      (art1, art2) -> art1.codArticulo.compareTo(art2.codArticulo)
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
