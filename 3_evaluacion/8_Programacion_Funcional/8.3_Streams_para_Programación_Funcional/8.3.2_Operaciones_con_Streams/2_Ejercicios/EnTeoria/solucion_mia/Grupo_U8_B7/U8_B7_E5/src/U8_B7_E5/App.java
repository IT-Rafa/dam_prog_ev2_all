package U8_B7_E5;

import java.util.Arrays;
import java.util.List;

/**
 * Clase con ejecutable de Ejercicio U8_B7_E5<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B7_E5<p>
   */
  public static void main(String[] args) {
    Articulo[] articulos = {
      new Articulo("A1", 10.0),
      new Articulo("A2", 30.5),
      new Articulo("B1", 30.0),
      new Articulo("B2", 100.0),
      new Articulo("c1", 66.5),
    };
    List<Articulo> listaArticulos = Arrays.asList(articulos);

    // sumar el pvp de todos los importes cuyo código

    double total = listaArticulos
      .stream()
      // empieza por “B”
      .filter(art -> art.getCodigo().startsWith("B"))
      // Coger solo el pvp
      .mapToDouble(a -> a.getPvp())
      // sumar todo
      .sum();

    System.out.println(total);
  }
}

/**
 *  Clase que representa un artículo con precio
 */
class Articulo {

  // ATTRIBUTES
  /**
   * Código del artículo
   */
  String codigo;

  /**
   * Precio Venta al Publico del artículo
   */
  double pvp;

  // CONSTRUCTOR
  /**
   * Contructor que pide el código y el precio venta del artículo
   *
   * @param codigo Código de artículo
   * @param pvp Precio Venta al Publico del artículo
   */
  public Articulo(String codigo, double pvp) {
    this.codigo = codigo;
    this.pvp = pvp;
  }

  // GETTER & SETTER

  /**
   * Devuelve el código
   *
   * @return Código del artículo
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * Devuelve el precio
   *
   * @return Precio del artículo
   */
  public Double getPvp() {
    return pvp;
  }

  /**
   * Convierte el artículo en String
   */
  @Override
  public String toString() {
    return "Articulo{" + "codigo=" + codigo + ", pvp=" + pvp + '}';
  }
}
