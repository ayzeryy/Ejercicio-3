import java.util.ArrayList; 

public class Entrenador {

    private int id;
    private String nombre;
    private String especialidad;
    private ArrayList<Miembro> miembrosAsignados;



    public Entrenador(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.miembrosAsignados = new ArrayList<>();
    }   

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void agregarMiembro(Miembro miembro) {
        if (!miembrosAsignados.contains(miembro)) {
            miembrosAsignados.add(miembro);
            miembro.setEntrenadorAsignado(this);
        }
    }

    public ArrayList<Miembro> getMiembrosAsignados() {
        return miembrosAsignados;
    }

    public  int contarMiembros() {
        return miembrosAsignados.size();
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", miembrosAsignados=" + miembrosAsignados.size() +
                '}';
    }
    
}
