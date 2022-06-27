public class CuentaBasica implements ICuenta {

    private String nombrePropietario;
    private Double monto;

    public CuentaBasica(String nombrePropietario, Double monto){
        this.nombrePropietario = nombrePropietario;
        this.monto=monto;
    }
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
    @Override
    public Double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void showInfo(){
        System.out.println("Nombre Propietario: "+nombrePropietario);
        System.out.println("Monto: "+monto);
        System.out.println();
    }
}
