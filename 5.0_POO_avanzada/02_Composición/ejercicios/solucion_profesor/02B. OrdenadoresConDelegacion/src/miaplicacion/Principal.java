//Principal.java
package miaplicacion;
import ordenador.Ordenador;
class Principal {
    public static void main(String[] args) {
        //formato contructor: nSerie,capacidadMemoria,tipMemoria,velocidadMemoria,capacidadDisco,tipoDisco,tipoProcesador,velocidadProcesador,precio
        Ordenador miOrdenador1 = new Ordenador("Ab155", 8, "DDR3", 533, (float) 3.0, "plato", "i5", (float) 3.3, 400);
        Ordenador miOrdenador2 = new Ordenador("Bx333", 8, "DDR3", 533, (float) 1.5, "SSD", "i5", (float) 3.3, 400);
        Ordenador miOrdenador3 = new ordenador.Ordenador("zx900", 8, "DDR3", 533, (float) 1.0, "M2", "i7", (float) 3.3, 400);
        Ordenador[] misOrdenadores = {miOrdenador1, miOrdenador2, miOrdenador3};
        for (ordenador.Ordenador o : misOrdenadores) {
            System.out.println(o.getNSerie() + ", memoria " + o.getCapacidadMemoria() + "GB, disco " + o.getTipoDisco());
        }
    }
}
