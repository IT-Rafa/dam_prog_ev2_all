package u8_b4_e2.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E2<p>
 * Con Path y Files de nio.file
 */
public class App {

  /**
   * Espacios usados para separar el contenido interno
   */
  private static String spacesSubfolder = "  ";

  /**
   * Ejecutable Ejercicio U8_B4_E2<p>
   * Si se introduce argumento, se intenta leer ese. Si no, usamos
   * el directorio actual.
   * <p>
   * En este caso mostramos tal cual salen en el Stream de Files.walk,
   * sin organizar la salida, ya que cuadra mas con el enunciado que
   * indica que no se modifica walk.
   *
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
            "Contenido interno del directorio (recursivo sin ordenar): "
          );
          System.out.println("\nRuta absoluta del directorio padre:");
          System.out.println(ruta.getParent().toAbsolutePath() + "/");
          System.out.println();

          // Preparamos regex como predicate para eliminar archivo vacío
          System.out.println(ruta.getFileName() + "/");

          // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
          Files
            .walk(ruta) // Capturamos las rutas internas, incluyendo el padre
            .skip(1) // Eliminamos 1º archivo, por ser la ruta del directorio
            .map(p -> addDesc(p)) // Le añadimos / a los directorios
            // Mostramos en consola cada ruta
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

  /**
   * Convertimos Path a String como ruta relativa, con / en dir
   */
  private static String addDesc(Path ruta) {
    String result = "";
    if (Files.exists(ruta)) {
      result += ruta.getFileName();
      if (Files.isDirectory(ruta)) {
        result += "/";
      }
    }

    return result;
  }
}
