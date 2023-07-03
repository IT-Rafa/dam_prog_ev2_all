package U8_B4_E4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E4<p>
 */
public class App {

  /**
   * Espacios usados para separar el contenido interno
   */
  private static String spacesSubfolder = "  ";

  /**
   * Ejecutable Ejercicio U8_B4_E4<p>
   */
  public static void main(String[] args) {
    // Almacenamos la ruta

    // Creamos la variable Path con ruta carpeta actual
    Path ruta = Paths.get("").toAbsolutePath();

    // Si se introdució un argumento, se usa ese
    if (args.length == 1) {
      ruta = Paths.get(args[0]);
    }

    // Si fichero existe
    if (Files.exists(ruta)) {
      if (Files.isDirectory(ruta)) {
        try {
          System.out.println();
          System.out.println(
            "Solo archivos internos del directorio (recursivo sin ordenar): "
          );
          System.out.println("\nRuta absoluta del directorio padre:");
          System.out.println(ruta.getParent().toAbsolutePath() + "/");
          System.out.println();

          // Preparamos regex como predicate para eliminar archivo vacío
          System.out.println("Solo archivos de este directorio: ");

          System.out.println(ruta.getFileName() + "/");

          // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
          Files
            .walk(ruta, 1) // Capturamos las rutas internas, incluyendo el padre
            .filter(path -> !Files.isDirectory(path)) // no directorios
            // convertimos a String. Path tiene un método endsWith, pero solo sirve para rutas
            // de archivo. s.endsWith("Notas.txt"), siendo s de tipo Path, devueve la ruta del
            // archivo Notas.txt
            .map(p -> String.valueOf(p.getFileName())) // Convertimos ruta archivo a su nombre basico como String
            .filter(s -> s.endsWith(".txt")) // Filtramos por extensión de archivo
            // añadimos espacio e imprimimos
            .forEach(s -> System.out.println(spacesSubfolder + s));
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
}
