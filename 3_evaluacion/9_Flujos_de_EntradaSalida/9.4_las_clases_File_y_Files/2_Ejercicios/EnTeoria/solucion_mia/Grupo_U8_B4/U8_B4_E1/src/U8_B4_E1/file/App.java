package U8_B4_E1.file;

import java.io.File;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 * Con File de io
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
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

    if (f.exists()) {
      System.out.println(
        "\nArchivos en directorio:\n" + f.getAbsolutePath() + "\n"
      );
      // Capturamos ruta.
      String[] contenidoMiruta = f.list();

      // Mostramos datos en consola
      for (String item : contenidoMiruta) {
        File fint = new File(item);
        System.out.print("(");

        if (fint.isDirectory()) {
          System.out.print("d");
        } else if (fint.isFile()) {
          System.out.print("f");
        }
        if (fint.isHidden()) {
          System.out.print("h");
        }
        System.out.println(") " + item);
      }
    } else {
      System.out.println("Directorio \"" + f.getName() + "\" no existe");
    }
  }
}
