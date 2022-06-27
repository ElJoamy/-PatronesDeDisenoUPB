public class Bpi extends Decorator {
    private boolean enable;

    public Bpi(ICuenta componente,boolean enable){
        super(componente);
        this.enable = enable;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("La banca por internet esta activa: " + enable);
    }

    @Override
    public Double getMonto() {
        return super.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        super.setMonto(monto);
    }
}
