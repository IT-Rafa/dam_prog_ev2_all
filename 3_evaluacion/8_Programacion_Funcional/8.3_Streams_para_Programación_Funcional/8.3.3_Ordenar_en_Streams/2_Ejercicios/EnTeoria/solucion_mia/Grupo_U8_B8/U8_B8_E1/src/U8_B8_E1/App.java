package U8_B8_E1;

import java.util.*;

/**
 * Clase que representa una cantidad de productos
 */
class Producto {

  /**
   * Descripción del producto
   */
  private String descripcion;
  /**
   * Cantidad de unidades del Producto
   */
  private int cantidad;
  /**
   * Precio por unidad del producto
   */
  private double precio;

  //CONSTRUCTOR
  /**
   * Constructor para producto que pide descripcion, cantidad y precio
   *
   * @param descripcion Descripción del producto
   * @param cantidad Cantidad de unidades del Producto
   * @param precio Precio por unidad del producto
   */
  public Producto(String descripcion, int cantidad, double precio) {
    this.descripcion = descripcion;
    this.cantidad = cantidad;
    this.precio = precio;
  }

  // GETTER & SETTER
  /**
   * Devuelve la descripcion del producto
   *
   * @return descripcion del producto
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * Devuelve la cantidad del producto
   *
   * @return cantidad del producto
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * Devuelve la precio del producto
   *
   * @return precio del producto
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * Muestra el producto como String
   *
   * @return String con datos del producto
   */
  public String toString() {
    return (
      this.getCantidad() +
      " - " +
      this.getPrecio() +
      " - " +
      this.getDescripcion()
    );
  }
}

/**
 * Clase con ejecutable de Ejercicio U8_B8_E1
 * <p>
 */

class App {

  /**
   * Ejecutable Ejercicio U8_B8_E1<p>
   */
  public static void main(String[] args) {
    // Creamos una lista de productos desordenada
    List<Producto> lista = new ArrayList<>();
    lista.add(new Producto("Producto A", 10, 50.0));
    lista.add(new Producto("Producto B", 5, 100.0));
    lista.add(new Producto("Producto C", 20, 10.0));
    lista.add(new Producto("Producto A", 5, 20.0));
    lista.add(new Producto("Producto B", 5, 10.0));
    lista.add(new Producto("Producto D", 5, 10.0));

    // source
    lista
      // Convertimos a stream
      .stream()
      // Ordenamos
      .sorted(
        // Con comparador
        Comparator
          // primero cantidad
          .comparing(Producto::getCantidad)
          // segundo precio
          .thenComparing(Producto::getPrecio)
          // tercero descripcion
          .thenComparing(Producto::getDescripcion)
      )
      // Mostramos lista
      .forEach(System.out::println);
  }
}
