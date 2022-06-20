public class Televisores implements IArtefactosE{
    private int precio;
    private String tiempoDeGarantia;

    public Televisores(int precio, String tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("Precio del televisor: " + precio);
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("Tempo de garantia del televisor: " + tiempoDeGarantia);
    }

}
