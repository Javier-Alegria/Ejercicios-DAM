package ejercicios.coche;

/**
 * Representa un coche con una marca, modelo y tipo de coche
 * @author Javier
 * @version 1.0
 * @see TipoCoche
 */
public class coche {
    private String marca;
    private String modelo;
    private TipoCoche tipo;

    /**
     * crea un coche sin inicializar sus atributos
     */
    public coche() {
    }

    /**
     * Crea un coche con marca y modelo
     * @param marca marca del coche
     * @param modelo modelo del coche
     */
    public coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Crea un coche con marca, modelo y color
     * @param marca marca de coche
     * @param modelo modelo de coche
     * @param tipo tipo de coche
     */
    public coche(String marca, String modelo, TipoCoche tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoCoche getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(TipoCoche tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve una cadena con la información del coche
     * @return cadena de texto con marca modelo y tipo del coche
     */
    public String mostrarInformacion() {
        return "El coche es un " + tipo + " de " + marca + " modelo " + modelo;
    }
}
