package Ejercicio_U7_B4B_E3;

/**
 * Representa a las expresiones construidas en el árbol.<p>
 * Clase abstracta de Patrón Composite
 */
abstract class Expresion {

  /**
   * Muestra el valor de la expresión
   *
   * @exception ExpresionException Muestra el fallo de la Exception
   */
  abstract double evaluar() throws ExpresionException;
}
