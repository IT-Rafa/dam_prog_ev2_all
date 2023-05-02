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
        // Eliminamos submenu salir del final
        if (contenido.size() > 0) {
            contenido.remove(contenido.size() - 1);
        }
        // Añadimos el nuevo submenu y le ponemos el padre
        this.contenido.add(nuevoArchivo);
        nuevoArchivo.setPadre(this);
        // this no tiene padre, pero en anteriores addMenu, en linea anterior deberia

        // Añadimos submenu salir al final
        String padreSalir;
        if (this.getPadre() == null) {
            padreSalir = "Fin programa";
        } else {
            padreSalir = "Volver al menú " + this.getPadre().getNombre();
        }
        ComponenteMenu salir = new MenuItem(
                padreSalir,
                this.getScanner());
        salir.setPadre(this);
        this.contenido.add(salir);
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

        // que el usuario escoja una opción
        int opElegida = askOp();
        opElegida--;

        // lanzar la ejecución de la opción escogida
        if (opElegida == contenido.size() - 1) {
            if (getPadre() == null) {
                System.out.println("Chao");
            } else {
                getPadre().ejecutar();
            }
        } else {
            contenido.get(opElegida).ejecutar();
        }
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
                op = Integer.parseInt(getScanner().nextLine());
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
