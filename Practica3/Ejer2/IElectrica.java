public class IElectrica implements Instalacion {
    private IPago pago;
    private Double precio;

    public IElectrica(Double precio) {
        this.precio = precio;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    @Override
    public void payInstalation() {
        System.out.println("<=====Se esta pagando por la instalacion electrica=====>");
        pago.pay(precio);
    }
}
