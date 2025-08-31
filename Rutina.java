import java.util.ArrayList;

public class Rutina {

    private int id;
    private String nombre;
    private String descripcion;
    private String nivelDificultad;
    private Boolean activa;
    private ArrayList<Miembro> practicantes;

    public Rutina(int id, String nombre, String descripcion, String nivelDificultad, Boolean activa) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.activa = activa;
        this.practicantes = new ArrayList<>();
    }   

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void agregarPracticante(Miembro miembro) {
        if (!practicantes.contains(miembro)) {
            practicantes.add(miembro);
            miembro.agregarRutina(this);
        }
    }

    public ArrayList<Miembro> getPracticantes() {
        return practicantes;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nivelDificultad='" + nivelDificultad + '\'' +
                ", activa=" + activa +
                ", practicantes=" + practicantes.size() +
                '}';
    }

    
}
