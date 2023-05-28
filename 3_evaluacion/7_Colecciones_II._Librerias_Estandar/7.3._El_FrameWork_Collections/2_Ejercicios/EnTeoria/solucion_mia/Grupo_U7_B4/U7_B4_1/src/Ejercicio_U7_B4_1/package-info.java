/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U7_B4_1:</h3><p>
 * Haz el ejercicio anterior con ArrayList.<p>
 * <pre>
public class App{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>(); // Declaración y creación del LinkedList de enteros.
        ll.add(1); // Añade un elemento al final de la lista.
        ll.add(3); // Añade otro elemento al final de la lista.
        System.out.println("Después de añadir 1 y 3:" +ll);
        ll.add(1,2); // Añade en la posición 1 el elemento 2.
        System.out.println("Después de añadir en la posición 1 el elemento 2:" +ll);
        ll.add(ll.get(1)+ll.get(2)); // Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.
        System.out.println("Suma los valores contenidos en la posición 1 y 2, y lo agrega al final.:" +ll);
        ll.remove(0); // Elimina el primer elemento de la lista.
        System.out.println("Eliminado el primer elemento de la lista anterior:" +ll);
    }
}
 * </pre>
 * Y opina:<p>
 * <ul>
 *  <li>¿LinkedList mejor o peor que ArrayList?</li>
 *  <li>A la vista de lo fácil que es trabajar con ArrayList, 
 * ¿crees que merece la pena usar arrays tradicionales?</li>
 * </ul>
 * 
 */
package Ejercicio_U7_B4_1;
