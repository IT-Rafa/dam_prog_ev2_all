package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

/**
 * Define el formato público de los objetos del menú valido para todos los objetos<p>
 * En el Patrón Composite, es la parte Component
 */

abstract class ComponenteMenu {

  // ATTRIBUTES
  /**
   * Objeto ComponentMenu padre de este objeto (sera de tipo Menu)
   */
  private ComponenteMenu padre;

  /**
   * Nombre del ComponentMenu
   */
  private String nombre;
  /**
   * Scanner object para ComponentMenu
   */
  private Scanner sc;

  // GETTER & SETTER
  /**
   * Devuelve el nombre
   *
   * @return Nombre del menu
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * Devuelve el scanner usado
   */
  protected Scanner getScanner() {
    return this.sc;
  }

  /**
   * Devuelve el padre del nodo
   */
  protected ComponenteMenu getPadre() {
    return this.padre;
  }

  /**
   * cambia el padre del nodo
   */
  protected void setPadre(ComponenteMenu padre) {
    this.padre = padre;
  }

  // CONSTRUCTORS
  /**
   * Constructor que pide el nombre del objeto y Scanner que usará
   */
  protected ComponenteMenu(String nombre, Scanner sc) {
    padre = null;
    this.nombre = nombre;
    this.sc = sc;
  }

  /**
   * Define lo que hace el menú
   */
  abstract void ejecutar();
}
