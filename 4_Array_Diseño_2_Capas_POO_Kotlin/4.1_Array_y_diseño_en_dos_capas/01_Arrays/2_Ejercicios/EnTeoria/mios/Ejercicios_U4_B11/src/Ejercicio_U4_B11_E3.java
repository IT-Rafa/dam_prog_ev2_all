/**
 * Ejercicio U4_B11_E3:<p>
 * Modifica el ejemplo anterior de encontrar 
 * mínimo y máximo para que el array se inicialice cuando se cree.
 */
class Ejercicio_U4_B11_E3 {

  public static void main(String[] args) {
    int[] nums = {7,10,3,34,13};
    int min, max;

    min = nums[0];
    max = nums[0];
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
