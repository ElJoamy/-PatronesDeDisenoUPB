public class Celulares implements IArtefactos{
    private int precio;
    private String tiempoDeVida;

    public Celulares(int precio, String tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("Precio del celular: " + precio);
    }

    @Override
    public void showTiempo() {
        System.out.println("Tiempo de vida del celular: " + tiempoDeVida);
    }
}
