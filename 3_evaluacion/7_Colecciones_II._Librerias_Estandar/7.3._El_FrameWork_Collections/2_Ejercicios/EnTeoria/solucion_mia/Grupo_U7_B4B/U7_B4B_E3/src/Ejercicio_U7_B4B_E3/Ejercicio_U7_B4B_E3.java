package Ejercicio_U7_B4B_E3;

/**
 * Clase que contiene el main del Ejercicio_U7_B4B_E3
 */
public class Ejercicio_U7_B4B_E3 {

  /**
   * Creamos expresiones en opjeto tipo Expresion, las resolvemos y mostramos resultado
   */
  public static void main(String[] args) {
    // Creamos expresion
    Expresion expresion = new Operacion(
      new Operacion(new Operando(3), new Operando(4), '*'), // (3*4)
      new Operacion(new Operando(2), new Operando(5), '+'), // (2+5)
      '-' // OperacionIzq - OperacionDer = (3*4) - (2+5) = 12 - 7  = 5
    );

    // Variable donde se guardará la solución de expresion1
    double resultado;
    try {
      resultado = expresion.evaluar();
      // Mostramos resultado, si es correcta
      System.out.println(resultado);
    } catch (ExpresionException e) {
      System.out.println(e.getMessage());
    }
    // Salida:

    // Creamos expresion1
    expresion =
      new Operacion(
        new Operacion(new Operando(3), new Operando(4), '%'), // 3 & 4
        new Operacion(new Operando(2), new Operando(5), '+'), // 2 + 5
        '-' // OperacionIzq - OperacionDer = (3 & 4) - (2 + 5) = OperacionIzq: Error por caracter &
      );

    try {
      resultado = expresion.evaluar();
      // Mostramos resultado, si es correcta
      System.out.println(resultado);
    } catch (ExpresionException e) {
      System.out.println(e.getMessage());
    }
  }
  // Salida: Operador desconocido: %
}
