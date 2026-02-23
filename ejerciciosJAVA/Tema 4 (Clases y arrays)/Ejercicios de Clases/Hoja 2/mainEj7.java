package ejerciciosString.ej7;

/*

7. Metodo que reciba una cadena de caracteres y busque una
palabra dentro de la cadena y la marque con un “*”, por ejemplo, la palabra
“eva” en “La profe de programación se llama eva" quedaría como "La profe de
programación se llama *eva", el metodo debe de marcar todas las palabras que
encuentre en la cadena.

- public static String marcarPalabra(String palabra,String cadena);

• Para encontrar donde aparece la palabra puedes utilizar el metodo indexOf.
•
Para agregar el * a cada palabra encontrada una posible forma es guardar la posición donde está la palabra
buscada y separar la cadena en dos subcadenas, una con todos los caracteres a la izquierda de la posición
y otro a la derecha. Luego concatenamos la subcadena de la izquierda con un * y después con la subcadena de la derecha.
 */

public class mainEj7 {
    public static String marcarPalabra(String palabra, String cadena){
        String cadenaFinal=cadena;
        int i = 0, pos = 0;
        if(palabra!=null && cadena!=null){
            while(pos!=-1){
                pos = cadenaFinal.indexOf(palabra,i);
                if(pos!=-1){
                    cadenaFinal = cadenaFinal.substring(0,pos)+" *"+
                            cadenaFinal.substring(pos);
                    i=pos+palabra.length()+1;
                }
            }
        }
        return cadenaFinal;
    }

    public static String marcarPalabra2(String palabra, String cadena){
        String resultado="";
        if(palabra!=null && cadena!=null){
            resultado = cadena.replaceAll(palabra,"*"+palabra);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(marcarPalabra2("hola","hola soy Javier, hola que hola tal?"));
    }
}
