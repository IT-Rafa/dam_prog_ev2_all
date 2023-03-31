/**
 * Ejercicio U6_B1A_E1:<p>
 * Escribe una expresión regular que reconozca si una cadena de texto 
 * se corresponde con un (único) número binarios y pruébala en un main
 */
public class Ejercicio_U6_B1A_E1 {
    public static void main(String[] args) throws Exception {
        String tests = "Hello, World!-0-1-01-5--5";
        String[] test = tests.split("-");
        for(String st:test){
            System.out.print(st + "\t- ");
            System.out.println(st.matches("0|1"));
        }
    }
}
