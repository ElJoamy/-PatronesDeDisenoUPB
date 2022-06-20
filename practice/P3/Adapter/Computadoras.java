public class Computadoras implements IArtefactos{
    private int precio;
    private String tiempoDeVida;

    public Computadoras(int precio, String tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("Precio de la computadora: " + precio);
    }

    @Override
    public void showTiempo() {
        System.out.println("Tiempo de vida de la computadora: " + tiempoDeVida);
    }
}
