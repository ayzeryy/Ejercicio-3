import java.util.ArrayList;

public class Gimnasio {

    private ArrayList<Miembro> miembros;
    private ArrayList<Entrenador> entrenadores;
    private ArrayList<Rutina> rutinas;  
    private int siguienteIdMiembro;
    private int siguienteIdEntrenador;
    private int siguienteIdRutina;

    public Gimnasio() {
        this.miembros = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
        this.rutinas = new ArrayList<>();
        this.siguienteIdMiembro = 1;
        this.siguienteIdEntrenador = 1;
        this.siguienteIdRutina = 1;
    }

    public Miembro agregarMiembro(String nombre, String tipoMembresia) {
        Miembro nuevoMiembro = new Miembro(siguienteIdMiembro++, nombre, tipoMembresia);
        miembros.add(nuevoMiembro);
        return nuevoMiembro;
    }

    public Entrenador agregarEntrenador(String nombre, String especialidad) {
        Entrenador nuevoEntrenador = new Entrenador(siguienteIdEntrenador++, nombre, especialidad);
        entrenadores.add(nuevoEntrenador);
        return nuevoEntrenador;
    }

    public Rutina agregarRutina(String nombre, String descripcion, String nivelDificultad, Boolean activa) {
        Rutina nuevaRutina = new Rutina(siguienteIdRutina++, nombre, descripcion, nivelDificultad, activa);
        rutinas.add(nuevaRutina);
        return nuevaRutina;
    }

    public boolean asignarEntrenadorAMiembro(int idMiembro, int idEntrenador) {
        Miembro miembro = buscarMiembroPorId(idMiembro);
        Entrenador entrenador = buscarEntrenadorPorId(idEntrenador);
        if (miembro != null && entrenador != null) {
            entrenador.agregarMiembro(miembro);
            return true;
        }
        return false;
    }

    private Miembro buscarMiembroPorId(int id) {
        for (Miembro miembro : miembros) {
            if (miembro.getId() == id) {
                return miembro;
            }
        }
        return null;
    }

    private Entrenador buscarEntrenadorPorId(int id) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getId() == id) {
                return entrenador;
            }
        }
        return null;
    }

    private Rutina buscarRutinaPorId(int id) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id) {
                return rutina;
            }
        }
        return null;
    }

    public Rutina getRutinaConMasPracticantes() {
        if (rutinas.isEmpty()) return null;
        
        Rutina rutinaMasPopular = rutinas.get(0);
        for (Rutina rutina : rutinas) {
            if (rutina.getCantidadPracticantes() > rutinaMasPopular.getCantidadPracticantes()) {
                rutinaMasPopular = rutina;
            }
        }
        return rutinaMasPopular;
    }
    
    /**
     * Cuenta el número total de rutinas activas
     * @return Número de rutinas actualmente disponibles
     */
    public int getNumeroRutinasActivas() {
        int contador = 0;
        for (Rutina rutina : rutinas) {
            if (rutina.isActiva()) {
                contador++;
            }
        }
        return contador;
    }
    
    /**
     * Identifica el entrenador con mayor cantidad de alumnos
     * @return Entrenador con más miembros asignados o null si no hay entrenadores
     */
    public Entrenador getEntrenadorConMasAlumnos() {
        if (entrenadores.isEmpty()) return null;
        
        Entrenador entrenadorConMasAlumnos = entrenadores.get(0);
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCantidadMiembros() > entrenadorConMasAlumnos.getCantidadMiembros()) {
                entrenadorConMasAlumnos = entrenador;
            }
        }
        return entrenadorConMasAlumnos;
    }
    
    /**
     * Obtiene la lista completa de miembros
     * @return ArrayList con todos los miembros registrados
     */
    public ArrayList<Miembro> getMiembros() {
        return miembros;
    }
    
    /**
     * Obtiene la lista completa de entrenadores
     * @return ArrayList con todos los entrenadores registrados
     */
    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }
    
    /**
     * Obtiene la lista completa de rutinas
     * @return ArrayList con todas las rutinas registradas
     */
    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }
}

