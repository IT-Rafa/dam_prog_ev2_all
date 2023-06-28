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
      // Si no almacenamos ruta absoluta
      f = new File(f.getAbsoluteFile().toString());
    }

    if (f.exists()) {
      if (f.isDirectory()) {
        // Mostramos ruta absoluta de este directorio
        System.out.println(
          "\nRuta Absoluta de la carpeta: \n" + f.getAbsolutePath() + "\n"
        );

        // Capturamos datos dentro directorio.
        listarDirectorio(f, "");
      } else {
        System.out.println("Archivo " + f.getName() + " no es un directorio");
      }
    } else {
      System.out.println("Archivo " + f.getName() + " no existe");
    }
  }

  static void listarDirectorio(File f, String dirs) {
    if (f.isDirectory()) {
      // Capturamos datos dentro directorio.
      File[] fInt = f.listFiles();
      for (int i = 0; i < fInt.length; i++) {
        if (fInt[i].isDirectory()) {
          dirs += fInt[i].getName() + "/";
          System.out.println(dirs);

          listarDirectorio(fInt[i], dirs);
        } else {
          //System.out.println(tabs + fInt[i].getName());
        }
        dirs = "";
      }
    } else {
      System.out.println(f.getName());
    }
  }

  public static String relative(final File base, final File file) {
    final int rootLength = base.getAbsolutePath().length();
    final String absFileName = file.getAbsolutePath();
    final String relFileName = absFileName.substring(rootLength + 1);
    return relFileName;
  }
}
