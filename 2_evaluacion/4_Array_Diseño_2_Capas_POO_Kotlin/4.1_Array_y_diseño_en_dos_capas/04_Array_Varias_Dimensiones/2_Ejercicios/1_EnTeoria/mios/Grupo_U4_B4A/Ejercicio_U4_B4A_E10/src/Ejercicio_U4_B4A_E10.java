import java.util.Scanner;

/** Ejercicio U4_B4A_E10:<p>
    en coderunner resolver reinas atacadas id 244

    En enunciado se añade en PDF previo al texto<p>
 * https://www.edu.xunta.gal/fpadistancia/mod/quiz/review.php?attempt=481219&cmid=513721
 * https://www.aceptaelreto.com/problem/statement.php?id=244<p>
    Texto en el reto

    Reinas atacadas<p>
    Tiempo máximo: 1,000-3,000 s Memoria máxima: 4096 KiB<p>

    En el ajedrez, la reina es la pieza más poderosa, al poderse mover cualquier número de 
    escaques en vertical, horizontal, o diagonal.<p>

    Movimientos de la reina<p>

    En 1848, el alemán Max Bezzel planteó el puzzle de las 8 reinas, en el que retó a colocar 
    8 reinas sobre un tablero sin que se atacaran entre sí. Dos años después, se dieron algunas 
    de las 92 soluciones.<p>
    Una de las soluciones posibles<p>

    Desde entonces, matemáticos y aficionados de todo el mundo han estudiado el problema, 
    generalizándolo a tamaños de tableros de ajedrez de N×N. En 1972, Dijkstra, en plena crisis 
    del software, usó el problema para demostrar el poder de la programación estructurada, y 
    desde entonces es un ejemplo clásico de algoritmo de vuelta atrás.

    Para poder colocar las reinas, el primer paso es saber cuándo un grupo de reinas sobre un 
    tablero de ajedrez se atacan entre sí, es decir cuándo hay al menos una reina que podría 
    comer a otra siguiendo las reglas del movimiento del juego.

    Entrada<p>

    La entrada consta de un conjunto de casos de prueba. Cada uno comienza con una línea con 
    dos números. <p>
    El primero indica el ancho y alto del tablero de ajedrez (siempre será cuadrado de como 
    mucho 2.000×2.000). El segundo indica el número de reinas colocadas sobre él (entre 1 y 100).

    A continuación vendrá una línea con la posición de todas las reinas. <p>
    Para cada una, se indicará primero la coordenada X y luego la Y, separadas por espacio.
    
    Las posiciones de cada reina también se separarán por un único espacio. <p>

    Todas las posiciones serán válidas <p>
    (cada coordenada estará entre 1 y el tamaño del tablero) y se garantiza que no habrá dos 
    reinas en la misma posición.<p>

    La entrada termina con un caso de prueba con un tablero de tamaño 0×0 y sin reinas que no 
    debe procesarse.<p>
    Salida<p>

    Para cada caso de prueba, el programa escribirá, en la salida estándar, una línea con el 
    texto "SI" si hay reinas atacadas en la configuración dada, y "NO" en otro caso 
    (sin las comillas).<p>
    
    Entrada de ejemplo<p>
<pre>
8 8
1 2 2 8 3 6 4 1 5 3 6 5 7 7 8 4
4 2
1 1 3 3
4 2
1 1 3 2
0 0
</pre>
    Salida de ejemplo
<pre>
NO
SI
NO
</pre>
 */
public class Ejercicio_U4_B4A_E10 {
/*
 * - Pedimos tamaño tablero < 2000 y cantidad reinas 
 * - Repetimos esta parta hasta tablero y reinas == 0
 *      - Pedimos posición de cada reina. 2 enteros, para posición, por reina
 *          En misma línea.
 *      - Creamos matriz tablero on reinas incluidas
 *      
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("tamaño y reinas: ");
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("0 0")) {
            String[] list = input.split(" ");
            int cantQueen = Integer.parseInt(list[1]);

            String queenInput = sc.nextLine();
            String[] queenList = queenInput.split(" ");
            int[] queenXPos = new int[cantQueen];
            int[] queenYPos = new int[cantQueen];

            int queen = 0;
            for (int i = 0; i < queenList.length - 1; i += 2) {
                queenXPos[queen] = Integer.parseInt(queenList[i]);
                queenYPos[queen] = Integer.parseInt(queenList[i + 1]);
                queen++;
            }

            String result = "NO";
            // bucleExterior:
            for (int atacante = 0; atacante < cantQueen - 1; atacante++) {
                //System.out.println("atacante[" + queenXPos[atacante] + ", " + queenYPos[atacante] + "]");

                for (int atacada = atacante + 1; atacada < cantQueen; atacada++) {
                    // System.out.print("\tatacada[" + queenXPos[atacada] + ", " + queenYPos[atacada] + "]");
                    if (queenXPos[atacante] == queenXPos[atacada] ||
                            queenYPos[atacante] == queenYPos[atacada] ||
                            queenXPos[atacante] - queenYPos[atacante] == queenXPos[atacada] - queenYPos[atacada] ||
                            queenXPos[atacante] + queenYPos[atacante] == queenXPos[atacada] + queenYPos[atacada]) {
                        //System.out.print(" acierto ");
                        result = "SI";

                    }
                    //System.out.println();
                }
            }

            System.out.println(result);

            //System.out.println("tamaño y reinas: ");
            input = sc.nextLine();
        }
        sc.close();
    }

}
