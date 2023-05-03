package UnaDolaTela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicios de interface list
 * y queue en coderunner: Pregunta 4
 */
public class App {

  /**
   * Pasos a seguir
   * <ul>
   * <li>Pedimos usuario cantidad de casos de prueba</li>
   * <li>Por cada caso:
   * <ul>
   * <li>Pedimos usuario una línea con:
   * <ul>
   * <li>Nombres (sin espacios y ancho nombre menor que 25)(max nombres = 50),
   * finalizando lista con 'F'</li>
   * <li>Entero para camas disponibles</li>
   * <li>Cantidad de letras de la canción ( Mayor que 0)</li>
   * </ul>
   * <li>Mostrar lista nombres de personas que duermen en camas
   * <ul>
   * <li>Mostrar en mismo orden</li>
   * <li>Si todos tienen cama, en vez de lista, mostrar "TODOS TIENEN CAMA"</li>
   * <li>Si nadie tiene cama, en vez de lista, mostrar "NADIE TIENE CAMA"</li>
   * </ul>
   * </li>
   * </ul>
   * </li>
   * </ul>
   */
  public static void main(String[] args) {
    // Entrada
    // 4 (Cuatro casos)
    // Anastasio Ignacio Felipe Borja Daniel Cesar F 2 3 (Personas=6 Camas=2
    // letrasCanc=3)
    // Javier Ramiro Luis Rosa Carmen Paola Josefa F 0 3 (Personas=7 Camas=0
    // letrasCanc=3)
    // Petra Santiago Pepi F 2 20 (Personas=3 Camas=2 letrasCanc=20)
    // Merche Juanjo Miriam Pilar Marina Ovidio Rafael Eustaquio F 4 7 (Personas=8
    // Camas=4 letrasCanc=7)

    Scanner sc = new Scanner(System.in);
    String input1 = sc.nextLine();
    int casos = Integer.parseInt(input1);
    for (int casoInd = 0; casoInd < casos; casoInd++) {
      // Cogemos datos del caso
      String[] datos = sc.nextLine().split(" ");

      // Buscamos el fin de la línea
      int index = 0;
      for (index = 0; index < datos.length; index++) {
        if (datos[index].equals("F")) {
          break;
        }
      }
      // Lista total de personas que quieren cama
      String[] listaTotal = Arrays.copyOfRange(datos, 0, index);

      // Lista de personas que están pendientes de una cama
      List<String> listaPendientes = new ArrayList<>();
      for (int i = 0; i < listaTotal.length; i++) {
        listaPendientes.add(listaTotal[i]);
      }

      // Cantidad de letras que tiene la canción
      int letras = Integer.parseInt(datos[datos.length - 1]);

      // Cantidad de Camas que existen
      int camas = Integer.parseInt(datos[datos.length - 2]);

      // Cantidad de personajes que quieren cama
      // Empezando desde el primero, o el que quede despues de hechar a
      // alguien. por cada letra de la canción, se pasa a uno. Cuando llegue
      // el final de la canción (Se pueden repetir personajes), se elimina al
      // marcado,
      int marcado = 0;

      if (listaPendientes.size() <= camas) {
        System.out.println("TODOS TIENEN CAMA");
      } else if (camas < 1 && listaPendientes.size() >= 1) {
        // No hay camas y, alguien quiere cama
        System.out.println("NADIE TIENE CAMA");
      } else {
        while (camas-- != 0) {
          // Comprobamos si hay camas para los que quedan o ya no queda nadie esperando
          if (listaPendientes.size() <= camas || listaPendientes.size() == 0) {
            break;
          }
          // Se canta la canción, señalando al marcado, y avanzamos letras y personas
          for (int i = 0; i < letras; i++) {
            marcado++;
            if (marcado == listaPendientes.size() - 1) {
              marcado = 0;
            }
          }
          // Al final de la canción, se marco a uno, y lo eliminamos
          // listaPendientes.remove(marcado);
          System.out.println("Eliminado: " + listaPendientes.remove(marcado));
        }
      }
      for (String personajeEnCama : listaPendientes) {
        System.out.println(personajeEnCama);
      }
    }

    sc.close();
  }
}
