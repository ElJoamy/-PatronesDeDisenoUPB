public class Seguro extends Decorator {

    private double descontar = 25.0;
    
    public Seguro(ICuenta componente){
        super(componente);
    }

    public void showInfo() {
        System.out.println("Descontando: "+ descontar + " por motivos de seguro");
        super.setMonto(super.getMonto()-descontar);
        super.showInfo();
    }
}