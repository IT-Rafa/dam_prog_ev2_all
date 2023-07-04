package U8_B4_E5;

import java.io.File;
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
    // Creamos archivo en el directorio:
    // /run/media/it-ra/Datos/source/dam/prog2/dam_prog_ev2_all/3_evaluacion/miZip.zip
    File f = new File("miZip.zip");
    if (f.exists()) {
      try (ZipFile zipFile = new ZipFile(f)) {
        zipFile
          .stream() // Creamos Stream de ZipEntry (representa cada archivo comprimido)
          // Ordenamos por tamaño del archivo
          .sorted((zpe1, zpe2) -> (zpe1.getSize() < zpe2.getSize()) ? 1 : -1)
          // Mostramos los nombres y el tamaño de cada entrada
          .forEach(zpe ->
            System.out.println(zpe.getName() + " " + zpe.getSize())
          );
      } catch (Exception e) {
        System.out.println(e.getLocalizedMessage());
      }
    } else {
      System.out.println("Fichero no existe");
    }
  }
}
