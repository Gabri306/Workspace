public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "123456789", "Gerente", "<EMAIL>", "666666666", "29/12/06");

        Empleado empleado2 = new Empleado("Julian","123456788","Administrador","julian123@gmail.com","66666666", "29/12/08");
        System.out.println(empleado1.toString()+" "+empleado2.toString());
    }

}