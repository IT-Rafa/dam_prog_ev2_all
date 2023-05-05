package Ejercicio_U7_B4B_E3;

/**
 * Representa a las expresiones construidas en el árbol que
 * incluyen Expresiones internas y la operación.<p>
 * Clase compuesta de Patrón Composite
 */
public class Operacion extends Expresion {

  /**
   * Enlace a Expresión izquierda del objeto
   */
  private Expresion left;

  /**
   * Enlace a Expresión derecha del objeto
   */
  private Expresion right;

  /**
   * Caracter que representa la operación a realizar
   * entre los atributos left y right
   */
  private char operator;

  /**
   * Constructor que pide la expresión izquierda, la derecha y
   * la operación a crear
   *
   * @param ex1 Expresión izquierda
   * @param ex2 Expresión derecha
   * @param c Caracter que indica la operación a crear
   */
  public Operacion(Expresion ex1, Expresion ex2, char c) {
    this.left = ex1;
    this.right = ex2;
    this.operator = c;
  }

  /**
   * Intenta resolver la Expresión y, si es posible, devuelve su valor
   * en double
   *
   * @return Valor devuelto por la expresión
   *
   * @exception ExpresionException Muestra la causa de por qué la expresión no es válida
   */
  @Override
  double evaluar() throws ExpresionException {
    double result;
    switch (this.operator) {
      // + - * /
      case ('+'):
        result = left.evaluar() + right.evaluar();
        break;
      case ('-'):
        result = left.evaluar() - right.evaluar();
        break;
      case ('*'):
        result = left.evaluar() * right.evaluar();
        break;
      case ('/'):
        result = left.evaluar() / right.evaluar();
        break;
      default:
        throw new ExpresionException("Operador desconocido: " + this.operator);
    }
    return result;
  }
}
