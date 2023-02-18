//Ordenador.java
package ordenador;

public class Ordenador {
    private String nSerie;
    private Procesador p;
    private Memoria m;
    private Disco d;
    private int pvp;

    public Ordenador(String nSerie,int capacidadMemoria,String tipMemoria,int velocidadMemoria,float capacidadDisco,String tipoDisco, String tipoProcesador, float velocidadProcesador,int precio) {
        this.nSerie=nSerie;
        this.m= new Memoria(capacidadMemoria,tipMemoria,velocidadMemoria);
        this.d=new Disco(capacidadDisco, tipoDisco);
        this.p= new Procesador(tipoProcesador,velocidadProcesador);
    }
    public String getNSerie(){
        //los Strings son inmutables, No hay problemas con principio de ocultación si el atributo es private
        return nSerie;
    }
    public Memoria getMemoria(){
        Memoria copia= new Memoria(m);
        return copia;
    }
    public Disco getDisco(){
        Disco copia=new Disco(d);
        return copia;
    }
    public int getCapacidadMemoria(){
        return m.getCapacidad();
    }
    public String getTipoDisco(){
        return d.getTipo();
    }
    
    
}



