public class Client {
    public static void main(String[] args){
        Aplicacion app = new Aplicacion();

        Celular celular = new Celular("Samsung S22 Ultra", 8, 6.5, 108, 3200, 6);
        Computadora computadora = new Computadora("Lenovo", 8, 15.6, 36, 3200, 8);
        Televisor televisor = new Televisor("Samsung Smart TV", 32, 1080.0, 4, 2, 2);

        app.appCelular(celular);
        app.appComputadora(computadora);
        app.appTv(televisor);
    }
}
