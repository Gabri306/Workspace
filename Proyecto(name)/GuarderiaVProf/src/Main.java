import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Nino nino1 = new Nino("juhfua",2,"F","251384","N/A","N/A","N/A");
        Nino nino2 = new Nino("jbijnil",6,"M","15461384","N/A","N/A","N/A");
        Nino nino3 = new Nino("nhbajda",8,"F","2554584","N/A","N/A","N/A");
        Nino nino4 = new Nino("baskdhijdso",5,"M","2487961384","N/A","N/A","N/A");
        Nino nino5 = new Nino("lonkb",3,"F","25138531","N/A","N/A","N/A");

        int cantidadNinos = 2;
        ArrayList<Nino> listaNinos = new ArrayList<>();
        listaNinos.add(nino1);
        listaNinos.add(nino2);
        listaNinos.add(nino3);
        listaNinos.add(nino4);
        listaNinos.add(nino5);

        for (int i = 1;i<cantidadNinos; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad"));
            String genero = JOptionPane.showInputDialog("Ingrese su genero");
            String identificacion = JOptionPane.showInputDialog("Ingrese la identificacion");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias");
            String nombreAcuandiente = JOptionPane.showInputDialog("Ingrese el nombre del acuedinte");
            String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto de acudiente");

            Nino newNino = new Nino(nombre, edad, genero, identificacion, alergias, nombreAcuandiente, contactoAcudiente);
            JOptionPane.showMessageDialog(null, newNino);
            listaNinos.add(newNino);
        }
    }

}