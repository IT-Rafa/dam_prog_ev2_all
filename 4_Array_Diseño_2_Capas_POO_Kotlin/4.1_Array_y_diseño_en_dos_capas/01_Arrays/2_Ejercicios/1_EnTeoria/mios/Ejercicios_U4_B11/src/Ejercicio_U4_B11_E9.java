/**
 * Ejercicio U4_B11_E9<p>
 * Vuelve a escribir el siguiente ejemplo de copia de arrays 
 * utilizando la propiedad length.<p>
 * Ejemplo
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

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5 };
    System.out.println(a);

    // Todo en main
    int[] b = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
      System.out.println("a[" + i + "] = " + a[i] + "; b[" + i + "] = " + b[i]);
    }
    System.out.println(b);

    // haciendo un método estático que haga la copia de los arrays.
    System.out.println(
      "Guardamos null en varible b y usamos array estático con dos parámetros"
    );
    b = null;
    b = new int[a.length];

    copyArrayMethodB(a, b);
    for (int i = 0; i < b.length; i++) {
      System.out.println("b[" + i + "] = " + b[i]);
    }
    System.out.println("b" + b);

    // haciendo un método estático que se le pasa por parámetro el array origen y
    // devuelve en el return la copia

    System.out.println(
      "Guardamos null en varible b y usamos array estático con un parámetro"
    );

    b = null;
    b = copyArrayMethodC(a);
    for (int i = 0; i < b.length; i++) {
      System.out.println("b[" + i + "] = " + b[i]);
    }
    System.out.println(b);
  }

  static void copyArrayMethodB(int[] original, int[] nuevo) {
    for (int i = 0; i < original.length; i++) {
      nuevo[i] = original[i];
    }
  }

  static int[] copyArrayMethodC(int[] original) {
    int[] result = new int[original.length];
    for (int i = 0; i < original.length; i++) {
      result[i] = original[i];
    }
    return result;
  }
}
