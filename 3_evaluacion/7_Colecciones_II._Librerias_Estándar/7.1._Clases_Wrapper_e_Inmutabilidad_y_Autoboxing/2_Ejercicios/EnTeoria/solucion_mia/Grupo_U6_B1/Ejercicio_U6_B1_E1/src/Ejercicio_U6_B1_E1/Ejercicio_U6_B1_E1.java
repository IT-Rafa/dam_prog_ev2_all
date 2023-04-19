package Ejercicio_U6_B1_E1;

/**
 * Clase que contiene el main del Ejercicio_U6_B1_E1
 */
public class Ejercicio_U6_B1_E1 {

  /**
   * Sustituimos instrucciones con autobox a instrucciones sin autobox;
   * <ul>
   *   <li>Integer z = 44 -> Integer.valueOf(44);</li>
   *   <li>z++; -> z = Integer.valueOf(z.intValue() + 1);</li>
   * </ul>
   *
   */
  public static void main(String[] args) {
    // Sustituimos autobox box (Convertir literal integer a Objeto Integer)
    // Integer z = 44 (Con autobox)
    // Integer z = new Integer(44); // Con Constructor eliminado en java 9
    Integer z = Integer.valueOf(44); // Con método estático, válido a partir de java 9

    // Sustituimos autobox box/unbox
    // z++; (Con autobox)
    // Capturamos valor del objeto Integer a int, le sumamos 1
    // y usamos ese int para crear objeto Integer en misma variable
    z = Integer.valueOf(z.intValue() + 1);
    System.out.println(z);
  }
}
