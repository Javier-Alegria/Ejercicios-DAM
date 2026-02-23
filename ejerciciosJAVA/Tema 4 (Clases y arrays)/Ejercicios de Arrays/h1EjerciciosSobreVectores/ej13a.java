package h1EjerciciosSobreVectores;

public class ej13a {
    public static void main(String[] args) {
        int[] ta = {1,2,35,4,35,6,70,8,9,105};
        int[] tb = new int[ta.length];

        boolean encontrado;
        int ocupados = 0;

        //recorrer ta en busca de números que i%5==0 Y i%7==0
            // si el número no existe en tb
                //almacenarlo en tabla tb
            // si existe, pasar al siguiente número

        for(int i=0;i<ta.length;i++){
            encontrado = false;

            // si es divisible entre 5 y 7
            if(ta[i]%5==0 && ta[i]%7==0){

                //comprobar si ya lo hemos metido en tb
                for(int j=0;j<tb.length && !encontrado;j++){
                    if(ta[i]==tb[j]){
                        encontrado=true;
                    }
                }
                if(!encontrado){
                    //almacenar ta[i] en tabla tb
                    //buscar la próxima posición libre en tb
                    while(ocupados < tb.length && tb[ocupados]!=0){
                        ocupados++;
                    }
                    tb[ocupados]=ta[i];
                }
            }
        }
    }
}
