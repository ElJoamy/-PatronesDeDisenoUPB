public class Person {
    private String nombre;
    private int telefono;
    private int ci;

    public Person(String nombre, int telefono, int ci) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCi() {
        return ci;
    }

    public void showInfo() {
        System.out.println("La persona " + nombre + " con cedula " + ci + " y telefono " + telefono + " desea hacer un envio de un paquete con la: " );
    }
}