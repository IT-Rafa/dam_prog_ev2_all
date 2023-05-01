package Ejercicio_U7_B4B_E2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Es el objeto pare el menú que puede contener otros menús<p>
 * Se le añade la opción Salir al final<p>
 * En el Patrón Composite, es la parte composite o compuesta
 */
public class Menu extends ComponenteMenu {

  // ATTRIBUTES
  /**
   * Conjunto de objetos guardados
   */
  private List<ComponenteMenu> contenido = new ArrayList<>();

  /**
   * Constructor del Menu que pide el nombre y el Scanner que usará<p>
   * Crea opción Salir al final del menú
   *
   * @param name Nombre del Nodo
   * @param sc Scanner que usará este Nodo
   */
  Menu(String name, Scanner sc) {
    super(name, sc);
    MenuItem salir = new MenuItem("Salir Programa", sc);
    this.contenido.add(salir);
  }

  // METHODS
  /**
   * Permite añadir nuevos menús a la colección del nodo<p>
   * Recrea opción Salir al final del menú
   *
   * @param nuevoArchivo objeto para añadir al menú de este nodo
   */
  public void addMenu(ComponenteMenu nuevoArchivo) {
    // Eliminamos contenido final: Salir
    this.contenido.remove(contenido.get(contenido.size() - 1));
    nuevoArchivo.setPadre(this);
    this.contenido.add(nuevoArchivo);
    MenuItem salir;
    // Añadimos opción Salir al final
    if (this.getPadre() == null) {
      salir = new MenuItem("Salir Programa ", this.getScanner());
    } else {
      salir =
        new MenuItem(
          "Salir a " + this.getPadre().getNombre(),
          this.getScanner()
        );
      salir.setPadre(this);
    }
    this.contenido.add(salir);
  }

  /**
   * Ejecuta las ordenes del menú:
   * <ul>
   *    <li>Imprimir las opciones</li>
   *    <li>Permitir al usuario elegir una opción</li>
   *    <li>Ejecutar la operación</li>
   * </ul>
   */
  @Override
  void ejecutar() {
    // Imprimir las opciones
    showSubmenu();

    // que el usuario escoja una opción
    int opElegida = askOp();
    --opElegida;
    // lanzar la ejecución de la opción escogida
    contenido.get(opElegida).ejecutar();
  }

  /**
   * Mostrar las opciones del menú
   *
   */
  private void showSubmenu() {
    // Mostramos título menú
    String title = "\nMenú " + this.getNombre();
    System.out.println(title);

    // Mostramos subrayado según titulo y Menu
    for (int i = 0; i < title.length(); i++) {
      System.out.print("*");
    }
    System.out.println();

    // Mostramos elementos del menu
    int menuIndex = 1;
    for (ComponenteMenu submenu : contenido) {
      System.out.print(menuIndex + ": ");
      menuIndex++;
      System.out.println(submenu.getNombre());
    }
  }

  /**
   * Pide la opción, comrueba que sea correcta y la devuelve
   */
  private int askOp() {
    int op = 0;
    while (true) {
      System.out.print("Teclea número opcion: ");
      if (getScanner().hasNextLine()) {
        op = getScanner().nextInt();
      }

      if (op >= 1 && op <= contenido.size()) {
        break;
      } else {
        System.out.println("Opción no válida. Repetimos");
        showSubmenu();
      }
    }

    return op;
  }
}
