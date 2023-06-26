package Ejercicio_U6_B1A_E3;
/**
 * Ejercicio U6_B1A_E3:<p>
 * El argumento args[0] es una cadena que contiene dnis separados por
 * un espacio en blanco. Se analiza cada DNI para ver si es correcto 
 * con la ER del ejercicio anterior. Utiliza también el método split().
 * <pre>
D:\Programacion\ProgramacionJavaConsola>java Unidad5 "123456789z 12345678Z 1M 999z99T"
DNI ERRÓNEO: 123456789z
DNI OK: 12345678Z
DNI OK: 1M
DNI ERRÓNEO: 999z99T

D:\Programacion\ProgramasJavaConsola>

 * </pre>
 */
public class Ejercicio_U6_B1A_E3 {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("argumentos incorrectos");
      System.exit(0);
    }

    String er = "\\d{1,8}[a-zA-Z]";
    String[] stList = args[0].split(" ");
    for (String st : stList) {
      System.out.println(
        ((st.matches(er)) ? "DNI OK: " : "DNI ERRÓNEO: ") + st
      );
    }
  }
}
