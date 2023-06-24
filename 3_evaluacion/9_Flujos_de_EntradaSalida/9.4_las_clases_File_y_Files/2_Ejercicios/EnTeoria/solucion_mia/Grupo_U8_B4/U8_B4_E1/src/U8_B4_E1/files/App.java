package U8_B4_E1.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 * Con Path y Files de nio.file
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
   */
  public static void main(String[] args) {
    // Creamos la variable Path con ruta carpeta actual
    Path ruta = Paths.get("");

    // Si hay argumentos, los usamos;
    if (args.length > 0) {
      ruta = Paths.get(args[0]);
    }

    // Si fichero existe
    if (Files.exists(ruta)) {
      try {
        // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
        Files
          .walk(ruta, 1)
          .filter(p -> p.getFileName().toString() != "")
          .map(p -> addDesc(p))
          .forEach(s -> System.out.println(s));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static String addDesc(Path p) {
    String result = "(";
    try {
      if (Files.exists(p)) {
        if (Files.isDirectory(p)) {
          result += "d";
        } else if (Files.isRegularFile(p)) {
          result += "f";
        }
        if (Files.isHidden(p)) {
          result += "h";
        }
        result += ") " + p.getFileName();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return result;
  }
}
