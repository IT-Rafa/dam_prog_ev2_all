/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U7_B4_4:</h3><p>
 * Teclado estropeado id 144 (acepta el reto)<p>
 * Resuélvelo con lista y piensa qué incomodidades ocurrirían
 * si lo resolvemos con array. <p>
 * Por categorías se encuentra en la categoría de listas que
 * sorprendentemente sólo tiene dos problemas.
 * <h3>Teclado estropeado:</h3><p>
 * https://www.aceptaelreto.com/pub/problems/v001/44/st/statements/Spanish/index.html<p>
 * Ya no se fabrican los teclados como antes. Después de unos pocos meses, 
 * a Ramiro el suyo le ha empezado a hacer cosas raras. 
 * En concreto, cuando pulsa ciertas teclas el teclado parece interpretar 
 * que se han pulsado otras.<p>
 * Después de un rato de análisis ha llegado a la conclusión de que:
 * <ul>
 *  <li>la pulsación de la tecla del guión (-) tiene el mismo resultado que si 
 *  pulsa la tecla Inicio, y el cursor se le va al principio de la línea.</li>
 *  <li> Algo parecido le ocurre con el +, que se lleva el cursor al final 
 *  igual que la tecla Fin.</li>
 *  <li>Y al pulsar * se consigue el mismo efecto que con la tecla de la flecha 
 *  derecha.</li>
 *  <li>Pero lo peor de todo es lo que ocurre con el 3: ¡hace lo mismo que la tecla Supr, que borra la letra 
 *  que hay a la derecha del cursor!</li>
 * </ul>
 * <p>
 * El resultado es que cuando Ramiro se pone a copiar un texto sin mirar 
 * la pantalla, el resultado final de lo que ha escrito puede terminar 
 * siendo muy distinto de lo que quería escribir. ¿Qué texto saldrá como 
 * resultado de la pulsación de una serie de teclas?
 * 
 * <h4>Entrada</h4>
 * La entrada consta de un número indeterminado de líneas que deben ser 
 * consideradas independientes. Cada una contiene la secuencia de 
 * pulsaciones de Ramiro.
 * <h4>Salida</h4>
 * Para cada caso de prueba se mostrará en una línea el texto final que 
 * obtendrá Ramiro tras pulsar las teclas indicadas en el orden dado.
 * <h4>Entrada de ejemplo</h4>
 * <pre>
EDA
EDA-333
dD-3*A-E+
EDA-3E*3A
E DA
 * </pre>
 * <h4>Salida de ejemplo</h4>
 * <pre>
EDA

EDA
EDA
E DA
 * </pre>
 */
package Ejercicio_U7_B4_4;
/**
 * - = inicio
 * + = fin
 * * = flecha derecha
 * 3 = sup
 *
 * PASOS---
 *
 * Entrada: dD-3*A-E+
 *
 * d        d           pos 1
 * D        dD          pos 2
 * -        dD          pos 0
 * 3        D           pos 0
 * *        D           pos 1
 * A        DA          pos 2
 * -        DA          pos 0
 * E        EDA         pos 1
 * +        EDA         pos 2
 *
 */
