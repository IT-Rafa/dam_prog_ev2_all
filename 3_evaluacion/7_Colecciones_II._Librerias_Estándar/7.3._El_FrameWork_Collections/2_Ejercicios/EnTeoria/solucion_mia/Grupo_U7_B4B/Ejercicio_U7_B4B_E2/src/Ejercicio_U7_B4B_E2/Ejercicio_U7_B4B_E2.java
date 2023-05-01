package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

public class Ejercicio_U7_B4B_E2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MenuItem nuevoArchivo = new MenuItem("Nuevo archivo", sc);
    MenuItem abrirArchivo = new MenuItem("Abrir archivo", sc);
    MenuItem guardarArchivo = new MenuItem("Guardar archivo", sc);

    Menu archivo = new Menu("archivo", sc);

    archivo.addMenu(nuevoArchivo);
    archivo.addMenu(abrirArchivo);
    archivo.addMenu(guardarArchivo);

    MenuItem copiar = new MenuItem("copiar", sc);
    MenuItem pegar = new MenuItem("pegar", sc);

    Menu editar = new Menu("Editar", sc);

    editar.addMenu(copiar);
    editar.addMenu(pegar);

    Menu MiMenu = new Menu("mi editor", sc);

    MiMenu.addMenu(archivo);
    MiMenu.addMenu(editar);

    MiMenu.ejecutar();
  }
}
