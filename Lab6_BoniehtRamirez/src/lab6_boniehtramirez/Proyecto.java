package lab6_boniehtramirez;

public class Proyecto {
    private String titulo, descripcion, puntuacion, duración, fechaEntrega;
    private int dificultad, maxParticipantes;

    public Proyecto(String titulo, String descripcion, String puntuacion, String duración, String fechaEntrega, int dificultad, int maxParticipantes) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.duración = duración;
        this.fechaEntrega = fechaEntrega;
        this.dificultad = dificultad;
        this.maxParticipantes = maxParticipantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }
    
    
}
