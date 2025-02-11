public class Estiante {
    String nombre;
    String identificacion;
    String correo;
    String edad;

    public Estiante(String nombre, String idetificacion, String correo, String edad) {
        this.nombre = nombre;
        this.identificacion = idetificacion;
        this.correo = correo;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdetificacion() {
        return identificacion;
    }
    public void setIdendificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

}

