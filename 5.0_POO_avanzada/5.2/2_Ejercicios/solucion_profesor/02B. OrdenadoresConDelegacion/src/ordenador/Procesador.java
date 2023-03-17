//Procesador.java
package ordenador;
class Procesador{
    private String modelo;
    private float velocidad;

    Procesador(String modelo, float velocidad) {
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    Procesador(Procesador p){
        this.modelo=p.modelo;
        this.velocidad=p.velocidad;
    }
}
