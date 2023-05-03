package Ejercicio_U7_B4B_E3;

/**
 * Representa a las expresiones construidas en el árbol que
 * solo tienen un valor entero.<p>
 * Clase Leaf de Patrón Composite
 */
public class Operando extends Expresion {

  /**
   * Valor que contiene el objeto
   */
  private int valor;

  /**
   * Constructor que pide el valor
   *
   * @param i valor que contendrá el objeto
   */
  public Operando(int i) {
    this.valor = i;
  }

  /**
   * Devuelve el valor en double
   */
  @Override
  double evaluar() {
    return (double) valor;
  }
}
