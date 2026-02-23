package hoja2.ej2;

public class Circulo {
    /**
     * Representa el radio de un círculo
     */
    private double radio;

    /**
     * constructor del círculo
     * @param radio del círculo
     */
    public Circulo(double radio){
        if(validarRadio(radio)){
            this.radio = radio;
        }
    }

    /**
     * constructor vacío
     */
    public Circulo(){
        this(1);
    }

    /**
     * Calcula el area del circulo
     * @return area del circulo
     */
    public double calcularArea(){
        return (Math.PI*(radio*radio));
    }

    /**
     * calcula el perímetro del circulo
     * @return perimetro del círculo
     */
    public double calcularPerimetro(){
        return (2*Math.PI*radio);
    }

    /**
     * valida si el radio introducido es correcto
     * @param radio del círculo
     * @return boolean [true si radio > 0], [false si radio <= 0]
     */
    private boolean validarRadio(double radio){
        boolean valido = true;

        if(radio<=0) {
            valido = false;
            this.radio = 1;
        }

        return valido;
    }

    /**
     * muestra la información del objeto
     * @return String con la información del objeto
     */
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
