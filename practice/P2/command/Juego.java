public class Juego {
    private String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void msgDisparar() {
        System.out.println("Disparando al enemigo");
    }

    public void msgDefender() {
        System.out.println("Defensa correctamente implementada");
    }

    public void msgAtacar() {
        System.out.println("Atacando correctamente");
    }

}
