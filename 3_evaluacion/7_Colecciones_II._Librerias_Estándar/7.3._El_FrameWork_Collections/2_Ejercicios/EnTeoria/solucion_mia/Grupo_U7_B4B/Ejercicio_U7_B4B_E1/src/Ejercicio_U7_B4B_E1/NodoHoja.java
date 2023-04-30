package Ejercicio_U7_B4B_E1;

/**
 * Hereda de ParteAbstracta (Component) y es la parte Leaf, que no tiene
 * lista para almacenar otros Components-
 *
 */
class NodoHoja extends AbstractNodo {

    // ATRIBUTES
    /**
     * Precio del objeto
     */
    private double precio;

    // CONSTRUCTORS
    /**
     * Constructor con nombre del objeto y su precio
     */
    public NodoHoja(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    // GETTER & SETTER
    /**
     * Devuelve el precio del objeto hoja
     */
    @Override
    double getPrecio() {
        return precio;
    }

    @Override
    String getPrecioDesglosado() {
        return precio;
    }
}
