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
    // Creamos la variable File con ruta carpeta actual
    File f = new File("");

    if (args.length > 0) {
      // Si hay argumentos, los usamos;
      f = new File(args[0]);
    } else {
      f = new File(f.getAbsoluteFile().toString());
    }
    listarDirectorio(f);
  }

  static void listarDirectorio(File f) {
    if (f.isDirectory()) {
      System.out.println(f.getName() + "/");
      for (File fi : f.listFiles()) {
        listarDirectorio(fi);
      }
    } else {
      System.out.println("\t" + f.getName());
    }
  }

  public static String relative(final File base, final File file) {
    final int rootLength = base.getAbsolutePath().length();
    final String absFileName = file.getAbsolutePath();
    final String relFileName = absFileName.substring(rootLength + 1);
    return relFileName;
  }
}
