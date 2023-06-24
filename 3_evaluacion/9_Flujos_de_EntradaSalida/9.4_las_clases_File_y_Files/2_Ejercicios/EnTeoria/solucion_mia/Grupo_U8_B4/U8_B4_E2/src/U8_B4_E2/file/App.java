package U8_B4_E2.file;

import java.io.File;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E2<p>
 * Con File de io
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E2<p>
   */
  public static void main(String[] args) {
    // Creamos la variable File con ruta archivo
    File f = new File("");

    if (args.length > 0) {
      // Si hay argumentos, los usamos;
      f = new File(args[0]);
    }

    if (f.exists()) {
      if (!f.isDirectory()) {
        System.out.println("El directorio NO existe");
      } else {
        listarDirectorio(f);
      }
    }
  }

  static void listarDirectorio(File f) {
    System.out.println(f.getAbsoluteFile());
    if (f.isDirectory()) {
      for (String s : f.list()) {
        listarDirectorio(new File(f.getAbsolutePath() + "/" + s));
      }
    }
  }
}
