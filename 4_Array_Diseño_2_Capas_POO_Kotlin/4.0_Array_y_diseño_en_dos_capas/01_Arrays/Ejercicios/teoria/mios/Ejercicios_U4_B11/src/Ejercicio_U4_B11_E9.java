/**
 * Ejercicio U4_B11_E9<p>
 * Vuelve a escribir el siguiente ejemplo de copia de arrays 
 * utilizando la propiedad length.
 * <pre>
class Unidad4{
    public static void main(String[] args){
        int[] a= {1,2,3,4,5};
        int[] b= new int[5]; //o también
        int[] b= {0,0,0,0,0};
        for(int i=0;i<5;i++){
            b[i]=a[i];
            System.out.print("a[" + i +"]:" + a[i]);
            System.out.println("
            b[" + i +"]:" + b[i]);
        }
    }
}
 * </pre>
 * Escribe la solución de tres formas:
 * <ul>
 *      <li>todo en el main</li>
 *      <li>haciendo un método estático que haga la copia de los arrays. 
 * El método tendrá como parámetros el array origen y el array copia. 
 * Como los arrays son objetos, realmente no hay ninguna novedad ya que 
 * ya pasamos muchas veces una referencia por parámetro.
 * <li>haciendo un método estático que se le pasa por parámetro el array origen y
devuelve en el return la copia</li>
</ul>
 */
public class Ejercicio_U4_B11_E9 {
        public static void main(String[] args){

        }
}
