import javax.swing.*;
import java.util.LinkedList;

public class Main{

    public LinkedList<Estudiante>
            listaEstudiantes = new LinkedList<>();

    public Main(){
        listaEstudiantes = new LinkedList<>();
    }

    Estudiante est1 = new Estudiante("Pablo","60","4.6","1087616938");
    Estudiante est2 = new Estudiante("Diego","15","4.3","1087616938");
    Estudiante est3 = new Estudiante("juan","25","0.0","1087616932");
    Estudiante est4 = new Estudiante("juanito","3","3.0","1087616934");

    public boolean crearEstudiante(Estudiante nuevoEstudiante){
        for (Estudiante estudiante : listaEstudiantes){
            if (nuevoEstudiante.getIdentificacion().equals(estudiante.getIdentificacion())) {
                System.out.println("El estudiante ya existe");
                return false;
            }
        }
        listaEstudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante agregado correctamente");
        return true;
    }

    public boolean eliminarEstudiante(Estudiante estudianteAnt){
        for (Estudiante estudiante : listaEstudiantes){
            if (estudianteAnt.getIdentificacion().equals(estudiante.getIdentificacion())){
                System.out.println("estudiante eliminado");
                listaEstudiantes.remove(estudiante);
                return true;
            }
        }
        System.out.println("Estudiante no existe");
        return false;
    }

    public String listaEstudiantes(){
        String estudiantes = "";
        for (Estudiante estudiante : listaEstudiantes){
            estudiantes += estudiante.toString() + "\n";
        }
        return estudiantes;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.crearEstudiante(main.est1);
        main.crearEstudiante(main.est2);
        main.crearEstudiante(main.est3);
        main.eliminarEstudiante(main.est1);
        main.crearEstudiante(main.est2);
        System.out.println(main.listaEstudiantes());
    }
}

