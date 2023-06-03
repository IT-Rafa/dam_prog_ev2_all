package U7_B9_E3;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejercicio U7_B9_E3:<p>
 * Modifica el siguiente ejemplo de forma que usando un iterador
 * realice los borrados correctamente, es decir, que elimine de
 * la colección aquellos elementos con la coordenada x o y menor de 15.
 */
public class App {

  public static void main(String[] args) throws Exception {
    ArrayList<Point> al = new ArrayList<>();

    al.add(new Point(2, 56));
    al.add(new Point(22, 56));
    al.add(new Point(32, 5));
    al.add(new Point(99, 99));
    System.out.println(al);
    System.out.println();

    Iterator<Point> it_al = al.iterator();
    while (it_al.hasNext()) {
      Point p = it_al.next();
      if (p.x < 15 || p.y < 15) {
        it_al.remove();
      }
    }
    System.out.println(al);
  }
}
