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
    System.out.println();

    if (f.exists()) {
      if (f.isDirectory()) {
        System.out.println("Ruta absoluta:\n" + f.getAbsoluteFile() + "/\n");
        listarDirectorio(f.listFiles(), "");
      } else {
        System.out.println(
          "El archivo: " + f.getName() + " existe, pero no es un directorio"
        );
      }
    } else {
      System.out.println("El archivo " + f.getName() + " no existe");
    }
  }

  static void listarDirectorio(File[] fs, String tabs) {
    for (int i = 0; i < fs.length; i++) {
      if (fs[i].isDirectory()) {
        System.out.print(fs[i].getName() + "/");
        tabs += "\t";
        listarDirectorio(fs[i].listFiles(), tabs);
        tabs = "";
        System.out.println();
      } else {
        System.out.println("\t" + fs[i].getName());
      }
    }
  }

  public static String relative(final File base, final File file) {
    final int rootLength = base.getAbsolutePath().length();
    final String absFileName = file.getAbsolutePath();
    final String relFileName = absFileName.substring(rootLength + 1);
    return relFileName;
  }
}
