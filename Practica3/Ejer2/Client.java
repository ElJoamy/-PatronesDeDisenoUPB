public class Client {
    public static void main(String[] args){
        IPago efectivo = new Efectivo();
        IPago transferencia = new Transferencia();
        IPago tigoMoney = new TigoMoney();
        IPago aplicacion = new Aplicacion();

        IAgua iAgua = new IAgua(100.0);
        IAlcantarillado iAlcantarillado = new IAlcantarillado(250.0);
        IElectrica iElectrica = new IElectrica(300.0);

        iAgua.setPago(efectivo);
        iAgua.payInstalation();

        iAgua.setPago(aplicacion);
        iAgua.payInstalation();

        iAlcantarillado.setPago(transferencia);
        iAlcantarillado.payInstalation();

        iElectrica.setPago(tigoMoney);
        iElectrica.payInstalation();

    }
}
