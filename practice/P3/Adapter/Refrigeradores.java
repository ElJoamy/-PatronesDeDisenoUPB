public class Refrigeradores implements IArtefactosE{
    private int precio;
    private String tiempoDeGarantia;

    public Refrigeradores(int precio, String tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("Precio del refrigerador: " + precio);
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("Tempo de garantia del refrigerador " + tiempoDeGarantia);
    }

}
