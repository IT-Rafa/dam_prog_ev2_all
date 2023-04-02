package Ejercicio_U6_B2A_E3;
/**
 * Ejercicio U6_B2A_E3:<p>
 *  Crea un interface MiLista para que funcione el siguiente main()
 * <pre>
\/src
    j App.data
    j ArrayListCasero.java
    j MiLista.java
    j MiListaEnlazada.java

 * </pre>
 * <pre>
class App{
    public static void main(String[] args){
        MiLista ml1=new MiListaEnlazada();
        MiLista ml2= new ArrayListCasero();
        for(int i =20;i < 30;i++){
            ml1.insertar(i);
            ml2.insertar(i);
        }
        System.out.print("Lista 1: ");
        for(int i=0;i < ml1.tamano();i++){
            System.out.print(ml1.obtener(i)+" ");
        }
        System.out.print("\nLista 2: ");
        for(int i=0;i < ml2.tamano();i++){
            System.out.print(ml2.obtener(i)+" ");
        }
    }
}
 * </pre>
 */
public class Ejercicio_U6_B2A_E3 {
    public static void main(String[] args){
        MiLista ml1= new MiListaEnlazada();
        MiLista ml2= new ArrayListCasero();
        for(int i =20;i < 30;i++){
            ml1.insertar(i);
            ml2.insertar(i);
        }
        System.out.print("Lista 1: ");
        for(int i=0;i < ml1.tamano();i++){
            System.out.print(ml1.obtener(i)+" ");
        }
        System.out.print("\nLista 2: ");
        for(int i=0;i < ml2.tamano();i++){
            System.out.print(ml2.obtener(i)+" ");
        }
        System.out.println();
    }
}
