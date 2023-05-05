package Ejercicio_U6_B1_E3;

/**
 * Clase que contiene el main del Ejercicio_U6_B1_E2
 */
public class Ejercicio_U6_B1_E3 {

  /**
   * Añadimos comentarios en el programa del enunciado.<p>
   * Las instrucciones producen el mismo resultado por el autobox.<p>
   * Cuando se guarda el objeto Double (Double.valueOf(s);) en una varible double
   * (double d;) activa el autobox en modo unbox
   */
  public static void main(String[] args) {
    // Crea String con forma de double
    String s = "1234.5678";
    // Prepara variable primitiva double
    double d;
    // Crea un objeto Double con el string y saca el primitivo guardado
    // y lo graba en d
    d = Double.valueOf(s).doubleValue();
    // Imprime primitivo d
    System.out.println("d con Double.valueOf(s).doubleValue(): " + d);

    // Crea objeto Double con el string.
    // Al guardarlo en variable primitiva double,
    // usa el autobox (tipo unbox) para convertirlo en double
    d = Double.valueOf(s);

    // Imprime primitivo d
    System.out.println("d con Double.valueOf(s): " + d);
  }
}
