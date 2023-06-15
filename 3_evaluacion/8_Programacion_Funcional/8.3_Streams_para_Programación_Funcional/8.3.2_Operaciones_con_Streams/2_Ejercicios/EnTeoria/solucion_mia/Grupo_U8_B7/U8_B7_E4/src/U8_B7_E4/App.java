package U8_B7_E4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase con ejecutable de Ejercicio U8_B7_E4<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B7_E4<p>
   */
  public static void main(String[] args) {
    // Creamos Array de Articulo y añadimos elementos
    Articulo[] articulos = {
      new Articulo("A1", 10.0),
      new Articulo("A2", 30.5),
      new Articulo("B1", 30.0),
      new Articulo("B2", 100.0),
      new Articulo("c1", 66.5),
    };

    // Convertimos a lista
    List<Articulo> listaArticulos = Arrays.asList(articulos);

    //hacer tubería aquí para obtener filtrados
    List<Articulo> filtrados = listaArticulos
      .stream()
      // Filtrado con precio mayor que 30.0
      .filter(n -> n.getPvp() > 30.0)
      // Ordenamos con precio ascendente
      .sorted((art1, art2) -> art1.getPvp() <= art2.getPvp() ? -1 : 1)
      // Convertimos stream a lista
      .collect(Collectors.toList());

    // Mostramos nueva lista
    System.out.println(filtrados);
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
