package u8_b4_e1.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.regex.Pattern;

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
      if (Files.isDirectory(ruta)) {
        try {
          System.out.println(
            "\nRuta Absoluta de la carpeta:\n" + ruta.toAbsolutePath() + "\n"
          );
          // Preparamos regex como predicate para eliminar archivo vacío
          Predicate<String> nameEmpty = Pattern
            .compile("^\\./" + ruta + "/?$")
            .asPredicate()
            .negate();

          // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
          Files
            .walk(ruta, 1) // Capturamos las rutas internas, incluyendo el padre
            .map(p -> addDesc(p)) // Convertimos a String como relativa, con / en dir
            .filter(nameEmpty) // Eliminamos los archivos vacíos (el dir padre)
            .forEach(s -> System.out.println(s)); // Mostramos en consola cada ruta
        } catch (IOException e) {
          e.printStackTrace();
        }
      } else {
        System.out.println("Archivo " + ruta + " no es un directorio");
      }
    } else {
      System.out.println("Archivo " + ruta + " no existe");
    }
  }

  /**
   * Convertimos Path a String como ruta relativa, con / en dir
   */
  private static String addDesc(Path ruta) {
    String result = "./";
    if (Files.exists(ruta)) {
      result += ruta.getFileName();
      if (Files.isDirectory(ruta)) {
        result += "/";
      }
    }

    return result;
  }
}
