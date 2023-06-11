/**
 * package con clases para Ejercicio U8_B2_E10: <p>
 * Un poco más elaborado, ahora el método eval es genérico 
 * de forma que funciona el siguiente main
 * <p>
 * <pre>
public static void main(String args[]){
    String[] listaPalabras={"hola","adios","zorros","pimiento"};
    Integer[] listaNumeros={3,4,-5,6,-7};
    System.out.println("Imprimir palabras de más de 5 car:");
    Predicate<String> predicado = s -> s.length()>5;
    eval(listaPalabras, predicado);
    System.out.println("Imprimir numeros positivos: ");
    eval(listaNumeros, i-> i>0 );
}
 * </pre>
 * que produce los resultados:
 * <pre>
Imprimir palabras de más de 5 car:
zorros
pimiento
Imprimir numeros positivos:
3
4
6
 * </pre>
 */
package U8_B2_E10;
