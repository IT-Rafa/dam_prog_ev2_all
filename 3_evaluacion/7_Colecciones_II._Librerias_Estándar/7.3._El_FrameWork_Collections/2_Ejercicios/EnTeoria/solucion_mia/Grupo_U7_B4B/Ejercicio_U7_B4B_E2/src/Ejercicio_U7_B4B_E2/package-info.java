/**
 * Lista clases para ejercicio:<p>
 * <h3>Ejercicio U7_B4B_E2:</h3><p>
 * Utilizando composite, crea una aplicación con menú de consola 
 * donde
 * <ul>
 *  <li>la clase abstracta se llame -> ComponenteMenu</li>
 *  <li>la clase compuesta se llame -> Menu</li>
 *  <li>la clase simple se llame -> MenuItem</li>
 * </ul>
 * Un menú puede contener sub menús pero finalmente llegaremos 
 * a los hojas que son de tipo MenuItem<p>
 * Todos los objetos ComponenteMenu deben:
 * <ul>
 *  <li>Tener un nombre</li>
 *  <li>Un método abstracto ejecutar()</li>
 * </ul>
 * Sobre ejecutar(): su comportamiento será diferente dependiendo 
 * al tipo de objeto que pertenezca
 * <ul>
 *  <li>en un objeto Menu consistirá:
 *      <ul>
 *          <li>en imprimir las opciones</li>
 *          <li>que el usuario escoja una opción</li>
 *          <li>y por último lanzar la ejecución de la opción escogida. 
 *              (Si se escogió otro menú, recursivamente ejecutamos el 
 *              nuevo menú)
 *          </li>
 *      </ul>
 *  <li>en un objeto MenuItem: 
 *      <ul>
 *          <li> son hojas y lo único que hacen es simular una acción 
 *                  imprimiendo un mensaje “Ejecutando cosas de ...”
 *          </li>
 *       </ul>
 *  </li>
 * </ul>
 *  En el siguiente ejemplo se entra en la aplicación que simula un 
 * editor, se escoge el menú archivo, luego el item menu archivo y 
 * luego se va saliendo hacia atrás hasta salir de la aplicación y 
 * nos despedimos con “chao”
 * <pre>
Menú mi editor
-------------------
0. archivo
1. Editar
2. Salir
Teclea número opcion: 0
Menú archivo
-------------------
0. Nuevo archivo
1. Abrir archivo
2. Guardar archivo
3. Salir
Teclea número opcion: 0
ejecutando cosas de Nuevo archivo
pulsa tecla para regresar a menú anterior
-------------------------------
Menú archivo
-------------------
0. Nuevo archivo
1. Abrir archivo
2. Guardar archivo
3. Salir
Teclea número opcion: 3
Menú mi editor
-------------------
0. archivo
1. Editar
2. Salir
Teclea número opcion: 2
Chao
 * </pre>
 * Observa que tras ejecutarse un menuItem o un menú tenemos que 
 * volver al menú padré que lo invocó. Nos hará falta entonces 
 * tener un atributo Padre en los Componentes para almacenar la 
 * referencia al objeto Padre que nos permite “subir” por el árbol<p>
 * Utiliza la siguiente clase abstracta para resolver el ejercicio:
 * <pre>
abstract class ComponenteMenu {
    protected ComponenteMenu padre;
    protected String nombre;
    Scanner sc;

    protected ComponenteMenu(String nombre, Scanner sc) {
        padre = null;
        this.nombre = nombre;
        this.sc = sc;
    }

    abstract void ejecutar();

}
 * </pre>
 * Tu solución debe funcionar al menos para los tests del siguiente 
 * main() que lanza una salida como la del ejemplo de salida de arriba.
 * <pre>
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MenuItem nuevoarchivo = new MenuItem("Nuevo archivo", sc);
        MenuItem abrirarchivo = new MenuItem("Abrir archivo", sc);
        MenuItem guardararchivo = new MenuItem("Guardar archivo", sc);
        Menu archivo = new Menu("archivo",sc);
        archivo.addMenu(nuevoarchivo);
        archivo.addMenu(abrirarchivo);
        archivo.addMenu(guardararchivo);
        MenuItem copiar= new MenuItem("copiar", sc);
        MenuItem pegar= new MenuItem("pegar", sc);
        Menu editar= new Menu("Editar", sc);
        editar.addMenu(copiar);
        editar.addMenu(pegar);
        Menu MiMenu= new Menu("mi editor", sc);
        MiMenu.addMenu(archivo);
        MiMenu.addMenu(editar);
        MiMenu.ejecutar();
    }
}
 * </pre>
 */
package Ejercicio_U7_B4B_E2;
