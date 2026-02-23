package ejercicio1;

/**
 * Clase que representa un vehiculo
 * @author Javier
 */
public class Vehiculo {
    private String matricula;
    private int kilometros;
    public static int vehiculosCreados;
    private final int KM_MINIMOS = 0;
    private Marca fabricante;
    private String pais;

    /**
     * Valida si los kilometros del vehiculo son validos
     * @param km kilometros del vehiculo
     * @return true si es mayor que KM_MINIMOS, false si no es mayor
     */

    private boolean esKilometrajeValido(int km){
        boolean validacion = false;
        if(km>KM_MINIMOS){
            validacion = true;
        }
        return validacion;
    }

    /**
     * Valida si la matricula cumple con las condiciones
     * @param matricula matricula del vehiculo
     * @return true si cumple, false si no cumple
     */
    private boolean esMatriculaValida(String matricula){
        boolean sonLetras = false;
        boolean noVocales = false;
        boolean restoNumeros = false;
        boolean validacion = false;
        if(matricula != null && matricula.length()==7){
            String letrasMatricula = matricula.toLowerCase().substring(0,3);
            for(int i=0;i<letrasMatricula.length();i++){
                if(letrasMatricula.charAt(i)>='a'&&letrasMatricula.charAt(i)<='z'){
                    sonLetras = true;
                }
            }
            for(int i=0;i<letrasMatricula.length();i++){
                if(letrasMatricula.charAt(i)!='a'&&letrasMatricula.charAt(i)!='e'&&letrasMatricula.charAt(i)!='i'&&letrasMatricula.charAt(i)!='o'&&letrasMatricula.charAt(i)!='u'){
                    noVocales = true;
                }
            }
            String numerosMatricula = matricula.substring(3);
            for(int i=0;i<numerosMatricula.length();i++){
                if(numerosMatricula.charAt(i)>='0' && numerosMatricula.charAt(i)<='9'){
                    restoNumeros = true;
                }
            }
            if(sonLetras && noVocales && restoNumeros){
                validacion = true;
            }
        }
        return validacion;
    }

    /**
     * Construye un vehiculo con fabricante (Marca), matricula y kilometros
     * @param fabricante fabricante del vehiculo
     * @param matricula matricula del vehiculo
     * @param kilometros kilometros del vehiculo
     */
    public Vehiculo(Marca fabricante, String matricula, int kilometros) {
        this.fabricante = fabricante;
        if(fabricante == Marca.FORD){
            pais = "EEUU";
        } else if(fabricante == Marca.TOYOTA){
            pais = "JAPON";
        } else {
            pais = "ESPANIA";
        }
        if(esMatriculaValida(matricula)){
            this.matricula = matricula;
        }
        if(esKilometrajeValido(kilometros)){
            this.kilometros = kilometros;
        }
        vehiculosCreados++;
    }

    /**
     * Construye un vehiculo con matrícula y fabricante (Marca)
     * @param matricula matricula del vehiculo
     * @param fabricante marca del vehiculo
     */
    public Vehiculo(Marca fabricante, String matricula) {
        this(fabricante, matricula, 0);
    }

    /**
     * Aumenta el kilometraje del vehiculo
     * @param km kilometros a aumentar
     */
    public void recorrer(int km){
        if(esKilometrajeValido(km)){
            this.kilometros += km;
        }
    }

    /**
     * imprime información del vehiculo
     * @return información del vehiculo
     */
    public String mostrarInfo() {
        return "Matrícula: " + matricula +
                " | Marca: " + fabricante +
                " | País Procedencia: " + pais +
                " | Kilómetros: " + kilometros;
    }

    /**
     * Muestra el total de vehiculos creados
     * @return total de vehiculos creados
     */
    public static int getTotalVehiculos() {
        return vehiculosCreados;
    }

    /**
     * Muestra el país de procedencia del vehiculo
     * @return pais de procedencia
     */
    public String mostrarPaisProcedencia() {
        return pais;
    }
}