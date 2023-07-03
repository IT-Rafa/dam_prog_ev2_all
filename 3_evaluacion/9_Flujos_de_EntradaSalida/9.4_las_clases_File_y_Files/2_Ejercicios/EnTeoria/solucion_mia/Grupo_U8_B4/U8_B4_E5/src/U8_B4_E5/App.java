package U8_B4_E5;

import java.io.IOException;
import java.util.zip.ZipFile;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E5<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B4_E5<p>
   * @throws IOException
   */
  public static void main(String[] args) {
    try (ZipFile zipFile = new ZipFile("mizip.zip")) {
      zipFile
        .stream()
        .sorted((zpe1, zpe2) -> (zpe1.getSize() < zpe2.getSize()) ? 1 : -1)
        .forEach(zpe -> System.out.println(zpe.getName() + " " + zpe.getSize())
        );
    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());
    }
  }
}
