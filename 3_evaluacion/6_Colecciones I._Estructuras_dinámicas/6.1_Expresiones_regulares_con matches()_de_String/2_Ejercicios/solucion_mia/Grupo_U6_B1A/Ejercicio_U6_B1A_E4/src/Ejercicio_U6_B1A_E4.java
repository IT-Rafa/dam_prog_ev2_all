/**
 * Ejercicio U6_B1A_E4:<p>
 * Crea un validador de direcciones IP. <p>
 * Recuerda que las direcciones IP se especifican en decimal 
 * como 4 grupos de números separados por “.” <p>
 * Cada grupo puede contener un número decimal de 0 a 255.
 *  Por ejemplo son IP válidas:<p>
 * <pre>
● 0.1.2.3
● 255.255.255.255
● 9.234.1.199
 * </pre>
 * Son inválidas:
 * <pre>
● 0.1.2.
● 0.1.2.3.
● 256.1.2.3
● 192.168.1.01 (no queremos ceros a la izquierda)
 * </pre>
 * Dentro de las IPs válidas estas pueden tener varias funciones: 
 * direcciones de host, direcciones de red, direcciones broadcast, 
 * máscaras, pero esto no influye en este ejercicio.
 * Ejemplo de ejecución:
 * <pre>
D:\Programacion\ProgramasJavaConsola>java Unidad5
CTRL-C para fin
IP: 2.3
    MAL
IP: 1.2.3.4
    OK
IP: 1.2.3.4.
    MAL
IP: 255.255.255.255
    OK
IP: 256.1.1.1
    MAL
IP: 1.1.1.01
    MAL
IP: 127.0.0.1
    OK
IP: Exception in thread "main"
D:\Programacion\ProgramasJavaConsola>

 * </pre>
 */
public class Ejercicio_U6_B1A_E4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
