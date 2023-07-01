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
   * Ejecutable Ejercicio U8_B4_E2<p>
   */
  public static void main(String[] args) {
    // Creamos la variable Path con ruta archivo
    Path ruta = Paths.get("");

    if (args.length > 0) {
      // Si hay argumentos, los usamos;
      ruta = Paths.get(args[0]);
    } else { // Si no hay argumentos, mostramos datos defecto;
      ruta = Paths.get("");
    }
    // Si fichero existe
    if (Files.exists(ruta)) {
      try {
        // Sacamos ruta. Mostramos datos ruta en consola (solo nombres archivos/directorios)
        Files.walk(ruta, 2).forEach(s -> System.out.println(s));
      } catch (java.io.UncheckedIOException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
