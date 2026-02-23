package ejercicios.ej2;

public class rectangulo {

    private float ancho;
    private float alto;
    //private String color;
    private Color color;

    public enum Color {
        VERDE,
        ROJO
    }

    /**
     * crea un rectangulo con los valores por defecto (0,0,null)
     */
    public rectangulo() {
    }

    /**
     * crea un rectangulo sin color de un ancho y alto determinado
     * @param ancho ancho del rectangulo
     * @param alto alto del rectangulo
     */
    public rectangulo(float ancho, float alto) {
        if (alto>=0 && ancho>=0){
            this.ancho = ancho;
            this.alto = alto;
        }
    }

    /**
     * crea un rectangulo con un color, ancho y alto determinado
     * @param ancho ancho del rectangulo
     * @param alto alto del rectangulo
     * @param color color del rectangulo
     */
    public rectangulo(float ancho, float alto, Color color) {
        if (alto>=0 && ancho>=0){
            this.ancho = ancho;
            this.alto = alto;
        }

        this.color = color;
    }

    /**
     * calcula el perímetro del rectangulo
     * @return perimetro rectangulo
     */
    public float calcularPerimetro(){
        return ancho*2 + alto*2;
    }

    /**
     * calcula el area del rectangulo
     * @return area rectangulo
     */
    public float calcularArea(){
        return ancho*alto;
    }

    /**
     * cambia el color del rectangulo
     * @param color nuevo color del rectangulo
     */
    public void cambiarColor(Color color){
        this.color = color;
    }

    //=== GET Y SET ===

    /**
     * devuelve el ancho del rectangulo
     * @return ancho rectangulo
     */
    public float getAncho() {
        return ancho;
    }

    /**
     * devuelve el alto del rectangulo
     * @return alto rectangulo
     */
    public float getAlto() {
        return alto;
    }

    /**
     * devuelve el color del rectangulo
     * @return color rectangulo
     */
    public Color getColor() {
        return color;
    }

    /**
     * cambia el ancho del rectangulo
     * @param ancho rectangulo
     */
    public void setAncho(float ancho) {
        if (ancho>=0)
            this.ancho = ancho;
    }

    /**
     * cambia el alto del rectangulo
     * @param alto rectangulo
     */
    public void setAlto(float alto) {
        if (alto>=0)
            this.alto = alto;
    }

    /**
     * cambia el color del rectangulo
     * @param color rectangulo
     */
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color='" + color + '\'' +
                '}';
    }
}
