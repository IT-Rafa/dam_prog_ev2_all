//Disco.java
package ordenador;

class Disco {
    private float capacidad;
    private String tipo;

    Disco(float capacidad, String tipo) {
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    Disco(Disco d){
        this.capacidad=d.capacidad;
        this.tipo=d.tipo;
        
    }
     //sólo hace falta public este porque lo usa principal desde otro paquete
    String getTipo() {
        return tipo;
    }

   float getCapacidad() {
        return capacidad;
    }
    
    

}
