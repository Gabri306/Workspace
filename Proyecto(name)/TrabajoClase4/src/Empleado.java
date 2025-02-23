import java.util.Date;

public class Empleado {
    private String nombre;
    private String identificacion;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;

    public Empleado(String nombre, String identificacion, String puesto, String correo, String telefono, String fechaContratacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public String getIdentificacion(){
        return identificacion;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
    return puesto;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getCorreo(){
        return correo;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }

    public void setFechaContratacion(String fechaContratacion){
        this.fechaContratacion = fechaContratacion;
    }
    public String getFechaContratacion(){
        return fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado:" +'\n'+
                "nombre='" + nombre + '\n' +
                ", identificacion='" + identificacion + '\n' +
                ", puesto='" + puesto + '\n' +
                ", correo='" + correo + '\n' +
                ", telefono='" + telefono + '\n' +
                ", fechaContratacion='" + fechaContratacion + '\n' +
                '}';

    }
}
