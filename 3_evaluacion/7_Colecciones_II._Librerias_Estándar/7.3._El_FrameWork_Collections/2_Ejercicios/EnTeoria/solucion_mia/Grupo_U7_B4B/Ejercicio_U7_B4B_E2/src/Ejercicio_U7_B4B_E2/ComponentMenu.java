package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

abstract class ComponenteMenu {

  protected ComponenteMenu padre;
  protected String nombre;
  Scanner sc;

  protected ComponenteMenu(String nombre, Scanner sc) {
    padre = null;
    this.nombre = nombre;
    this.sc = sc;
  }

  abstract void ejecutar();
}
