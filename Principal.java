
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Gimnasio gym = new Gimnasio();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar Miembro");
            System.out.println("2. Agregar Entrenador");
            System.out.println("3. Agregar Rutina");
            System.out.println("4. Asignar Entrenador a Miembro");
            System.out.println("5. Asignar Rutina a Miembro");
            System.out.println("6. Mostrar Rutina con más practicantes");
            System.out.println("7. Mostrar número de rutinas activas");
            System.out.println("8. Mostrar Entrenador con más alumnos");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del miembro: ");
                    String nombreM = sc.nextLine();
                    System.out.print("Tipo de membresía: ");
                    String tipo = sc.nextLine();
                    gym.agregarMiembro(nombreM, tipo);
                    break;
                case 2:
                    System.out.print("Nombre del entrenador: ");
                    String nombreE = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String esp = sc.nextLine();
                    gym.agregarEntrenador(nombreE, esp);
                    break;
                case 3:
                    System.out.print("Nombre de la rutina: ");
                    String nomR = sc.nextLine();
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Nivel de dificultad: ");
                    String dif = sc.nextLine();
                    gym.agregarRutina(nomR, desc, dif);
                    break;
                case 4:
                    System.out.print("ID Miembro: ");
                    int idM = sc.nextInt();
                    System.out.print("ID Entrenador: ");
                    int idE = sc.nextInt();
                    System.out.println(gym.asignarEntrenadorAMiembro(idM, idE) ? "Asignado!" : "Error.");
                    break;
                case 5:
                    System.out.print("ID Miembro: ");
                    int idMm = sc.nextInt();
                    System.out.print("ID Rutina: ");
                    int idR = sc.nextInt();
                    System.out.println(gym.asignarRutinaAMiembro(idMm, idR) ? "Asignado!" : "Error.");
                    break;
                case 6:
                    System.out.println("Rutina con más practicantes: " + gym.getRutinaConMasPracticantes());
                    break;
                case 7:
                    System.out.println("Número de rutinas activas: " + gym.getNumeroRutinasActivas());
                    break;
                case 8:
                    System.out.println("Entrenador con más alumnos: " + gym.getEntrenadorConMasAlumnos());
                    break;
            }
        } while (opcion != 9);
    }
}
