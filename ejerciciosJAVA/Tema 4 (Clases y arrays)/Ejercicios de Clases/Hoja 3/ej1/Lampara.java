package hoja2.ej1;

public class Lampara {
    private boolean encendida;
    private String color;

    public Lampara(){
        encendida = false;
        color = "blanco";
    }

    public Lampara(String color){
        this();
        this.color = color;
    }

    private void cambiarEstado(boolean estado){
        encendida = estado;
    }

    public void encender(){
        cambiarEstado(true);
    }

    public void apagar(){
        cambiarEstado(false);
    }

    @Override
    public String toString() {
        String cadena;

        if(encendida)
            cadena = "Lampara encendida";
        else
            cadena = "Lampara apagada";

        return "Lampara{" +
                cadena +
                ", color='" + color + '\'' +
                '}';
    }
}
