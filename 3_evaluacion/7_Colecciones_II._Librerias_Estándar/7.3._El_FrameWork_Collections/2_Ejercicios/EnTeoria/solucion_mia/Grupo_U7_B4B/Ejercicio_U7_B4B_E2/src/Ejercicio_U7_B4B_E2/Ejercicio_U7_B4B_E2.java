package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4B_E2
 */
public class Ejercicio_U7_B4B_E2 {

  /**
   * Creamos los Nodos Leaf de cada submenu (MenuItem),
   * creamos submenu (Menu) donde van y los añadimos<p>
   * Repetimos con todas los submenus.<p>
   * Creamos el objeto Menu principal, llamado MiMenu, y añadimos los submenus<P>
   * Finalmente ejecutamos MiMenu
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Creamos MenuItem (Leaf) de submenu Archivo
    MenuItem nuevoArchivo = new MenuItem("Nuevo archivo", sc);
    MenuItem abrirArchivo = new MenuItem("Abrir archivo", sc);
    MenuItem guardarArchivo = new MenuItem("Guardar archivo", sc);

    // Creamos Menu con nombre Archivo y añadimos los MenuItem creados
    Menu subMenuArchivo = new Menu("Archivo", sc);
    subMenuArchivo.addMenu(nuevoArchivo);
    subMenuArchivo.addMenu(abrirArchivo);
    subMenuArchivo.addMenu(guardarArchivo);

    // Creamos MenuItem (Leaf) de submenu Editar
    MenuItem copiar = new MenuItem("copiar", sc);
    MenuItem pegar = new MenuItem("pegar", sc);

    // Creamos Menu con nombre Archivo y añadimos los MenuItem creados
    Menu subMenuEditar = new Menu("Editar", sc);
    subMenuEditar.addMenu(copiar);
    subMenuEditar.addMenu(pegar);

    // Creamos Menu Principal (Menu) y le añadimos los submenus creados (Menu)
    Menu MiMenu = new Menu("mi editor", sc);
    MiMenu.addMenu(subMenuArchivo);
    MiMenu.addMenu(subMenuEditar);

    // Ejecutamos Menu principal
    MiMenu.ejecutar();
  }
}
