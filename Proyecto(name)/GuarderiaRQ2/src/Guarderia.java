import java.util.ArrayList;

public class Guarderia {
    private String name;
    private String nit;
    public ArrayList<Nino> listaNinos;

    public void agregarNino(Nino newNino) {
        listaNinos.add(newNino);
    }

    public void eliminarNino(Nino Antnino) {
        listaNinos.remove(Antnino);
    }

    public Nino validarNino(String identificacion) {
        for (Nino n : listaNinos) {
            if (n.getIdentificacion().equals(identificacion)) {
                return n;
            }
        }
        return null;
    }

    public void actualizarNino(String nombre, int edad, String genero, String identificacion, String alergias, String nombreAcudiente, String contactoAcudiente) {
        for (Nino nino : listaNinos) {
            if (nino.getIdentificacion().equals(identificacion)) {
                nino.setNombre(nombre);
                nino.setEdad(edad);
                nino.setGenero(genero);
                nino.setIdentificacion(identificacion);
                nino.setAlergias(alergias);
                nino.setNombreAcudiente(nombreAcudiente);
                nino.setContactoAcudiente(contactoAcudiente);
            }
            break;
        }
    }

    public void listarNinos() {
        for (Nino nino : listaNinos) {
            System.out.println("Estudiante"+listaNinos.indexOf(nino)+""+nino);
        }
    }

    public ArrayList<Nino> ninosMayores5(){
        ArrayList<Nino> ninosMayores5 = new ArrayList<>();
        for(Nino nino : listaNinos){
            if(nino.getEdad()>5){
                ninosMayores5.add(nino);
            }
        }
        return ninosMayores5;
    }



    public Guarderia(String name, String nit) {
        this.name = name;
        this.nit = nit;
        listaNinos = new ArrayList<>();
    }

    public String getNit() {
        return nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setListaNinos(ArrayList<Nino> listaNinos) {
        this.listaNinos = listaNinos;
    }

    public Guarderia(ArrayList<Nino> listaNinos) {
        this.listaNinos = listaNinos;
    }


    @Override
    public String toString() {
        return "Guarderia{" +
                "name='" + name + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
}
