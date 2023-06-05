/**
 * Lista clases para ejercicio: <p>
 * <h3>Ejercicio U7_B6B_E3:</h3>
 * Escribe la clase Enfermo para que funcione el siguiente main
 * <pre>
import java.util.PriorityQueue;
public class App {
    public static void main(String args[]) {
        PriorityQueue<Enfermo> enfermos= new PriorityQueue<>();
        enfermos.add(new Enfermo("Cristina",2));
        enfermos.add(new Enfermo("Juan",1));
        enfermos.add(new Enfermo("Ana",3));
        enfermos.add(new Enfermo("Oscar",3));
        System.out.println("");
        
        Enfermo e=enfermos.poll();
        
        while(e!=null){
            System.out.println(e);
            e=enfermos.poll();
        }
    }
}
 * </pre>
 */
package U7_B6B_E3;
