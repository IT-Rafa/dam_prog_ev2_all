/**
 * Ejercicio U4_B11_E2:<p>
 * Añade el código necesario al siguiente ejemplo para que encuentre
 * los valores máximos y mínimos del array y los imprima por pantalla.
 * <p>
 * Ejemplo:
 * <pre>
 * class Unidad4{
 *      public static void main(String[] args){
 *              int[] nums= new int[5];
 *              int min , max;
 *              nums[0]=7;
 *              nums[1]=10;
 *              nums[2]=3;
 *              nums[3]=34;
 *              nums[4]=13;
 *      }
 * }
 * </pre>
 */
class Ejercicio_U4_B11_E2 {

  public static void main(String[] args) {
    int[] nums = new int[5];
    int min, max;
    nums[0] = 7;
    nums[1] = 10;
    nums[2] = 3;
    nums[3] = 34;
    nums[4] = 13;

    min = max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println("max: " + max + "; min: " + min);
  }
}
