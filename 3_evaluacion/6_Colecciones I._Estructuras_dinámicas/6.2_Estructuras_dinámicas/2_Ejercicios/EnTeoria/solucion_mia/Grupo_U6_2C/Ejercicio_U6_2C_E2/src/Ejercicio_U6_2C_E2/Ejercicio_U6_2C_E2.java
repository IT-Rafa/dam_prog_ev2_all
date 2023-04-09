package Ejercicio_U6_2C_E2;
/**
 * Clase que contiene el main del Ejercicio_U6_2C_E2
 */
public class Ejercicio_U6_2C_E2 {
/**
 * Creamos arbol, insertamos datos, los mostramos 
 * y buscamos número que no existe y otro que sí
 */
  public static void main(String args[]) {
    Arbol arbol = new Arbol();
    arbol.insertar(10);
    arbol.insertar(20);
    arbol.insertar(8);
    arbol.insertar(15);
    arbol.insertar(26);
    arbol.insertar(19);
    arbol.insertar(17);
    arbol.insertar(4);

    arbol.recorridoInOrden();
    System.out.println();
    System.out.println("\nExiste el valor " + 3 + "?: " + arbol.existe(3));
    System.out.println("\nExiste el valor " + 19 + "?: " + arbol.existe(19));
  }
}
