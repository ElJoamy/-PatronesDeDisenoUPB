public class Client {
    public static void main(String[] args) {
        ICuenta basicAccount = new CuentaBasica("Aiden",2000.0);
        basicAccount = new Bpi(basicAccount,true);
        basicAccount = new Seguro(basicAccount);
        basicAccount = new Promocion(basicAccount);
        basicAccount.showInfo();
    }
}
