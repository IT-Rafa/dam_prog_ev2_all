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
        // User: "4"
        int casos = Integer.parseInt(input1);
        // casos = 4
        // Repetimos 0-3
        for (int casoInd = 0; casoInd < casos; casoInd++) {
            // Cogemos datos del caso
            String[] datos = sc.nextLine().split(" ");
            // datos = {"Anastasio", "Ignacio", "Felipe", "Borja", "Daniel", "Cesar", "F",
            // "2", "3"}
            // Buscamos el fin de la línea de nombres
            int index = 0;
            for (index = 0; index < datos.length; index++) {
                if (datos[index].equals("F")) {
                    break;
                }
            }
            // index = 6 -> datos[6] == "F"

            // Lista total de personas que quieren cama (0=principio_Incluido
            // index=final_NoIncluido)
            String[] listaTotal = Arrays.copyOfRange(datos, 0, index);
            // listaTotal = {"Anastasio", "Ignacio", "Felipe", "Borja", "Daniel", "Cesar"}

            // Lista de personas que están pendientes de una cama
            List<String> listaPendientes = new ArrayList<>();
            for (int i = 0; i < listaTotal.length; i++) {
                listaPendientes.add(listaTotal[i]);
            }
            // {"Anastasio", "Ignacio", "Felipe", "Borja", "Daniel","Cesar"}

            // Cantidad de Camas que existen
            int camas = Integer.parseInt(datos[index + 1]);
            // lista = datos[6+1] = "2" -> 2

            // Cantidad de letras que tiene la canción
            int palabras = Integer.parseInt(datos[index + 2]);
            // lista = datos[6+2] = "3" -> 3

            // Cantidad de personajes que quieren cama
            // Empezando desde el primero, o el que quede despues de hechar a
            // alguien. por cada letra de la canción, se pasa a uno. Cuando llegue
            // el final de la canción (Se pueden repetir personajes), se elimina al
            // marcado,

            if (listaPendientes.size() <= camas) {
                // 6 <= 2; NO
                System.out.println("TODOS TIENEN CAMA");
            } else if (camas <= 0 && listaPendientes.size() >= 1) {
                // No hay camas y, alguien quiere cama
                // camas <= 0 NO
                System.out.println("NADIE TIENE CAMA");
            } else {
                int marcado = -1;
                // Con estos datos: Camas=2 palabras=3
                // {"Anastasio", "Ignacio", "Felipe", "Borja", "Daniel","Cesar"}
                // Se eliminan por orden
                // 0 1 2
                // {"Anastasio", "Ignacio", "Felipe", "Borja", "Daniel","Cesar"} -> Felipe
                // 0 1 2
                // {"Anastasio", "Ignacio", "Borja", "Daniel","Cesar"} -> "Cesar"; pos_cesar es
                // última, pasamos a 0
                // 0 1 2
                // {"Anastasio", "Ignacio", "Borja", "Daniel"} -> Borja;
                // 1 2 0 (final, pasamos a 0)
                // {"Anastasio", "Ignacio", "Daniel"} -> Ignacio

                // Quedan {"Anastasio", "Daniel"}

                while (camas != listaPendientes.size()) {
                    // Se canta la canción, señalando al marcado, y avanzamos letras y personas
                    // Si superamos personas, volvemos al inicio
                    for (int i = 0; i < palabras; i++) {
                        marcado++;
                        if (marcado == listaPendientes.size()) {
                            marcado = 0;
                        }
                    }
                    // Al final de la canción, se marco a uno, y lo eliminamos
                    listaPendientes.remove(marcado);
                    marcado--;
                }

                for (String personajeEnCama : listaPendientes) {
                    System.out.print(personajeEnCama + " ");
                }
                System.out.println();

            }

        }

        sc.close();
    }
}
