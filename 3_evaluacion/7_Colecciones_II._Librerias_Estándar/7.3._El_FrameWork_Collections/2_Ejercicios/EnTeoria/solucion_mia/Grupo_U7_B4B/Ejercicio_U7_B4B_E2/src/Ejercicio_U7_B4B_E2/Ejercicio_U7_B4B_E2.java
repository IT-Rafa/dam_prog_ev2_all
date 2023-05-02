package Ejercicio_U7_B4B_E2;

import java.util.Scanner;

public class Ejercicio_U7_B4B_E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuItem nuevoArchivo = new MenuItem("Nuevo archivo", sc);
        MenuItem abrirArchivo = new MenuItem("Abrir archivo", sc);
        MenuItem guardarArchivo = new MenuItem("Guardar archivo", sc);

        Menu subMenuArchivo = new Menu("archivo", sc);

        subMenuArchivo.addMenu(nuevoArchivo);
        subMenuArchivo.addMenu(abrirArchivo);
        subMenuArchivo.addMenu(guardarArchivo);

        MenuItem copiar = new MenuItem("copiar", sc);
        MenuItem pegar = new MenuItem("pegar", sc);

        Menu subMenuEditar = new Menu("Editar", sc);

        subMenuEditar.addMenu(copiar);
        subMenuEditar.addMenu(pegar);

        Menu MiMenu = new Menu("mi editor", sc);

        MiMenu.addMenu(subMenuArchivo);

        MiMenu.addMenu(subMenuEditar);

        MiMenu.ejecutar();
    }
}
