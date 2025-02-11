public class Estudiante {
    String nombre;
    String edad;
    String nota;
    String identificacion;

    public Estudiante(String nombre, String edad, String nota, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }

    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nNota: "+nota +"\nIdentificacion: "+identificacion;
    }

    public String getIdentificacion() {
        return identificacion;

    }
     public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
     }
}
