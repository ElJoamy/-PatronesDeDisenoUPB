public class Pay {
    private String detalles;
    private String type;
    private double monto;

    public Pay(String detalles, String type, double monto) {
        this.detalles = detalles;
        this.type = type;
        this.monto = monto;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getType() {
        return type;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void showInfo(){
        System.out.println("Detalles del pago: " + detalles);
        System.out.println("Tipo de moneda: " + type);
        System.out.println("Monto: " + monto);
    }
}
