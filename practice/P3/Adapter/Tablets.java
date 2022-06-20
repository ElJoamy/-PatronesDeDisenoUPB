public class Tablets implements IArtefactos{
    private int precio;
    private String tiempoDeVida;

    public Tablets(int precio, String tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("Precio de la tablet: " + precio);
    }

    @Override
    public void showTiempo() {
        System.out.println("Tiempo de vida de la tablet: " + tiempoDeVida);
    }
}
