public class Client {
    public static void main(String[] args) {
        Librecambista librecambista=new Librecambista();

        Argentina argentina = new Argentina();
        argentina.setCambio(30.50, "pesos");
        argentina.accept(librecambista);

        Bolivia bolivia=new Bolivia();
        bolivia.setCambio(50.20,"bs");
        bolivia.accept(librecambista);

        Italia italia = new Italia();
        italia.setCambio(100.00, "euros");
        italia.accept(librecambista);

        Brasil brasil = new Brasil();
        brasil.setCambio(90.80, "real brasileno");
        brasil.accept(librecambista);

    }
}
