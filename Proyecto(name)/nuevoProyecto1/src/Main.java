
/*
* programa que con una lista de estudiantes dado la identificaion nos muestre el estudiante correspódniente */

import java.util.LinkedList;
public class Main{

    public LinkedList<Estiante> listaEstudiantes;

    public Main() {
        listaEstudiantes = new LinkedList<>();
        Estiante estu1 = new Estiante("Juan Pelaez", "1087616938", "pjuan@uq.edu.co", "19");
        listaEstudiantes.add(estu1);
    }
}
