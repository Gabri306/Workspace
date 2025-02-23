import org.w3c.dom.ls.LSOutput;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Pequeños Gigantes", "18796");
        ArrayList<Nino> listaNinos = new ArrayList<Nino>();
        guarderia.setListaNinos(listaNinos);

        String menu;
        do {
            menu = JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Crear un Niño\n" +
                    "2. Actualizar un Niño\n" +
                    "3. Eliminar un Niño\n" +
                    "4. Mostrar lista de niños mayores a cinco años\n" +
                    "0. Salir");

            switch(menu) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    String genero = JOptionPane.showInputDialog("Ingrese el género");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación");
                    String alergias = JOptionPane.showInputDialog("Ingrese las alergias");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
                    String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto del acudiente");
                    Nino nino = new Nino(nombre, edad, genero, identificacion, alergias, nombreAcudiente, contactoAcudiente);
                    guarderia.agregarNino(nino);
                    break;
                case "2":
                    String actualizarIdentificacion = JOptionPane.showInputDialog("Ingrese la identificación del niño");
                    String actualizarNombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    int actualizarEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    String actualizarGenero = JOptionPane.showInputDialog("Ingrese el genero");
                    String actualizarAlergias = JOptionPane.showInputDialog("Ingrese las alergias");
                    String actualizarNombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
                    String actualizarContactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto del acudiente");
                    guarderia.actualizarNino(actualizarNombre, actualizarEdad, actualizarGenero, actualizarIdentificacion, actualizarAlergias, actualizarNombreAcudiente, actualizarContactoAcudiente);
                    break;

                case "3":
                    String id = JOptionPane.showInputDialog("ingrese la identificacion del niño");
                    Nino ninoEliminar = guarderia.validarNino(id);
                    if (ninoEliminar != null) {
                        guarderia.eliminarNino(ninoEliminar);
                        JOptionPane.showMessageDialog(null, "Niño eliminado");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el niño");
                    }

                case "4":
                    ArrayList<Nino> ninosMayores5 = guarderia.ninosMayores5();
                    if (ninosMayores5.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay niños para mostrar");
                    }
                    for (Nino ninoMayor : ninosMayores5) {
                        JOptionPane.showMessageDialog(null, ninoMayor.toString());
                    }

                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
                    break;
            }
        } while (!menu.equals("0"));
    }
}