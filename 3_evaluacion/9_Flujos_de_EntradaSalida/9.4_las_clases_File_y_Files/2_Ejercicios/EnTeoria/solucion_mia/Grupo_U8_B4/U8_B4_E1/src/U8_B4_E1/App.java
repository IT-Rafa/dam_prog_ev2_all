package U8_B4_E1;

import java.io.File;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
   */
  public static void main(String[] args) {
    if (args.length > 0) {
      File f = new File("/");

      String[] contenidoMiruta = f.list();
      for (String item : contenidoMiruta) {
        System.out.println(item);
      }
    } else {
      System.out.println("Falta el directorio");
    }
  }
}
