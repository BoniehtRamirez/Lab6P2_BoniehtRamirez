package lab6_boniehtramirez;

public class Alumno extends Usuario{
    private String ID,carrera;
    private int edad, año;
    private double promedio;

    public Alumno(String ID, String carrera, int edad, int año, double promedio, String nombre, String apellido, String numeroRegistro, String usuario, String contraseña, String facultad) {
        super(nombre, apellido, numeroRegistro, usuario, contraseña, facultad);
        this.ID = ID;
        this.carrera = carrera;
        this.edad = edad;
        this.año = año;
        this.promedio = promedio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
    
}
