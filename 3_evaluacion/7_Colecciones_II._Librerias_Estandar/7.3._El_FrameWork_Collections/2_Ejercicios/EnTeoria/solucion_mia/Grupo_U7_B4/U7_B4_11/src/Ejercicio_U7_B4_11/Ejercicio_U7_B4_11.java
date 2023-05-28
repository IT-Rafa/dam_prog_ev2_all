package Ejercicio_U7_B4_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Clase que contiene el main del Ejercicio_U7_B4_11
 */
public class Ejercicio_U7_B4_11 {

    /**
     * Enunciado:
     * <ul>
     * <li>Esperamos que usuario introduzca dos números, en la misma línea
     * <ul>
     * <li>El primero es número de balones inicial. Mínimo 1</li>
     * <li>tras cuántos tiros acaba un balón en el agua. Máximo 100</li>
     * </ul>
     * </li>
     * <li>Si la entrada del usuario es 0 0 (o similar), el programa finaliza
     * </ul>
     * Pasos a seguir:
     * <ul>
     * <li>Usuario introduce 2 números, en ejemplo: 2 2</li>
     * <li>Datos correctos, seguimos, si no finalizamos</li>
     * <li>Creamos cola y añadimos las pelotas (Integer con nº balón), creadas con
     * array</li>
     * <li>Anotamos tirosLanzados == 0 y balones perdidos == null</li>
     * <ul>
     * <li>Repetimos hasta que cola esté vacia</li>
     * <ul>
     * <li>Quitamos balón de la cola y lo lanzamos (subimos tirosLanzados a 1)</li>
     * <li>Si se han tirado los mismos tiros que el límite, guardamos pelota
     * eliminada y reiniciamos tiros; si no guardamos la pelota en la cola de
     * nuevo</li>
     * </ul>
     * </li>
     * </ul>
     * <li>Mostramos la última pelota eliminada</li>
     *
     */
    public static void main(String[] args) {
        // Datos usuario
        Scanner sc = new Scanner(System.in);
        // Mientras haya linea entrada
        while (sc.hasNextLine()) {
            // Capturamos los balones totales
            int cantBalones = sc.nextInt();

            // Capturamos máx cantidad tiros correctos
            int limite = sc.nextInt();

            // Si ambos son 0, finalizamos programa
            if (cantBalones == 0 && limite == 0) {
                break;
            }

            // Preparamos cola con los balones a usar
            Queue<Integer> balonesPendientes = new LinkedList<Integer>();

            // Creamos los balones y los añadimos a la cola
            Integer[] listaBalones = new Integer[cantBalones];
            for (int i = 0; i < cantBalones; i++) {
                listaBalones[i] = Integer.valueOf(i + 1);
                balonesPendientes.add(listaBalones[i]);
            }

            // último balon que se pierde
            Integer balonPerdido = null;
            // Cantidad lanzamientos hechos
            int tirosLanzados = 0;

            // Repetimos hasta que no haya más balones
            while (!balonesPendientes.isEmpty()) {
                // Sacamos balon de la cola
                Integer p = balonesPendientes.remove();
                // Tiramos el balón
                tirosLanzados++;
                if (tirosLanzados == limite) {
                    // Cuando tiremos hasta el límite
                    // Reiniciamos tiros y guardamos el balón del agua
                    tirosLanzados = 0;
                    balonPerdido = p;
                } else {
                    // Si no se llega, guardamos balón en cola
                    balonesPendientes.add(p);
                }
            }

            // Mostramos último balón perdido
            System.out.println(balonPerdido);
        }
        sc.close();
    }
}
