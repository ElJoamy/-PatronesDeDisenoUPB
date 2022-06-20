public class Lavadoras implements IArtefactosE{
    private int precio;
    private String tiempoDeGarantia;

    public Lavadoras(int precio, String tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("Precio de la lavadora: " + precio);
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("Tiempo de garantia de la lavadora: " + tiempoDeGarantia);
    }

}
