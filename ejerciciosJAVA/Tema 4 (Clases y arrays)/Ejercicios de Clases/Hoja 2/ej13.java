package ejerciciosString;

/*
Metodo que reciba una cadena de caracteres y una letra X, y coloque en
mayúsculas cada aparición de X en la cadena, modificando la cadena.
 */

public class ej13 { //CON REPLACE
    public static String ponerCaracterMayuscula1(String cadena, char car){
        String cadenaFinal = cadena;
        if(cadena != null){
            cadenaFinal = cadenaFinal.replace(car, Character.toUpperCase(car));
        }
        return cadenaFinal;
    }

    public static String ponerCaracterMayuscula2(String cadena, char car){ //CON REPLACE ALL
        String cadenaFinal = cadena;
        String resultado = null;
        if(cadena != null){
            char carMayor = Character.toUpperCase(car);
            String cadMayor = carMayor + "";
            String cadMin = car + "";

            resultado = cadenaFinal.replaceAll(cadMin, cadMayor);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Método 1 (replace())");
        System.out.println(ponerCaracterMayuscula1("Hola que tal como estas",'a'));
        System.out.println("Método 2 (replaceALL())");
        System.out.println(ponerCaracterMayuscula2("Hola que tal como estas",'a'));
    }
}
