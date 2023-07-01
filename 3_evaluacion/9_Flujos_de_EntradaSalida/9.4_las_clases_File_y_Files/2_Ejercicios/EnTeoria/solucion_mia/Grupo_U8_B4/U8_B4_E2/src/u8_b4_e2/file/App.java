package u8_b4_e2.file;

import java.io.File;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E2<p>
 * Mostrar archivos y directorios de una carpeta y sus carpetas
 * internas, usando java.io.File
 */
public class App {

  private static String spacesSubfolder = "  ";

  /**
   * Ejecutable Ejercicio U8_B4_E2<p>
   * Si se introduce argumento, se intenta leer ese. Si no, usamos
   * el directorio actual
   * <ul>
   *    <li>Ejecutado en IDE es la carpeta del proyecto.</li>
   *    <li>Ejecutado en consola es la carpeta donde se está ahora mismo</li>
   * </ul>
   * Mostramos carpetas con '/' al final, y luego ficheros
   *
   */
  public static void main(String[] args) {
    // Guardamos ruta absoluta del directorio actual
    File f = new File(".").getAbsoluteFile();
    // Si se introdució un argumento, se usa ese
    //
    if (args.length == 1) {
      f = new File(args[0]).getAbsoluteFile();
    }
    System.out.println(f);
    if (f.exists()) {
      if (f.isDirectory()) {
        System.out.println("\nRuta absoluta del directorio padre:");
        System.out.println(f.getParentFile().getAbsolutePath() + "/");
        System.out.println();
        listarDirectorio(f, "");
      } else {
        System.out.println("no dir");
      }
    } else {
      System.out.println("no exist");
    }
  }

  public static void listarDirectorio(File file, String tabs) {
    if (file.exists()) {
      System.out.println(tabs + file.getName() + "/");

      File[] intFiles = file.listFiles();
      for (File intF : intFiles) {
        if (intF.isDirectory()) {
          listarDirectorio(intF, tabs + spacesSubfolder);
        }
      }
      for (File intF : intFiles) {
        if (!intF.isDirectory()) {
          System.out.println(tabs + spacesSubfolder + intF.getName());
        }
      }
    } else {
      System.out.println("no existe");
    }
  }
}
