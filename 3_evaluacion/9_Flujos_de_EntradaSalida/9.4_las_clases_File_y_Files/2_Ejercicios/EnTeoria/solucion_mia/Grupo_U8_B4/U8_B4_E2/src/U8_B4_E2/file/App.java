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
        String[] contenidoMiruta = f.list();

        // Mostramos datos internos en consola
        for (String item : contenidoMiruta) {
          // Guardamos archivo
          File fint = new File(item);

          // Ponemos nombre con ruta relativa
          System.out.print("./" + item);

          // Si es dir añadimos / al final
          if (fint.isDirectory()) {
            System.out.print("/");
          }

          System.out.println();
        }
      } else {
        System.out.println("Archivo " + f.getName() + " no es un directorio");
      }
    } else {
      System.out.println("Archivo " + f.getName() + " no existe");
    }
  }

  static void listarDirectorio(File[] fs, String tabs) {
    for (int i = 0; i < fs.length; i++) {
      if (fs[i].isDirectory()) {
        System.out.print(fs[i].getName() + "/");
        tabs += "\t";
        listarDirectorio(fs[i].listFiles(), tabs);
        tabs = "";
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
