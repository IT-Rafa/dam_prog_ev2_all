package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

public class Ejercicio_U7_B4B_E2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MenuItem nuevoarchivo = new MenuItem("Nuevo archivo", sc);
    MenuItem abrirarchivo = new MenuItem("Abrir archivo", sc);
    MenuItem guardararchivo = new MenuItem("Guardar archivo", sc);
    Menu archivo = new Menu("archivo", sc);
    archivo.addMenu(nuevoarchivo);
    archivo.addMenu(abrirarchivo);
    archivo.addMenu(guardararchivo);
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
