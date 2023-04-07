/**
 * Ejercicio U6_B2B_E3: <p>
 * Conseguir "aceptado" en el problema de suma de dígitos pero
 * utilizando OBLIGATORIAMENTE aritmética decimal para extraer 
 * los dígitos y una pila.
 * Podemos acceder a las cifras de un número e ir introduciendo 
 * cifra a cifra en una pila de enteros básicamente con la siguiente idea.
 * <pre>
if (numero == 0) {
    pila.push(0);
} else {
    while (numero > 0) {
        pila.push(numero % 10);
        numero = numero / 10;
    }
}
 * </pre>
 * Ahora simplemente quedaría ir vaciando la pila con pop pero ya 
 * vamos obteniendo los dígitos en el orden deseado para imprimir
 * @see <a href="https://www.aceptaelreto.com/problem/statement.php?id=140">Acepta el reto: Suma de dígitos</a>
 */
package Ejercicio_U6_B2B_E3;
