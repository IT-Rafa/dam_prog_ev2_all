package Ejercicio_U7_B4B_E1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hereda de ParteAbstracta (Component) y es la parte Composite, que
 * permite contener una lista de objetos Component, y devolver los datos
 * conjuntos de lo que tenga guardado
 *
 */
class NodoAlmacen extends AbstractNodo {

    // ATTRIBUTES
    /**
     * Conjunto de objetos guardados
     */
    private List<AbstractNodo> partes = new ArrayList<>();

    // CONSTRUCTOR
    /**
     * Constructor con nombre
     *
     * @param nombre Nombre del objeto
     */
    public NodoAlmacen(String nombre) {
        super(nombre);
    }

    /**
     * Devuelve el precio del objeto.
     *
     * @return Precio del objeto en double
     */
    @Override
    public double getPrecio() {
        // Creamos variable a devolver
        double precio = 0;

        // Si tiene objetos dentro, los revisa para coger sus precios
        for (AbstractNodo parte : partes) {
            precio += parte.getPrecio();
        }
        return precio;
    }

    /**
     * Añade nuevo a la lista de objetos guardados (partes)
     *
     * @param parte Objeto ParteAbstracta a añadir
     */
    public void addParte(AbstractNodo parte) {
        this.partes.add(parte);
    }

    /**
     * Imprimimos el árbol desde la raíz, usando pre-orden con tabs para
     * mostrar los sub-nodos
     */
    @Override
    public String getPrecioDesglosado() {
        // Creamos variable a devolver
        double precio = 0;

        // Si tiene objetos dentro, los revisa para coger sus precios
        for (AbstractNodo parte : partes) {
            precio += parte.getPrecio();
        }
        return precio;
    }

}
