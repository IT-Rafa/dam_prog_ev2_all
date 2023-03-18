/**
 * Ejercicio U4_B11_E11<p>
 * Crea un array de 5 amigos de la clase Persona. 
 * <pre>
class Persona{
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
 * </pre>
 * Pide datos por teclado. Utiliza un bucle para recoger los datos 
 * y muestra los datos del array por pantalla.
 */
import java.util.Scanner;

public class Ejercicio_U4_B11_E11 {

  public static void main(String[] args) {
    Persona[] amigos = new Persona[5];
    Scanner sc = new Scanner(System.in);
    // Utiliza un bucle para recoger los dato
    for (int i = 0; i < 5; i++) {
        // Pide datos por teclado
      System.out.println("Cliente " + i);

      System.out.print("   Nombre: ");
      String nombre = sc.nextLine();
      System.out.print("   Edad: ");
      int edad = Integer.parseInt(sc.nextLine());

      amigos[i] = new Persona(nombre, edad);
    }
    // muestra los datos del array por pantalla
    for(Persona p: amigos){
        System.out.println("Nombre: " + p.nombre + "; Edad: " + p.edad);
    }
    sc.close();
  }
}

class Persona {

  String nombre;
  int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
}
