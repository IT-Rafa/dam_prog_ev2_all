package Ejercicio_U7_B4B_E3;

/**
 * Clase que contiene el main del Ejercicio_U7_B4B_E3
 */
public class Ejercicio_U7_B4B_E3 {

  /**
   *
   */
  public static void main(String[] args) {
    Expresion expresion = new Operacion(
      new Operacion(new Operando(3), new Operando(4), '*'), // (3*4)
      new Operacion(new Operando(2), new Operando(5), '+'), // (2+5)
      '-' // OperacionIzq - OperacionDer = (3*4) - (2+5) = 12 - 7  = 5
    );
    double resultado;

    try {
      resultado = expresion.evaluar();
      System.out.println(resultado);
    } catch (ExpresionException e) {
      System.out.println(e.getMessage());
    }
  }
}
