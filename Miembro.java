import java.util.ArrayList;

public class Miembro {

    private int id;
    private String nombre;
    private String tipoMembresia;
    private Entrenador EntrenadorAsignado;
    private ArrayList<Rutina> rutinasAsignadas;



    public Miembro(int id, String nombre, String tipoMembresia) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMembresia = tipoMembresia;
        this.EntrenadorAsignado = null;
        this.rutinasAsignadas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }   

    public String getNombre() {
        return nombre;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setEntrenadorAsignado(Entrenador entrenador) {
        this.EntrenadorAsignado = entrenador;
    }   

    public void agregarRutina(Rutina rutina) {
        if (!rutinasAsignadas.contains(rutina)) {
            rutinasAsignadas.add(rutina);
        }
    }
    
    public ArrayList<Rutina> getRutinasAsignadas() {
        return rutinasAsignadas;
    }


    @Override
    public String toString() {
        return "Miembro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoMembresia='" + tipoMembresia + '\'' +
                ", EntrenadorAsignado=" + (EntrenadorAsignado != null ? EntrenadorAsignado.getNombre() : "Ninguno") +
                ", rutinasAsignadas=" + rutinasAsignadas +
                '}';
    }

    
}
