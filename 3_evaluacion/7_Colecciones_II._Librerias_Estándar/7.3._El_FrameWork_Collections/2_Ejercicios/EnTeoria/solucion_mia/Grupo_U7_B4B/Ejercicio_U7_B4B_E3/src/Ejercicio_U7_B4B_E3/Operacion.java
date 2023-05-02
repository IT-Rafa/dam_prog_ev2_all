package Ejercicio_U7_B4B_E3;

/**
 * Nodo complejo de patrón Composite
 */
public class Operacion extends Expresion {

  private Expresion left;
  private Expresion right;
  private char operator;

  public Operacion(Operando operando, Operando operando2, char c) {
    this.left = operando;
    this.right = operando2;
    this.operator = c;
  }

  public Operacion(Operacion operacion, Operacion operacion2, char c) {}

  @Override
  double evaluar() {
    switch (this.c){
        case('1'):
        break;
        default;
    }
  }
}
