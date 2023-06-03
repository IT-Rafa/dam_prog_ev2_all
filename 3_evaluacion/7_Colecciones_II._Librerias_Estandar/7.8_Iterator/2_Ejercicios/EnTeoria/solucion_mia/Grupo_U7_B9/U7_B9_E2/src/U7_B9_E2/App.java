package U7_B9_E2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejercicio U7_B9_E2: <p>
 * Añade código iterator para que a pase a contener sólo números
 * impares
 */
public class App {

  public static void main(String[] args) throws Exception {
    List<Integer> a = new LinkedList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);
    a.add(6);
    a.add(7);
    a.add(8);
    a.add(9);
    System.out.println(a);

    //añadir aquí código
    Iterator<Integer> it_a = a.iterator();
    while (it_a.hasNext()) {
      Integer n = it_a.next();
      if (n % 2 == 0) {
        it_a.remove();
      }
    }
    System.out.println(a);
  }
}
