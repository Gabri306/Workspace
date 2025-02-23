public class Nino {
    public String nombre;
    public int edad;
    public String genero;
    public String identificacion;
    public String alergias;
    public String nombreAcudiente;
    public String contactoAcudiente;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public String getContactoAcudiente() {
        return contactoAcudiente;
    }

    public void setContactoAcudiente(String contactoAcudiente) {
        this.contactoAcudiente = contactoAcudiente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public Nino(String nombre, int edad, String genero, String identificacion, String alergias, String nombreAcudiente, String contactoAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.contactoAcudiente = contactoAcudiente;
    }

    @Override
    public String toString() {
        return "Niños{" +
                "nombre='" + nombre + '\n' +
                ", edad=" + edad +
                ", genero='" + genero + '\n' +
                ", identificacion='" + identificacion + '\n' +
                ", alergias='" + alergias + '\n' +
                ", nombreAcudiente='" + nombreAcudiente + '\n' +
                ", contactoAcudiente='" + contactoAcudiente + '\n' +
                '}';
    }
}
