package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

/**
 * Es el objeto pare el menú Hijo<p>
 * En el Patrón Composite, es la parte Leaf o hoja
 */
public class MenuItem extends ComponenteMenu {

  // CONSTRUCTORS
  /**
   *
   */
  MenuItem(String name, Scanner sc) {
    super(name, sc);
  }

  // METHODS
  @Override
  void ejecutar() {
    if (this.getPadre() != null) {
      System.out.println("ejecutando cosas de " + this.getNombre());
      System.out.print("pulsa RETURN para regresar a menú anterior");
      getScanner().nextLine();
      getScanner().nextLine();
      this.getPadre().ejecutar();
    }
  }
}
