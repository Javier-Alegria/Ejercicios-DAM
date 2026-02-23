package EjercicioObjetos;

public class Grupo {
    private Alumno[] grupo;
    private static final int MAX_ALUMNOS = 3;
    public int numAlumnos;
    private String nombre;

    public Grupo(String nombre) {
        numAlumnos = 0;
        grupo = new Alumno[MAX_ALUMNOS];
        this.nombre = nombre;
    }

    private boolean buscarAlumno(Alumno alumno){
        boolean existe = false;
        if(alumno!=null){
            for(int i = 0; i < numAlumnos; i++){
                if(grupo[i].getDni().equalsIgnoreCase(alumno.getDni())){
                    existe = true;
                }
            }
        }
        return existe;
    }

    public int buscarPosAlumno(Alumno alumno){
        int encontrado = -1;
        if(alumno!=null){
            for(int i = 0; i < numAlumnos; i++){
                if(alumno.getDni().equalsIgnoreCase(grupo[i].getDni())){
                    encontrado = i;
                }
            }
        }
        return encontrado;
    }

    public void altaAlumno(Alumno alumno){
        if(alumno != null){
            String resultado = "";
            if(numAlumnos < MAX_ALUMNOS && !buscarAlumno(alumno)){
                grupo[numAlumnos] = alumno;
                numAlumnos++;
                System.out.println("Se ha añadido exitosamente a "+ alumno.getNombre() +" al grupo");
            }  else {
                System.out.println("No se puede añadir a "+ alumno.getNombre() +" al grupo");
            }
        }
    }

    public boolean darBaja (Alumno alumno){
        boolean existe = false;
        if(alumno!=null){
            int pos = buscarPosAlumno(alumno);

            // si existe, muevo los alumnos 1 posición a la izquierda
            // para eliminar al alumno y no dejar huecos en blanco
            if (pos>=0){
                // elimina esa posición
                if (pos==MAX_ALUMNOS-1){
                    grupo[pos] = null;
                }
                else {
                    for (int i = pos; i < numAlumnos; i++)
                        grupo[i] = grupo[i + 1];
                }
                numAlumnos--;
                existe=true;
            }
        }
        return existe;
    }

    public boolean bajarAlumno(String dni){
        for(int i = 0; i<numAlumnos; i++){
            if(grupo[i].getDni().equalsIgnoreCase(dni)){
                for(int j = i; j< numAlumnos-1; j++){
                    grupo[j]=grupo[j+1];
                }
                numAlumnos--;
                return true;
            }
        }
        return false;
    }

    public String calcularNotaMedia(){
        String resultadoNotaMedia = "";
        double totalNotas = 0;
        for(int i = 0; i<numAlumnos; i++){
            totalNotas += grupo[i].getNotaMedia();
        }
        resultadoNotaMedia = "La nota media del grupo es "+(totalNotas/numAlumnos);
        return resultadoNotaMedia;
    }

    public String mostrarAlumnos(){
        String resultado = "";
        if(numAlumnos == 0)
            resultado = "El grupo está vacío";
        else {
            for (int i = 0; i < numAlumnos; i++)
                resultado += "\n"+grupo[i].toString();
        }
        return resultado;
    }
}
