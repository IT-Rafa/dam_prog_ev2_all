package u8_b4_e1.file;

import java.io.File;
import java.io.FileFilter;

/**
 * Clase con ejecutable de Ejercicio U8_B4_E1<p>
 * Mostrar archivos y directorios de una carpeta usando java.io.File
 */
public class App {

  /**
   * Espacios usados para separar el contenido interno
   */
  private static String spacesSubfolder = "  ";

  /**
   * Ejecutable Ejercicio U8_B4_E1<p>
   */
  public static void main(String[] args) {
    // Almacenamos la ruta
    // Guardamos ruta absoluta del directorio actual
    File f = new File(".").getAbsoluteFile().getParentFile();

    // Si se introdució un argumento, se usa ese
    if (args.length == 1) {
      f = new File(args[0]).getAbsoluteFile();
    }

    // si archivo existe
    if (f.exists()) {
      // y si es un directorio, lo mostramos con sus datos internos
      if (f.isDirectory()) {
        System.out.println();
        System.out.println("Contenido interno del directorio (no recursivo): ");
        // Mostramos la ruta absoluta del padre
        System.out.println("\nRuta absoluta del directorio padre:");
        System.out.println(f.getParentFile().getAbsolutePath() + "/");
        System.out.println();

        // Mostramos en nombre del directorio a mostrar
        System.out.println(f.getName() + "/");

        // Preparamos FileFilter para solo carpetas y solo archivos
        FileFilter folderFilter = file -> {
          return file.isDirectory();
        };
        FileFilter fileFilter = file -> {
          return !file.isDirectory();
        };

        // Creamos lista de archivos internos, filtrados por carpetas
        for (File intF : f.listFiles(folderFilter)) {
          // los mostramos con espacio por ser subdirectorio y
          // al final, para mostrar que es una carpeta
          System.out.println(spacesSubfolder + intF.getName() + "/");
        }

        // Creamos lista de archivos internos, filtrados por no carpetas
        for (File intF : f.listFiles(fileFilter)) {
          // los mostramos con espacio por ser archivos internos
          System.out.println(spacesSubfolder + intF.getName());
        }
      } else {
        System.out.println("no dir");
      }
    } else {
      System.out.println("no exist");
    }
  }
}
