package Ejercicio_U6_B1_E2;

/**
 * Clase que contiene el main del Ejercicio_U6_B1_E2
 */
public class Ejercicio_U6_B1_E2 {

  /**
   * <h3>Datos api:</h3>
   * <h4>public double doubleValue()</h4>
   * <ul>
   * <li>Devuelve objeto primitivo double almacenado en el objeto Double</li>
   * </ul>
   *
   * <h4>public static Double valueOf(String s)</h4>
   *                       throws NumberFormatException
   * <ul>
   * <li>Devuelve un objeto Doble con el valor representado por el string s.</li>
   * </ul>
   * 
   * <h4>public static double parseDouble(String s)</h4>
                          throws NumberFormatException
   * <ul>
   * <li>Devuelve un nuevo primitivo double creado con el valor representado por el string s, 
   * gestionado del mismo modo que con el método valueOf de la clase Double</li>
   * </ul>
   * 
   * <h3>Respuesta</h3>
   * diferencia entre valueOf y parseDouble<p>
   * Ambos son métodos estáticos<p>
   * <p>valueOf Crea un objeto Double con el valor String (o double). En este caso, para 
   * convertirlo en primitivo double, se usa doubleValue sobre el.
   * <p>parseDouble crea un primitivo double con el valor del String, y usa el mismo sistema
   * para convertir el string en double que valueOf
   * 
   */
  public static void main(String[] args) {
    // Crea String y almacena en variable
    String s = "1234.5678";

    // Creamos varible para almacenar double
    double d;

    // Crea el objeto Double con el string (valueOf) y luego saca el primitivo double
    // y lo guarda en la variable d
    d = Double.valueOf(s).doubleValue();

    // Imprime el valor de la variabe d double
    System.out.println("d con valueOf: " + d);

    // Usa el método estático de double, parseDouble para crear un primitivo double con
    // el String s. Es más rápido
    d = Double.parseDouble(s);
    System.out.println("d con parseDouble: " + d);
  }
}
