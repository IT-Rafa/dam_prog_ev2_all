/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U7_B4_3:</h3><p>
 * Escribir el siguiente código con una ArrayList. 
 * Piensa en el juego "3 en Raya" y en un método <code>hayRaya()</code>
 * que mira si una jugada en (fila,columna) provoca 
 * completar una raya.<p>
 * Este ejercicio es un tostón, cuando te canses échale un 
 * vistazo a la solución. <p>
 * Su objetivo es observar lo incómodo y poco visual que 
 * resulta utilizar ArrayList para tableros.
 * <pre>
public class App {
    static boolean hayRaya(char[][] tabla, int fila, int columna, char jugador) {
        //suponemos que tabla[fila][columna] se corresponde a una celda libre
        boolean hay = false;
        tabla[fila][columna] = jugador;
        //miramos si hay raya en fila
        if (tabla[fila][0] == tabla[fila][1] && tabla[fila][1] == tabla[fila][2] && tabla[fila][2] == jugador) {
        hay = true;
        } //miramos si raya en columna
        else if (tabla[0][columna] == tabla[1][columna] && tabla[1][columna] == tabla[2][columna] && tabla[2][columna] ==
        jugador) {
        hay = true;
        } //miramos si hay raya en diagonal, sólo dos 2 casos .
        else if (tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2] && tabla[2][2] == jugador) {
        hay = true;
        } else if (tabla[0][2] == tabla[1][1] && tabla[1][1] == tabla[2][0] && tabla[2][0] == jugador) {
        hay = true;
        } else {
        hay = false;
        }
        //volvemos a dejar como libre la celda, este método investiga pero no cambia nada
        tabla[fila][columna] = '_';
        }
        return hay;
    }
    
    public static void main(String[] args) {
        char[][] tabla = {
        {'X', '_', 'X'},
        {'O', '_', 'O'},
        {'X', '_', '_'}
        };
        //suponemos que la tabla a comprobar no tiene ya raya
        System.out.println(hayRaya(tabla, 0, 1, 'X') ? "SI" : "NO");
        System.out.println(hayRaya(tabla, 0, 1, 'O') ? "SI" : "NO");
    }
}
 * </pre>
 */
package Ejercicio_U7_B4_3;
