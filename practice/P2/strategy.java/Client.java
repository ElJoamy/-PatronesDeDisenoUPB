public class Client {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.addRopa(new Ropa("Camisas", 10));
        tienda.addRopa(new Ropa("Pantalones", 20));
        tienda.addRopa(new Ropa("Zapatos", 30));
        tienda.addRopa(new Ropa("Poleras", 40));
        tienda.addRopa(new Ropa("Bolsos", 50));
        tienda.addRopa(new Ropa("Bufandas", 60));
        tienda.addRopa(new Ropa("Sombreros", 70));

        tienda.setStrategy(new Invierno());
        tienda.startStrategy();
        tienda.setStrategy(new Verano());
        tienda.startStrategy();
        tienda.setStrategy(new Primavera());
        tienda.startStrategy();
        tienda.setStrategy(new Otono());
        tienda.startStrategy();
    }
}
