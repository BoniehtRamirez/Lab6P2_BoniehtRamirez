package lab6_boniehtramirez;

import java.util.ArrayList;

public class Clase {
    private String nombre, seccion, codigo, codigoCarrera;
    private int maxAlumnos, numeroAula;
    private ArrayList<Proyecto> proyectos = new ArrayList();
    private ArrayList<Alumno> alumnosMatriculados = new ArrayList();

    public Clase(String nombre, String seccion, String codigo, String codigoCarrera, int maxAlumnos, int numeroAula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.codigoCarrera = codigoCarrera;
        this.maxAlumnos = maxAlumnos;
        this.numeroAula = numeroAula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<Alumno> getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    public void setAlumnosMatriculados(ArrayList<Alumno> alumnosMatriculados) {
        this.alumnosMatriculados = alumnosMatriculados;
    }
    
    
}
