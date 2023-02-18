
//Memoria.java
package ordenador;
class Memoria {
    static final int MIN_MEM=2;
    private int capacidad;
    private String tipo;
    private int velocidad;

    Memoria(int capacidad, String tipo, int velocidad) {
        
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.velocidad = velocidad;
        if(capacidad<MIN_MEM){
            this.capacidad=MIN_MEM;
        }
    }
    Memoria(Memoria m){
        this.capacidad=m.capacidad;
        this.tipo=m.tipo;
        this.velocidad=m.velocidad;
    }
    //sólo hace falta public este porque lo usa principal desde otro paquete
    int getCapacidad(){
        return this.capacidad;
    }
    String getTipo(){
        return tipo;
    }
    int getVelocidad(){
        return velocidad;
    }
    
    
}

