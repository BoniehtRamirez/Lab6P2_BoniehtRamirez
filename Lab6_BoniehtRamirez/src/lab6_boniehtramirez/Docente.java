package lab6_boniehtramirez;

import java.util.ArrayList;

public class Docente extends Usuario{
    private String tituloU, tituloP;
    private int clasesImpartidas;
    private ArrayList<Proyecto> proyectosCreados = new ArrayList();

    public Docente(String tituloU, String tituloP, int clasesImpartidas, String nombre, String apellido, String numeroRegistro, String usuario, String contraseña, String facultad) {
        super(nombre, apellido, numeroRegistro, usuario, contraseña, facultad);
        this.tituloU = tituloU;
        this.tituloP = tituloP;
        this.clasesImpartidas = clasesImpartidas;
    }

    public String getTituloU() {
        return tituloU;
    }

    public void setTituloU(String tituloU) {
        this.tituloU = tituloU;
    }

    public String getTituloP() {
        return tituloP;
    }

    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    public int getClasesImpartidas() {
        return clasesImpartidas;
    }

    public void setClasesImpartidas(int clasesImpartidas) {
        this.clasesImpartidas = clasesImpartidas;
    }

    public ArrayList<Proyecto> getProyectosCreados() {
        return proyectosCreados;
    }

    public void setProyectosCreados(ArrayList<Proyecto> proyectosCreados) {
        this.proyectosCreados = proyectosCreados;
    }
    
}