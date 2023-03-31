/**
 * Ejercicio U6_B2A_E1:<p>
 * Escribe los métodos tamano() y obtener() para que funcione el
 * siguiente main()<p>
 * nota: podemos usar la ñ y llamar al método tamaño(). Sin problema 
 * con JDK pero puede fallar con algún plugin de ide<p>
 * <pre>

class App {
    public static void main(String[] args) {
        MiListaEnlazada miLista= new MiListaEnlazada();
        miLista.insertar(8);
        miLista.insertar(88);
        miLista.insertar(888);
        for(int i=0;i < miLista.tamano();i++){
            System.out.print(miLista.obtener(i)+" ");
        }
    }
}
 * </pre>
 */
public class Ejercicio_U6_B2A_E1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
