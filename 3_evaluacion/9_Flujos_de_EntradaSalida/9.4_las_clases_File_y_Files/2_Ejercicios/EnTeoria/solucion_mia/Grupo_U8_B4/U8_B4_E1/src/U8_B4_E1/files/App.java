package U8_B4_E1.files;

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
    if (Files.exists(ruta) && Files.isDirectory(ruta)) {
      try {
        System.out.println(
          "\nArchivos en directorio:\n" + ruta.toAbsolutePath() + "\n"
        );

        // Preparamos regex como predicate para eliminar archivo vacío
        Predicate<String> nameEmpty = Pattern
          .compile("^\\[d\\] " + ruta + "$")
          .asPredicate()
          .negate();

        // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
        Files
          .walk(ruta, 1) // Capturamos las rutas, solo la de este archivo
          .map(p -> addDesc(p)) // Le añadimos descripción del archivo (archivo, dir, oculto)
          .filter(nameEmpty) // Eliminamos los archivos vacíos (si es el de defecto)
          .forEach(s -> System.out.println(s)); // Mostramos en consola cada ruta
      } catch (IOException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("Directorio \"" + ruta + "\" no existe");
    }
  }

  private static String addDesc(Path p) {
    String result = "[";
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
        result += "] " + p.getFileName();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return result;
  }
}
