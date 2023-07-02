package u8_b4_e1.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 * Con Path y Files de nio.file
 */
public class App {

  private static String spacesSubfolder = "  ";

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
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
          System.out.println("\nRuta absoluta del directorio padre:");
          System.out.println(ruta.getParent().toAbsolutePath() + "/");
          System.out.println();

          // Preparamos regex como predicate para eliminar archivo vacío
          System.out.println(ruta.getFileName() + "/");

          // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
          Files
            .walk(ruta, 1) // Capturamos las rutas internas, incluyendo el padre
            .skip(1) // Eliminamos 1º archivo, por ser la ruta del directorio
            .map(p -> addDesc(p)) // Le añadimos / a los directorios
            .forEach(s -> System.out.println(spacesSubfolder + s)); // Mostramos en consola cada ruta
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
