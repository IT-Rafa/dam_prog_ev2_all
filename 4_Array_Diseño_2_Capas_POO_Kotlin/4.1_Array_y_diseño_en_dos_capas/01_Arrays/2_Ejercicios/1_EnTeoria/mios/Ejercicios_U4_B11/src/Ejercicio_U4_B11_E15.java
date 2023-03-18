/**
 * Ejercicio U4_B11_E15<p>
 * Escribe un programa que le pasemos por consola una palabra y 
 * la rote hasta obtener de nuevo el original como en el siguiente ejemplo.
 * <pre>
E:programas\programasjavaconsola>java unidad4 acueducto
acueducto
cueductoa
ueductoac
eductoacu
ductoacue
uctoacued
ctoacuedu
toacueduc
oacueduct
acueducto
 */
public class Ejercicio_U4_B11_E15 {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No hay argumentos");
    } else {
      System.out.println(args[0]);
      for(int i = 0; i < args[0].length(); i++){
        
      }
    }
  }
}
