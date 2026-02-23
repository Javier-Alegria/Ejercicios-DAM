package ejercicios.ej3;

/**
 * Representa un producto de la tienda
 * @author Javier
 * @version 1.0.0
 */
public class Producto {
    /**
     * Representa el nombre del producto
     */
    private String nombre;
    /**
     * Representa el precio del producto
     */
    private double precio;
    /**
     * Número de elementos que hay del producto
     */
    private int stock;

    /**
     * Crea un producto vacío
     */
    public Producto(){
        this(null,0.0,0);
    }

    /**
     * Crea un producto con un nombre, precio y stock
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param stock cantidad del producto
     */
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        if(precio > 0){
            this.precio = precio;
        }
        if(stock > 0){
            this.stock = stock;
        }
    }

    /**
     * Reduce el stock de un producto
     * @param cantidad cantidad de stock a restar
     * @return mensaje indicando si se ha podido reducir el stock
     */
    public String reducirStock(int cantidad){

        String resultado;

        if (cantidad > 0 && stock >= cantidad){
            stock -= cantidad;
            resultado = "Se ha reducido el stock correctamente";
        }
        else
            resultado = "No hay stock suficiente";

        return resultado;
    }

    /**
     * Devuelve una cadena de texto con información del producto
     * @return info. del producto, nombre, precio y stock
     */
    public String mostrarInformacion(){
        return "Producto { " +
                "nombre: " + nombre +
                ", precio: " + precio + '€' +
                ", stock: " + stock +
                '}';
    }

    //GET & SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 0){
            this.stock = stock;
        }
    }
}
