package ejercicios.ej3;

public class Tienda {
    private String nombre;
    private String direccion;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;

    public Tienda() {
        nombre = null;
        direccion = null;
        producto1 = null;
        producto2 = null;
        producto3 = null;
    }


    public Tienda(String direccion, String nombre) {

    }

    //GET & SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public String mostrarProducto() {
        String resultado;

        if (producto1 == null)
            resultado = "Producto no encontrado en la tienda 1";
        else
            resultado ="Producto 1:"+producto1;

        return resultado;
    }

    public boolean venderProducto(String nombreProducto, int cantidad){
        boolean resultado = false;
        if (nombreProducto!=null){
            if(nombreProducto.equalsIgnoreCase(producto1.getNombre())){
                if(producto1.getStock()>=cantidad){
                    resultado=true;
                    producto1.reducirStock(cantidad);
                }
            }
        }
        return resultado;
    }
}
