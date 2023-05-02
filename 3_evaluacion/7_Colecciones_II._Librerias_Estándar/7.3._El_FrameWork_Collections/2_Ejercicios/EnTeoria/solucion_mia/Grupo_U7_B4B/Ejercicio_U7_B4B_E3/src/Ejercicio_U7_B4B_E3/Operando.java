package Ejercicio_U7_B4B_E3;

public class Operando extends Expresion {

  private int valor;

  public Operando(int i) {
    this.valor = i;
  }

  @Override
  double evaluar() throws ExpresionException {
    return valor;
  }
}
