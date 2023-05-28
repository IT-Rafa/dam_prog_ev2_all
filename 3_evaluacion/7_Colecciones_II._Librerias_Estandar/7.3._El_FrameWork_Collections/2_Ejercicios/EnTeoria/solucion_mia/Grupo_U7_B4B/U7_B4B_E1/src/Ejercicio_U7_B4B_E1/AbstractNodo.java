package Ejercicio_U7_B4B_E1;

/**
 * En Patrón Composite, es la parte Component que indica como
 * deben ser todos los hijos.
 */
abstract class AbstractNodo {

  // ATRIBUTES
  /**
   * Nombre del objeto
   */
  private String nombre;

  // CONSTRUCTOR
  /**
   * Constructor con nombre
   */
  protected AbstractNodo(String nombre) {
    this.nombre = nombre;
  }

  // GETTER & SETTER
  /**
   * Devuelve el nombre del objeto
   *
   * @return String con el nombre del objeto
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Cambia el nombre del objeto
   *
   * @param nombre String con el nombre del objeto
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Devuelve el precio del objeto.
   *
   * @return Precio del objeto en double
   */
  abstract double getPrecio();

  /**
   * Devuelve String con el nombre y precio de este objeto y los internos
   *
   * @return String con el nombre y precio de este objeto y los internos
   */
  public abstract String getPrecioDesglosado();
}
