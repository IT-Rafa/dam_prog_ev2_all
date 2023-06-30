package test2;

import java.io.File;

public class App {

  public static void main(String[] args) throws Exception {
    //  9_Flujos_de_EntradaSalida
    File f = new File("9_Flujos_de_EntradaSalida/9.3_Ficheros_de_texto");

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
          listarDirectorio(intF, tabs + "    ");
        }
      }
      for (File intF : intFiles) {
        if (!intF.isDirectory()) {
          System.out.println(tabs + "    " + intF.getName());
        }
      }
    } else {
      System.out.println("no existe");
    }
  }

  public static String relative(File base, File file) {
    final int rootLength = base.getAbsolutePath().length();
    final String absFileName = file.getAbsolutePath();
    final String relFileName = absFileName.substring(rootLength + 1);
    return relFileName;
  }
}
