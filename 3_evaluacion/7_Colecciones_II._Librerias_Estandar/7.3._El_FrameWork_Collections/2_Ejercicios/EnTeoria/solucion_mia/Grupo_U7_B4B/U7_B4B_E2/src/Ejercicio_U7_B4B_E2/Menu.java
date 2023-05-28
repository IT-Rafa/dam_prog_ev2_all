package Ejercicio_U7_B4B_E2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Es el objeto pare el menú que puede contener otros menús
 * <p>
 * Se le añade la opción Salir al final
 * <p>
 * En el Patrón Composite, es la parte composite o compuesta
 */
public class Menu extends ComponenteMenu {

  // ATTRIBUTES
  /**
   * Conjunto de objetos guardados
   */
  private List<ComponenteMenu> contenido = new ArrayList<>();

  /**
   * Constructor del Menu que pide el nombre y el Scanner que usará
   * <p>
   * Crea opción Salir al final del menú
   *
   * @param name Nombre del Nodo
   * @param sc   Scanner que usará este Nodo
   */
  Menu(String name, Scanner sc) {
    super(name, sc);
  }

  // METHODS
  /**
   * Permite añadir nuevos menús a la colección del nodo
   * <p>
   * Recrea opción Salir al final del menú
   *
   * @param nuevoArchivo objeto para añadir al menú de este nodo
   */
  public void addMenu(ComponenteMenu nuevoArchivo) {
    this.contenido.add(nuevoArchivo);
    nuevoArchivo.setPadre(this);
  }

  /**
   * Ejecuta las ordenes del menú:
   * <ul>
   * <li>Imprimir las opciones</li>
   * <li>Permitir al usuario elegir una opción</li>
   * <li>Ejecutar la operación</li>
   * </ul>
   */
  @Override
  void ejecutar() {
    // Imprimir las opciones
    showSubmenu();

    // que el usuario escoja una opción. restamos 1 porque para evitar 0 en menú
    int opElegida = askOp();
    opElegida--;

    // lanzar la ejecución de la opción escogida
    ejecutarPorOp(opElegida);
  }

  /**
   * Según la opción elegida, decide que hacer
   *
   * @param opElegida Opción que marco el usuario
   */
  private void ejecutarPorOp(int opElegida) {
    // Eliminamos opción salir
    this.contenido.remove(contenido.size() - 1);

    //
    if (opElegida == contenido.size()) {
      // Si es la última opción (Salir) ya eliminada
      if (getPadre() == null) {
        // Si no tiene padre, debe ser el menú principal y finaliza programa
        System.out.println("Chao");
      } else {
        // Si tiene padre, volvemos a mostrarlo
        getPadre().ejecutar();
      }
    } else {
      // En cualquier otro caso, ejecutamos la opción elegida
      contenido.get(opElegida).ejecutar();
    }
  }

  /**
   * Mostrar las opciones del menú
   *
   */
  private void showSubmenu() {
    // Añadimos opción salir al menú
    String nombreSalir;
    if (this.getPadre() == null) {
      nombreSalir = "salir sin padre";
    } else {
      nombreSalir = "salir con padre";
    }
    ComponenteMenu salir = new MenuItem(nombreSalir, this.getScanner());
    this.contenido.add(salir);

    // Mostramos título menú
    String title = "\nMenú " + this.getNombre();
    System.out.println(title);

    // Mostramos subrayado según titulo y Menu
    for (int i = 0; i < title.length(); i++) {
      System.out.print("*");
    }
    System.out.println();

    // Mostramos elementos del menu con número de opción
    int menuIndex = 1;
    for (ComponenteMenu submenu : contenido) {
      System.out.println(menuIndex + ": " + submenu.getNombre());
      menuIndex++;
    }
  }

  /**
   * Pide la opción, comrueba que sea correcta y la devuelve
   *
   * @return Devuelve la opción elegida del usuario
   */
  private int askOp() {
    int op = 0;
    // Repetimos hasta que sea correcta
    while (true) {
      // Pedimos la opción
      System.out.print("Teclea número opcion: ");
      // Usamos NextLine para que no queden restos en Scanner
      if (getScanner().hasNextLine()) {
        // Convertimos a integer
        op = Integer.parseInt(getScanner().nextLine());
      }

      // Comprobamos que esté dentro del rango de opciones
      if (op >= 1 && op <= contenido.size()) {
        // es válida y finalizamos bucle
        break;
      } else {
        // No válida; avisamos, mostramos menú y repetimos bucle para pedir
        System.out.println("Opción no válida. Repetimos");
        showSubmenu();
      }
    }
    // Devolvemos la opción
    return op;
  }
}
